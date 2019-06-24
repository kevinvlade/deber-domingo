/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4.pkg19;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Empresa {
        Vendedor vendedor = new Vendedor();

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
/**
 *
 */    
        
    public void solicitarDatosDetalleArticulosVendidos() {
        int max_articulos = 0;

        vendedor.setIdVendedor(1);

        System.out.println("Digite cuantos articulos va a ingresar");
        Scanner input = new Scanner(System.in);
        max_articulos = input.nextInt();

        for (int i = 0; i < max_articulos; i++) {
            DetalleArticulosVendidos det = new DetalleArticulosVendidos();
            System.out.println("Digite el ID del articulo");
            det.setIdArticulo(input.nextInt());
            System.out.println("Digite el valor del articulo");
            det.setValor(input.nextDouble());
            vendedor.getListaDetalleArticulosVendidos().add(det);
        }

    }
 /**
 *
 * @return
 */
    public double calcularIngresosVendedor(){
    double resultado=0;
    for(DetalleArticulosVendidos det:vendedor.getListaDetalleArticulosVendidos()){
    resultado=resultado+det.getValor();
    }
    resultado=(resultado*0.09)+vendedor.getPagoFijo();
    return resultado;
    }
    public void ejecutarPrograma(){
    solicitarDatosDetalleArticulosVendidos();
    double resultado=this.calcularIngresosVendedor();
        System.out.println("los ingresos del vendedor son :"+resultado);
    }
}
