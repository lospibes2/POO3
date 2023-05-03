
package poo_03;


public class Empleado extends Persona{
    private Sueldo sueldoB;
    
    public Empleado(String nombreE, int edadE, Sueldo sueldoB) {
        super(nombreE, edadE);
        this.sueldoB = sueldoB;
    }
    
    
}
