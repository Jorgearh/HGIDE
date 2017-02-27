package hppgkide.ui;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
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
    protected JTextArea docEditor;
    
   
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
        
        
        this.docEditor = new JTextArea();
        
        
        this.docEditor.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                row.setText(getRow(e.getDot(), (JTextArea)e.getSource()) + "");
                col.setText(getColumn(e.getDot(), (JTextArea) e.getSource()) + "");
            }
        });
        
        this.docEditor.setTabSize(4);
        this.setViewportView(this.docEditor);
        TextLineNumber textLineNumber = new TextLineNumber(docEditor);
        this.setRowHeaderView(textLineNumber);
        this.setToolTipText(this.docPath);
    }
    
    
    
    public void reiniciarEscucha(){
        docChanged = false;
    }
    
    
    
    
    private static int getRow(int pos, JTextArea editor) {
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

    private static int getColumn(int pos, JTextArea editor) {
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
