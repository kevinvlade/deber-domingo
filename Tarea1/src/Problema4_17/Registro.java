/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema4_17;

/**
 *
 * @author kevin
 */
public class Registro {
    private double contador;
    private double kilometraje;
    private  double galones;

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getGalones() {
        return galones;
    }

    public double getContador() {
        return contador;
    }

    public void setContador(double contador) {
        this.contador = contador;
    }

    public void setGalones(double galones) {
        this.galones = galones;
    }
    


public void mostrarInformacion(){

System.out.println("contador viaje: "+ contador);
System.out.println("Kilometro recorrido: "+ kilometraje );
System.out.println("galones consumidos: "+galones);
System.out.println("kilometros por galon: "+(kilometraje/galones));


}
}