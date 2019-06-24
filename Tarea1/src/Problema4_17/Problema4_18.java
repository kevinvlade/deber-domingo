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
public class Problema4_18 {
    public static void main(String[]args){
       
        Scanner input =new Scanner(System.in);
        int opcion=-1;
        Principal principal=new Principal();
        
        while(opcion!=0){
            System.out.println("1 ingresar registro");
            System.out.println("2 mostrar toda la informacion del rrecorrido del carro para todos los viajes y galones consumidos");
            System.out.println("3 calcular promedio  de kilometraje por galon");
            System.out.println();
            System.out.println("ingrese la opcion deseada");
            opcion =input.nextInt();
            
            switch(opcion){
                case 1:
                    principal.realizarRegistro();
                    break;
                case 2:
                    principal.mostrarInformaccionGeneral();
                    break;
                case 3:
                     System.out.println("kilometrage por galon general : "+principal.calcularPromedioKG());
                    break;
            }
        }
    }
    
    
}
