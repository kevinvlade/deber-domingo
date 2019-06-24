/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema4_17;

import java.util.Collection;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author kevin
 */
public class Principal {

    public Principal() {
    }
    
     Collection<Registro>Registroviajes =new Vector();

    public Collection<Registro> getRegistroviajes() {
        return Registroviajes;
    }

    public void setRegistroviajes(Collection<Registro> Registroviajes) {
        this.Registroviajes = Registroviajes;
    }
    
    /** 
     * 
     */
    public void realizarRegistro(){
        Scanner input = new Scanner(System.in);
        Registro registro=new  Registro();
        System.out.println("Digite id del viaje");
        registro.setContador(input.nextInt());
        System.out.println("dijite el kilometraje recorrido");
        registro.setKilometraje(input.nextInt());
        System.out.println("digite los galones consumidos");
        registro.setGalones(input.nextInt());
        Registroviajes.add(registro);
    }
    /**
     *
     */
        public void mostrarInformaccionGeneral(){
            for(Registro registro:Registroviajes){
                registro.mostrarInformacion();
                
                
        }
        
        

        
    }
        /**
         *
         */
    public double calcularPromedioKG(){
    double suma=0;
     double promedio=0;
            
        
    for(Registro registro:Registroviajes){
    suma=suma+(registro.getKilometraje()/registro.getGalones());
        }
             promedio=suma/Registroviajes.size();
             return promedio;
    
}
}
