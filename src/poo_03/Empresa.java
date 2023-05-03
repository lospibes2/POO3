/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_03;

public class Empresa {
    
    private Empleado[] empleados;
    private Cliente[] clientes;
    
    public Empresa(Empleado[] listaE, Cliente[] listaC) {
        this.empleados = listaE;
        this.clientes = listaC;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
        public String emitir(){
            for(int i=0; i < empleados.length; i++){
                this.empleados[i].emitir();
            }
            return emitir();
        }
}
