package hppgkide.ui;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.Utilities;

/**
 *
 * @author JorgeAntonio
 */
public class Documento extends JScrollPane{
    char docType;
    String docPath, docDir, docName;
    String docContent;
    boolean docChanged;
    boolean docIsNew;
    
    protected JLabel row, col;
    protected JTextPane docEditor;
    
   
     /**
     * colorear
     */
    private int findLastNonWordChar (String text, int index) {
        while (--index >= 0) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
        }
        return index;
    }

    private int findFirstNonWordChar (String text, int index) {
        while (index < text.length()) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
            index++;
        }
        return index;
    }
    
    
    public Documento(){
        this.docType = '#';
        this.docPath = this.docDir = this.docName = this.docContent = "";
        this.docChanged = true;
        this.docIsNew = true;
        
    }
    
    public void construirDocumento(char type, String path, String dir, String name, JLabel r, JLabel c){
        this.docType = type;
        this.docPath = path;
        this.docDir = dir;
        this.docName = name;
        this.row = r;
        this.col = c;
        
        final StyleContext cont = StyleContext.getDefaultStyleContext();
        final AttributeSet attr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.RED);
        final AttributeSet attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);
        
        DefaultStyledDocument doc = new DefaultStyledDocument() {
            public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
                super.insertString(offset, str, a);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offset);
                if (before < 0) before = 0;
                int after = findFirstNonWordChar(text, offset + str.length());
                int wordL = before;
                int wordR = before;

                while (wordR <= after) {
                    if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                        if (text.substring(wordL, wordR).matches("(\\W)*(private|public|protected)"))
                            setCharacterAttributes(wordL, wordR - wordL, attr, false);
                        else
                            setCharacterAttributes(wordL, wordR - wordL, attrBlack, false);
                        wordL = wordR;
                    }
                    wordR++;
                }
            }

            public void remove (int offs, int len) throws BadLocationException {
                super.remove(offs, len);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offs);
                if (before < 0) before = 0;
                int after = findFirstNonWordChar(text, offs);

                if (text.substring(before, after).matches("(\\W)*(private|public|protected)")) {
                    setCharacterAttributes(before, after - before, attr, false);
                } else {
                    setCharacterAttributes(before, after - before, attrBlack, false);
                }
            }
        };
        
        
        this.docEditor = new JTextPane(doc);
        this.docEditor.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                row.setText(getRow(e.getDot(), (JTextPane)e.getSource()) + "");
                col.setText(getColumn(e.getDot(), (JTextPane) e.getSource()) + "");
            }
        });
        
        
        //this.docEditor.setTabSize(4);
        
        this.setViewportView(this.docEditor);
        TextLineNumber textLineNumber = new TextLineNumber(docEditor);
        this.setRowHeaderView(textLineNumber);
        this.setToolTipText(this.docPath);
    }    
    
    
    
    
    public void reiniciarEscucha(){
        docChanged = false;
    }
    
    
    
    
    private static int getRow(int pos, JTextPane editor) {
        int rn = (pos == 0) ? 1 : 0;
        try {
            int offs = pos;
            while(offs > 0) {
                offs = Utilities.getRowStart(editor, offs) - 1;
                rn++;
            }
        } catch (BadLocationException e) {
            System.err.println(e.getMessage());
        }
        return rn;
    }

    private static int getColumn(int pos, JTextPane editor) {
        try {
            return pos - Utilities.getRowStart(editor, pos) + 1;
        } catch (BadLocationException e) {
            System.err.println(e.getMessage());
        }
        return -1;
    }
    
    public void escucharCambios(){
        this.docEditor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!docChanged){
                    docChanged = true;
                    docName += "*";
                    System.out.println("ha cambiado");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!docChanged){
                    docChanged = true;
                    docName += "*";
                    System.out.println("ha cambiado");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("changed");
            }
        });
    }
    
    
}
