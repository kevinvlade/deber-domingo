/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4.pkg18modelo;

/**
 *
 * @author kevin
 */
public class CreatLimitCalculatorDatos {
    
   private int identificador;
   private int numero_cuenta;
   private int balance_inicial_mes;
   private int total_elementos_cargados_mes;
   private int total_creditos_aplicados;
   private int limite_credito_permitido;
   private int nuevo_balance;
   private boolean exedeLimiteCredito;

    public CreatLimitCalculatorDatos() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
   

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getBalance_inicial_mes() {
        return balance_inicial_mes;
    }

    public void setBalance_inicial_mes(int balance_inicial_mes) {
        this.balance_inicial_mes = balance_inicial_mes;
    }

    public int getTotal_elementos_cargados_mes() {
        return total_elementos_cargados_mes;
    }

    public void setTotal_elementos_cargados_mes(int total_elementos_cargados_mes) {
        this.total_elementos_cargados_mes = total_elementos_cargados_mes;
    }

    public int getTotal_creditos_aplicados() {
        return total_creditos_aplicados;
    }

    public void setTotal_creditos_aplicados(int total_creditos_aplicados) {
        this.total_creditos_aplicados = total_creditos_aplicados;
    }

    public int getLimite_credito_permitido() {
        return limite_credito_permitido;
    }

    public void setLimite_credito_permitido(int limite_credito_permitido) {
        this.limite_credito_permitido = limite_credito_permitido;
    }

    public int getNuevo_balance() {
        return nuevo_balance;
    }

    public void setNuevo_balance(int nuevo_balance) {
        this.nuevo_balance = nuevo_balance;
    }

    public boolean isExedeLimiteCredito() {
        return exedeLimiteCredito;
    }

    public void setExedeLimiteCredito(boolean exedeLimiteCredito) {
        this.exedeLimiteCredito = exedeLimiteCredito;
    }
}
