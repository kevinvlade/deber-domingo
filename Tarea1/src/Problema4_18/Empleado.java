/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema4_18;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    int idEmpleado;
    int numeroHorastrabajadas;
    int tarifaHora;
    double totalsalario;
    
    public Empleado() {
        idEmpleado=0;
        numeroHorastrabajadas=0;
        tarifaHora=0;
    }
   

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getNumeroHorastrabajadas() {
        return numeroHorastrabajadas;
    }

    public void setNumeroHorastrabajadas(int numeroHorastrabajadas) {
        this.numeroHorastrabajadas = numeroHorastrabajadas;
    }

    public int getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(int tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public double getTotalsalario() {
        return totalsalario;
    }

    public void setTotalsalario(double totalsalario) {
        this.totalsalario = totalsalario;
    }

    void setTotalSalario(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
            
    
}
