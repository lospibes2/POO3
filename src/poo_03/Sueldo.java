package poo_03;

import java.util.Scanner;

public class Sueldo {

    private double obraSocial;
    private double jubilacion;
    private double presentismo;
    private double sueldoB;
    private boolean respPresentismo = true;

    public Sueldo(double sueldoB) {
        this.sueldoB = sueldoB;
    }

  

    public double getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(double obraSocial) {
        this.obraSocial = obraSocial;
    }

    public double getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(double jubilacion) {
        this.jubilacion = jubilacion;
    }

    public double getPresentismo() {
        return presentismo;
    }

    public void setPresentismo(double presentismo) {
        this.presentismo = presentismo;
    }

    public double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(double sueldoB) {
        this.sueldoB = sueldoB;
    }
    
    public void calcularJubilacion() {
        this.jubilacion = this.sueldoB * 0.11;
    }

    public void calcularObraS() {
        this.obraSocial = this.sueldoB * 0.03;
    }

    public void calcularPresentismo() {
        this.presentismo = this.sueldoB * 0.1;
    }

    public boolean isRespPresentismo() {
        return respPresentismo;
    }

    public void setRespPresentismo(boolean respPresentismo) {
        this.respPresentismo = respPresentismo;
    }
    

    public double calcularSueldoN() {
        double sueldoN = this.sueldoB;
        this.calcularJubilacion();
        this.calcularObraS();
        this.calcularPresentismo();
        
        sueldoN -= this.jubilacion;
        sueldoN -= this.obraSocial;
        if(this.respPresentismo){
        sueldoN += this.presentismo;
        }
        return sueldoN;
    }
    
}
