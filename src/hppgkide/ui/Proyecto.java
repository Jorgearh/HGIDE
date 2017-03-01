package hppgkide.ui;

/**
 *
 * @author JorgeAntonio
 */
public class Proyecto {
    
    static String nombre, permisos, compartido;
    
    public static void nuevo(){
          VentanaNuevoProyecto np = new VentanaNuevoProyecto();
          np.setVisible(true);
    }
    
    public static void importar(){
        
    }
    
    public static void publicar(){
        
    }
    
    
    
    public static void crearProyecto(String nombre, String permiso, String usuarios){
        String mensaje = "";
        String[] nombres;
        
        Proyecto.nombre = nombre;
        Proyecto.permisos = permiso;
        Proyecto.compartido = usuarios;
        
        mensaje += "Proyecto " + Proyecto.nombre + "=[\n" +
                "    Permiso = \"" + Proyecto.permisos + "\";\n";
        
        if(Proyecto.permisos.equals("Compartido")){
            nombres = usuarios.split(";");
            mensaje += "    Lista = \"" + nombres[0] + "\"";
            for(int i = 1; i < nombres.length; i++)
                mensaje += ", \"" + nombres[i] + "\"";
            mensaje += ";\n";
        }
        
        mensaje += "]\n";
        
        /***
         * ENVIAR PEETICIION AL SERVIDOR
         * 
         * RESPUESTA == OK --> PROYECTO CREADO
         * RESPUESTA != OK --> MOSTRAR MENSAJE DE ERROR
         * 
         */
        
        
        
    }
}
