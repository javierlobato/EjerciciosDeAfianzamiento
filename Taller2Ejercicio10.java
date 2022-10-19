/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2ejercicio10;

import java.util.Scanner;

/**
 * El banco "Su banco fiel" es un banco que inicia sus actividades financieras y necesita una aplicación para 
 * llevar las cuentas de sus usuarios; por lo tanto,se sugiere que la cuenta tenga los atributos titular y cantidad. 
 * Para cada cliente las cuentas permitirán realizar ingresos retiros o consultas de valor. En los ingresos no se pueden 
 * insertar valores negativos y para los retiros el valor no puede ser mayor al valor que tiene en la cuenta.
		
 * @author Javier Lobato
 */
public class Taller2Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //metodo scanner para introducir datos desde teclado
        
        
        //Variables
        int opcion, montoIngresado, montoRetirar, saldoActual;
        String titular;
		
            //Variables Inicializadas
            montoIngresado = 0;
            montoRetirar = 0;


            System.out.println("**********************************************");
            System.out.println("*           >>> BIENVENIDO<<<                *");
            System.out.println("*          ****SU BANCO FIEL****             *");
            System.out.println("**********************************************");
            System.out.println("Por favor ingrese nombre del titular: ");
            titular = sc.nextLine();
            do {
            System.out.println("**********************************************");
            System.out.println("*          PORTAL TRANSACCIONAL              *");
            System.out.println("*          ****SU BANCO FIEL****             *");
            System.out.println("**********************************************");
            System.out.println("Bienvenido Sr(a): "+titular);
            System.out.println("¿Que operación desea realizar?");
            System.out.println("");
            System.out.println("[1] INGRESAR DINERO");
            System.out.println("[2] RETIRAR DINERO");
            System.out.println("[3] CONSULTAR SALDO");
            System.out.println("[0] PARA SALIR");
            opcion = sc.nextInt();
            switch (opcion) {

            case 1:
                    System.out.println("Digite el monto que desea Ingresar: ");
                    System.out.println("[0] Para volver al menú");
                    montoIngresado = sc.nextInt();

                    if (montoIngresado<=0) {
                            System.out.println("Error: Monto inválido");
                    } else {
                            System.out.println("Ingreso exitoso");
                    }
                    break;

            case 2:
                    System.out.println("Digite el monto a Retirar");
                    System.out.println("[0] Para volver al menú");
                    montoRetirar = sc.nextInt();

                    if (montoRetirar <=0 || montoRetirar > montoIngresado) {
                            System.out.println("Error: Monto inválido");
                    } else {
                            System.out.println("Retiro exitoso");
                    }
                    break;

            case 3:
                    saldoActual = montoIngresado-montoRetirar;
                    System.out.println("Su saldo actual es: "+saldoActual);
                    break;
            }
        } while (opcion!=0);
    }
}
