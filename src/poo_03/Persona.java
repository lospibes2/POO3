package poo_03;
import java.util.Scanner;

public class Persona {
    protected int edadE;
    protected String nombreE;
    

    public Persona(String nombreE, int edadE) {
        this.edadE = edadE;
        this.nombreE = nombreE;
    }

    public int getEdadE() {
        return edadE;
    }

    public void setEdadE(int edadE) {
        this.edadE = edadE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }
     
     public String emitir(){
            return "\nNombre: " + this.getNombreE() + " \nEdad: " + this.getEdadE();
        
    }

}
