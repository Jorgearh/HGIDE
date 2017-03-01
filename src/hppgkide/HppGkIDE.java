package hppgkide;

import hppgkide.ui.IDE;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author JorgeAntonio
 */
public class HppGkIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (
                  ClassNotFoundException 
                | InstantiationException 
                | IllegalAccessException 
                | UnsupportedLookAndFeelException ex
                )
        {
            Logger.getLogger(HppGkIDE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        IDE ide = new IDE();
        ide.setExtendedState(JFrame.MAXIMIZED_VERT);
        ide.setVisible(true);
    }
    
}
