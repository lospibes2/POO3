/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_03;

/**
 *
 * @author ET36
 */
public class Directivo extends Empleado {
    
    private Empleado[] empleados;
    private String categoria;
    
      
    public void Directivo(String categoria, Empleado[] listE){
        this.empleados=listE;
        this.categoria=categoria;
    }
    
    public double getSueldoN(){
        double sn=0.0;
        
        if (empleados.length > 10){
            sn = sueldo.calcularSueldoN()+sueldo.getSueldoB() * 10 / 100;
            
        }
        return sn;
    }
    
    public String emitir(){
        return "Sueldo: " + this.getSueldoN();
        
    }
}
