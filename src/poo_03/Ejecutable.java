package poo_03;

import java.util.Scanner;

public class Ejecutable {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre;
        int edad, telefono, cant;
        double sueldoB;
        char respuesta;
        System.out.println("Ingrese la cantidad de empleados: ");
        cant = teclado.nextInt();
        
        Directivo directivo = new Directivo("Jose", 5, new Sueldo(43000), new Empleado[cant]);
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = teclado.next();
            System.out.println("Ingrese la edad: ");
            edad = teclado.nextInt();
            System.out.println("Ingrese el telefono: ");
            telefono = teclado.nextInt();
            System.out.println("Ingrese el sueldo: ");
            sueldoB = teclado.nextDouble();

            Sueldo sueldo = new Sueldo(sueldoB);
            System.out.println("¿Estuvo presente el mes? ");
            System.out.println("s o n");

            if (teclado.next().equals("n")) {
                sueldo.setRespPresentismo(false);
            }
            
            Vendedor vendedor = new Vendedor(nombre, edad, sueldo, telefono);
            directivo.agregarEmpleado(vendedor, i); 
            
        }
        
      
        System.out.println(directivo.emitir());
    }

}
