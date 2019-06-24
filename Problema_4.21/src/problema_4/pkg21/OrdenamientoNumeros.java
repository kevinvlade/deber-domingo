/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4.pkg21;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class OrdenamientoNumeros {

    public OrdenamientoNumeros() {
    }

    public void solicitarNumeros(){
        int contador;
        int mayor=0;
        int numero=0;
        
        Scanner input = new Scanner(System.in);
        
        for (contador = 0; contador < 10; contador++) {
            System.out.println("Dijite el numero" + contador + ":");
            numero=input.nextInt();
            
            if(numero>mayor)
                mayor=numero;
        }
        System.out.println("El numero es:"+mayor);
    }
}
