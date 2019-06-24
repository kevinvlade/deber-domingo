/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4.pkg19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class Vendedor {

    int idVendedor;
    List<DetalleArticulosVendidos> ListaDetalleArticulosVendidos;
    double pagoFijo;
    double porcentajeComision;

    public Vendedor() {
        idVendedor = 0;
        ListaDetalleArticulosVendidos = new ArrayList<>();
        pagoFijo = 200;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public List<DetalleArticulosVendidos> getListaDetalleArticulosVendidos() {
        return ListaDetalleArticulosVendidos;
    }

    public void setListaDetalleArticulosVendidos(List<DetalleArticulosVendidos> ListaDetalleArticulosVendidos) {
        this.ListaDetalleArticulosVendidos = ListaDetalleArticulosVendidos;
    }

    public double getPagoFijo() {
        return pagoFijo;
    }

    public void setPagoFijo(double pagoFijo) {
        this.pagoFijo = pagoFijo;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

}
