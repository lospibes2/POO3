
package poo_03;


public class Empleado extends Persona{
    protected Sueldo sueldo;
    
    public Empleado(String nombreE, int edadE, Sueldo sueldoB) {
        super(nombreE, edadE);
        this.sueldo = sueldoB;
    }
   
    public String emitir(){
        String datos= super.emitir() + "\n Sueldo basico: " + sueldo.getSueldoB();
        return datos;
    }
    public double getSueldoN(){
    
    
    }
    
}
