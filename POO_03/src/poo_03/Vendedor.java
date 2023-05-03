/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_03;

public class Vendedor extends Empleado{
    private double cantVendido;
    private int telefono;
    private Cliente cliente;

    public Vendedor(double cantVendido, String nombreE, int edadE, Sueldo sueldoB, int telefono, Cliente cliente) {
        super(nombreE, edadE, sueldoB);
        this.cantVendido = cantVendido;
    }

    public double getCantVendido() {
        return cantVendido;
    }
    
    
    
}
