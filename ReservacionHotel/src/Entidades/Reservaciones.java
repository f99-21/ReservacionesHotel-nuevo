/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;


/**
 *
 * @author sando
 */
public class Reservaciones {
    
    
    public double Precio;
    public Date fecha;
    public String codigoHabitacion;
    
    public Reservaciones (Date pFecha, long pPrecio,String pCodigoHabitacion){
        
      
        this.Precio =pPrecio;
         this.fecha = pFecha;
         this.codigoHabitacion = pCodigoHabitacion;
    }
    
    
}
