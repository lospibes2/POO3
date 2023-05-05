
package poo_03;


public class Empleado extends Persona{
    protected Sueldo sueldo;
    
    public Empleado(String nombreE, int edadE, Sueldo sueldoB) {
        super(nombreE, edadE);
        this.sueldo = sueldoB;
    }
   
    public String emitir(){
        String datos = super.emitir() + "Sueldo basico: " + sueldo.getSueldoB() + "\nSueldo neto: " + this.sueldo.calcularSueldoN();
        return datos;
    }

    public Sueldo getSueldo() {
        return sueldo;
    }

    public void setSueldo(Sueldo sueldo) {
        this.sueldo = sueldo;
    }
   
    
    
}
