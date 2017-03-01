package hppgkide.ui;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author JorgeAntonio
 */
public interface UI {
    
    /*
     *tipo de archivo 
     */
    char HASKELL = '0';
    char GRAPHIK = '1';
    
    /**
     * rutas de directorios
     */
    final String SOURCE_FILES = "SourceFiles\\";
    final String HK_DIRECTORY = SOURCE_FILES + "HkFiles\\";
    final String GK_DIRECTORY = SOURCE_FILES + "GkFiles\\";
    
    /***
     * filtro archivos haskell++ y graphik
     */
    final FileNameExtensionFilter FILTRO = new FileNameExtensionFilter("Archivos H++,Gk (*.hk, *.gk)", "hk", "gk");;
    
    
    /***
     * permisos
     */
    final char PRIVADO = '1';
    final char COMPARTIDO = '2';
    final char PUBLICO = '3';
    
}
