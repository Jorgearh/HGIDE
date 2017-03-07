package hppgkide.ui;

import javax.swing.JLabel;
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
    
    public static JMenuItem jmiNuevo, jmiImportar, jmiPublicar, jmiLogin, jmiLogout, jmiRegistrar;
    public static JLabel jlUsuario;
    
    public static void iniciarSesion(){
        VentanaLogin login = new VentanaLogin();
        
        login.setTitle("Login");
        login.setLogin();
        login.setVisible(true);
        
        //iniciar(acceso);
    }
    
    public static void registrarUsuario(){
        VentanaLogin login = new VentanaLogin();
        
        login.setTitle("Registro");
        login.setRegistro();
        login.setVisible(true);
        
        
        
        
        //iniciar(acceso);
    }
    
    public static void cerrarSesion(){
        int seleccion = JOptionPane.showConfirmDialog(null,
                        "Desea cerrar la sesion para " + user + "?",
                        "Cerrar Sesion", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, 
                        null);
                
        if(seleccion == JOptionPane.YES_OPTION){
            user = "";
            password = "";
            jlUsuario.setText("Offline");
            iniciar(false);
        }
    }
    
    protected static void iniciar(boolean acceso){
        jmiNuevo.setEnabled(acceso);
        jmiImportar.setEnabled(acceso);
        jmiPublicar.setEnabled(acceso);
        
        jmiLogout.setEnabled(acceso);
        jmiRegistrar.setEnabled(!acceso);
        jmiLogin.setEnabled(!acceso);
        
    }
    
    
    /*consumir servicios web Usuario*/
    
    
    
}
