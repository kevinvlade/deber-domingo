/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4.pkg18modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public final class CreditLimitCalculaterPrograma {

    private final List<CreatLimitCalculatorDatos> listadoDatosClientes;

    /**
     *
     */
    public CreditLimitCalculaterPrograma() {
        listadoDatosClientes = new ArrayList<>();
        ejecutar();
    }

    /**
     *
     */
    public void ejecutar() {
        int maximo_clientes=0;
        Scanner input = new Scanner(System.in);
        System.out.println("digite el numero maximo de clientes a procesar");
        maximo_clientes=input.nextInt();
solicitarDatosYProcesarInformacion(maximo_clientes);
mostrarInformePantalla();
    }

    /**
     *
     * en solicitar datos estamos de una vez aplicando la logica del
     * procesamiento del nuevo balance
     *
     * @param maximo_datos=>corresponde al maximo de datos que vamos a solicitar
     * por clienet
     */
    public void solicitarDatosYProcesarInformacion(int maximo_datos) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < maximo_datos; i++) {
            CreatLimitCalculatorDatos credito = new CreatLimitCalculatorDatos();
            System.out.println("digitar numero de cuenta");
            credito.setNumero_cuenta(input.nextInt());
            System.out.println("digitar balance inicial del mes");
            credito.setBalance_inicial_mes(input.nextInt());
            System.out.println("digitar total elementos cargados en el mes");
            credito.setTotal_elementos_cargados_mes(input.nextInt());
            System.out.println("digitar total de creditos aplicados");
            credito.setTotal_creditos_aplicados(input.nextInt());
            System.out.println("digitar limite de credito permitido");
            credito.setLimite_credito_permitido(input.nextInt());
            credito.setNuevo_balance(credito.getBalance_inicial_mes() + credito.getTotal_elementos_cargados_mes() - credito.getTotal_creditos_aplicados());
            if (credito.getNuevo_balance() > credito.getLimite_credito_permitido()) {
                credito.setExedeLimiteCredito(true);
            } else {
                credito.setExedeLimiteCredito(false);
            }
            listadoDatosClientes.add(credito);
        }
    }

    public void mostrarInformePantalla() {
        for (CreatLimitCalculatorDatos credito : this.listadoDatosClientes) {
            System.out.println(".............................................");
            System.out.println("NUMERO DE CUENTA: "+credito.getNumero_cuenta());
            System.out.println("BALANCE INICIAL DEL MES: "+credito.getBalance_inicial_mes());
            System.out.println("TOTAL ELEMENTOS CARGADOS EN EL MES: "+credito.getTotal_elementos_cargados_mes());
            System.out.println("TOTAL CREDITOS APLICADOS: "+credito.getTotal_creditos_aplicados());
            System.out.println("LIMITE DE CREDITO PERMITIDO: "+credito.getLimite_credito_permitido());
            System.out.println("NUEVO BALANCE: "+credito.getNuevo_balance());
            if(credito.isExedeLimiteCredito())
            System.out.println("EL CLIENTE EXCEDE EL CUPO DE CREDITO");
            else
            System.out.println("EL CLIENTE NO EXCEDE EL CUPO DE CREDITO");
            
            System.out.println(".............................................");

        }
    }

}
