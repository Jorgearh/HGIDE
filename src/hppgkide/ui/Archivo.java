package hppgkide.ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author JorgeAntonio
 */
public class Archivo implements UI{
    
    static JTabbedPane jtpEditor;
    static JLabel row, col;
    
    static HashMap<String, Documento> documentos;
    
    
    public static void crearDirectorios(){
        new File(UI.HK_DIRECTORY).mkdirs();
        new File(UI.GK_DIRECTORY).mkdirs();
    }
    
    
    public static void archivoNuevo(char type){
        Documento newDocument;
        String tempName;
        
        newDocument = new Documento();
        tempName = "Documento" + jtpEditor.getTabCount() + ".";
        tempName += type == HASKELL ? "hk" : "gk";
        
        newDocument.construirDocumento(type, HK_DIRECTORY + tempName, HK_DIRECTORY, tempName, row, col);
        newDocument.docEditor.setText("/*Nuevo Documento " + (type == HASKELL ? "Haskell++" : "GraphiK") + " */");
        newDocument.escucharCambios();
        
        registrarDocumento(newDocument);
    }
    
    public static void archivoAbrir(){
        JFileChooser chooser;
        int seleccion;
        File file;
        
        String texto = "";
        Documento doc;
        
        chooser = new JFileChooser(SOURCE_FILES);
        chooser.setFileFilter(filtro);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        seleccion = chooser.showOpenDialog(null);

        if(seleccion == JFileChooser.APPROVE_OPTION)
        {            
            file = chooser.getSelectedFile();
            
            if(!documentos.containsKey(file.getAbsolutePath())){
                texto = leerArchivo(file.getAbsolutePath());
            
                if(texto != null){
                    char tipo;
                    
                    tipo = (chooser.getTypeDescription(new File(file.getName()))).equals("hk") ? HASKELL : GRAPHIK;
                    doc = new Documento();
                    doc.construirDocumento(tipo, file.getAbsolutePath(), file.getParent(), file.getName(), row, col);
                    doc.docEditor.setText(texto);
                    doc.docChanged = false;
                    doc.docIsNew = false;
                    doc.escucharCambios();
                    
                    registrarDocumento(doc);
                }else{
                    
                }
            }else{
                
            }
        }
    }
    
    
    public static void guardar(){
        if(jtpEditor.getTabCount() > 0){
            Documento doc = (Documento) jtpEditor.getSelectedComponent();
            guardar(doc);
        }else{
            
        }
    }
    
    private static void guardar(Documento pestania){
        if(pestania.docIsNew){
            guardarComo(pestania);
            pestania.docIsNew = false;
        }else{
            if(pestania.docChanged){
                escribirArchivo(pestania);
                //reiniciar nombre del archivo
            }
        }
        
        pestania.reiniciarEscucha();      
        jtpEditor.setTitleAt(jtpEditor.getSelectedIndex(), pestania.docName);
        jtpEditor.setToolTipTextAt(jtpEditor.getSelectedIndex(), pestania.docPath);
    }
    
    public static void guardarComo(){
        
        if(jtpEditor.getTabCount() > 0){
            Documento pestania = new Documento();
            pestania = (Documento) jtpEditor.getSelectedComponent();
            
            String aux = pestania.docPath;
            documentos.remove(aux);
            
            guardarComo(pestania);
            
            pestania.reiniciarEscucha();      
            jtpEditor.setTitleAt(jtpEditor.getSelectedIndex(), pestania.docName);
            jtpEditor.setToolTipTextAt(jtpEditor.getSelectedIndex(), pestania.docPath);
        }else{
            
        }
        
    }
    
    public static void cerrarPestania(){
        if(jtpEditor.getTabCount() > 0){
            Documento pestania;
            
            pestania = (Documento) jtpEditor.getSelectedComponent();
            
            if(pestania.docChanged){
                int seleccion = JOptionPane.showConfirmDialog(null,
                        "Desea guardar los cambios en " + pestania.docName + "?",
                        "Cerrar Pestania", 
                        JOptionPane.YES_NO_CANCEL_OPTION, 
                        JOptionPane.WARNING_MESSAGE, 
                        null);
                
                if(seleccion == JOptionPane.YES_OPTION){
                    guardar();
                    jtpEditor.remove(pestania);
                    documentos.remove(pestania.docPath);
                }else if(seleccion == JOptionPane.NO_OPTION){
                    jtpEditor.remove(pestania);
                    documentos.remove(pestania.docPath);
                }
            }else{
                jtpEditor.remove(pestania);
                documentos.remove(pestania.docPath);
            }
        }
    }
    
    
    
    
    private static void guardarComo(Documento doc){
        
        JFileChooser chooser = new JFileChooser(SOURCE_FILES);
        chooser.setFileFilter(filtro);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        int seleccion = chooser.showSaveDialog(null);
        File file = chooser.getSelectedFile();

        if(seleccion == JFileChooser.APPROVE_OPTION){
            
            //String tipo = doc.docType == HASKELL ? ".hk" : ".gk";
            
            doc.docPath = file.getAbsolutePath();// + tipo;
            doc.docDir = file.getParent();
            doc.docName = file.getName();// + tipo;
            doc.updateUI();
            
            escribirArchivo(doc);
            
            documentos.put(doc.docPath, doc);
        }
    }
    
    private static void registrarDocumento(Documento newDocument){
        if(!documentos.containsKey(newDocument.docPath)){
            jtpEditor.addTab(newDocument.docName, null, newDocument, newDocument.docPath);
            documentos.put(newDocument.docPath, newDocument);
            jtpEditor.setSelectedComponent(newDocument);
        }
    }
    
    
    
    
    /**
     * Abre y lee el archivo especificado por path.
     * Retorna su contenido.
     * Retorna null si existe un problema.
     * @param path
     * @return 
     */
    private static String leerArchivo(String path){
        File f;
        FileReader fr;
        BufferedReader br;
        String linea;
        String texto;
        
        fr = null;
        texto = "";
        
        try{
            f = new File(path);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
            while((linea = br.readLine()) != null)
                texto += linea + "\n";
            
        }catch(IOException ioe){
            //Consola.write("Error leyendo archivo " + path + " \n" + ioe.getMessage());
            return null;
        }finally{
            try{
                if(null != fr)
                    fr.close();
            }catch(IOException ioe2){
                //Consola.write("Error cerrando fichero.\n" + ioe2.getMessage());
                return null;
            }
        }
        
        return texto;
    }
    
    /***
     * Recibe un objeto Documento y escribe el archivo especificado por docPath
     * con el contenido del JTextArea del objeto
     * @param doc 
     */
    private static void escribirArchivo(Documento doc){
        
        String contenido;
        FileWriter fw;
        BufferedWriter bw;
        
        contenido = doc.docEditor.getText();//<<

        try {
            fw = new FileWriter(doc.docPath);
            bw = new BufferedWriter(fw);

            bw.write(contenido);

            bw.close();
            fw.close();
            
            doc.reiniciarEscucha();
            
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
