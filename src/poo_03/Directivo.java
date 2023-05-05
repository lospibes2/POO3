package poo_03;

public class Directivo extends Empleado {
    
    private Empleado[] empleados;
   

    public Directivo(String nombreE, int edadE, Sueldo sueldoB, Empleado[] listE) {
        super(nombreE, edadE, sueldoB);
        this.empleados = listE;
     

    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public double getSueldoN() {
        double sn = 0.0;

        if (empleados.length > 10) {
            sn = this.sueldo.calcularSueldoN() + sueldo.getSueldoB() * 10 / 100;

        }
        return sn;
    }

    public String emitir() {
        String datos = "Empleado directivo: " + this.getNombreE() + " \nEdad: " + this.edadE + "\nSueldo: " + this.sueldo.calcularSueldoN() + "\nempleados: \n" ;
        for(int i = 0; i < this.empleados.length; i++) {
           datos += this.empleados[i].emitir();
            

        }
        return datos;
    }
    public void agregarEmpleado(Empleado emp, int i){
        this.empleados [i] = emp; 
    }
}
