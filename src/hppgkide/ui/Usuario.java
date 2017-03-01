package hppgkide.ui;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author JorgeAntonio
 */
public class Usuario {
    static boolean onLine;
    static String user;
    static String password;
    
    public static JMenuItem jmiNuevo, jmiImportar, jmiPublicar, jmiLogin, jmiLogout;
    
    public static void login(){
        VentanaLogin login = new VentanaLogin();
        boolean acceso = true;
        
        login.setTitle("Login");
        login.setLogin();
        login.setVisible(true);
        
        iniciar(acceso);
    }
    
    public static void registro(){
        VentanaLogin login = new VentanaLogin();
        boolean acceso = true;
        
        login.setTitle("Registro");
        login.setRegistro();
        login.setVisible(true);
        
        iniciar(acceso);
    }
    
    public static void logout(){
        int seleccion = JOptionPane.showConfirmDialog(null,
                        "Desea cerrar la sesion para " + user + "?",
                        "Cerrar Sesion", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, 
                        null);
                
        if(seleccion == JOptionPane.YES_OPTION){
            user = "";
            password = "";
            iniciar(false);
        }
    }
    
    
    protected static void iniciar(boolean acceso){
        jmiNuevo.setEnabled(acceso);
        jmiImportar.setEnabled(acceso);
        jmiPublicar.setEnabled(acceso);
        
        jmiLogout.setEnabled(acceso);
        jmiLogin.setEnabled(!acceso);
        
    }
}
