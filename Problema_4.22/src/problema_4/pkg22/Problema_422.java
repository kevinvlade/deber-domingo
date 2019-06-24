/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4.pkg22;

/**
 *
 * @author kevin
 */
public class Problema_422 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int ciclo10;
        int ciclo100;
        int ciclo1000;
        int numero = 0;

        System.out.println("N" + "\t10*N" + "\t" + "\t100*N" + "\t" + "\t1000*N");
        System.out.println();
        while (contador <= 5) {
            numero = numero + 1;
            ciclo10 = contador * 10;
            ciclo100 = contador * 100;
            ciclo1000 = contador * 1000;
            System.out.println(contador + "\t" + ciclo10 + "\t" + "\t" + ciclo100 + "\t" + "\t" + ciclo1000);
            contador = contador + 1;
        }
    }
}
    

   
