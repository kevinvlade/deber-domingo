/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema4_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CalculadoraSalario {

    List<Empleado> listaEmpleados;

    /**
     *
     */
    public CalculadoraSalario() {
        listaEmpleados = new ArrayList<>();
        /**
         *
         */

    }

    public void solicitarInformacionyllenarLista() {
        int maxEmpleados = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Dijite el numero de empleados a procesar ");
        maxEmpleados = input.nextInt();

        for (int i = 0; i < maxEmpleados; i++) {
            Empleado empleado = new Empleado();
            System.out.println("Dijite el id del empleado" + i);
            empleado.setIdEmpleado(input.nextInt());

            System.out.println("Dijite el numero de horas trabajadas por el empleado " + i);
            empleado.setNumeroHorastrabajadas(input.nextInt());

            System.out.println("Dijite la tarifa hora del empleado " + i);
            empleado.setTarifaHora(input.nextInt());
            listaEmpleados.add(empleado);
        }

    }

    /**
     *
     */
    public Empleado calcularSueldoTrabajdores() {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getTarifaHora() <= 40) {
                empleado.setTotalSalario(empleado.getNumeroHorastrabajadas() * (empleado.getTarifaHora() + (empleado.getTarifaHora() * 0.5)));
            }
           
        }
        return null;
    }   

    /**
     *
     */
    public void mostrarInformacionPantalla() {
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Empleado : " + empleado.getIdEmpleado() + "Numeros de horas trabajdas" + empleado.getNumeroHorastrabajadas() + "Tarifa por hora" + empleado.getTarifaHora() + " Total salario" + empleado.getTotalsalario());
        }
    }

    public void ejecutarPrograma() {
        solicitarInformacionyllenarLista();
        calcularSueldoTrabajdores();
        mostrarInformacionPantalla();
    }
}
