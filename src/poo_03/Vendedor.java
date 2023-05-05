/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_03;

public class Vendedor extends Empleado{
    
    private int telefono;
    private Cliente cliente;
   

    public Vendedor(String nombreE, int edadE, Sueldo sueldoB, int telefono) {
        super(nombreE, edadE, sueldoB);
        this.telefono = telefono;
    }

    
    public String emitir(){
        return super.emitir() + "\nEl contacto del empleado es: " + telefono;
    }
   
   
    
    
      
    
}
