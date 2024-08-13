
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author sando
 */
public class Usuario {
    
    public String nombre;
    public String apellido;
    public String dui;
    
    public ArrayList<Reservaciones> lreservacion;

    // Constructor
    public Usuario(String pNombre,String pApellido,String pDui) {
        
        this.nombre = pNombre;
        this.apellido=pApellido;
        this.dui =pDui;
        this.lreservacion = new ArrayList<>();
    
    }
}
