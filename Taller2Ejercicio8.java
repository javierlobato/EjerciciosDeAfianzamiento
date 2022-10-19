/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2ejercicio8;

import java.util.Scanner;

/**
 *
 * @author javier Lobato
 El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere una aplicación que le permita registrar los pedidos de los clientes
 en cuanto a las tortas que realiza. Cada torta tiene unas características propias como sabor, cantidad (porciones) y (decoraciones). Se requiere 
 que la aplicación permita registrar los pedidos, las tortas disponibles y las ventas que se registren diariamente.
 * 
 */
public class Taller2Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //metodo scanner para introducir datos desde teclado
        
        
        
        //Variables
        int opcion, cantPorciones,contador,numTortas,tortasDisponibles;
	String sabor, decoracion;
        
        
        contador = 0;
        System.out.println("**********************************************");
        System.out.println("*                 PASTELERIA                 *");
        System.out.println("*                -DON CARLOS-                *");
        System.out.println("**********************************************");
        System.out.println("");
        System.out.println("¿Bienvenido, con cuantas tortas iniciamos el día?");
        tortasDisponibles = sc.nextInt();
        do {
        System.out.println("**********************************************");
        System.out.println("*                 PASTELERIA                 *");
        System.out.println("*                -DON CARLOS-                *");
        System.out.println("**********************************************");
        System.out.println("");
        System.out.println("TORTAS DISPONIBLES: "+tortasDisponibles);
        System.out.println("VENTAS REALIZADAS: "+contador);
        System.out.println("");
        System.out.println("[1] REGISTRAR PEDIDOS");
        System.out.println("[0] PARA SALIR");
        opcion = sc.nextInt();
        switch (opcion) {
        case 1:
                System.out.println("REGISTRE AQUÍ LOS PEDIDOS");
                System.out.println("Número de tortas: ");
                numTortas = sc.nextInt();




                System.out.println("Sabor: ");
                sabor = sc.nextLine();

                sc.nextLine();//Limpiar  scanner

                System.out.println("cantidad (porciones) max 8:");
                cantPorciones = sc.nextInt();
                
                sc.nextLine();//Limpiar  scanner

                System.out.println("Especifique tipo de decoración:");
                decoracion = sc.nextLine();

                System.out.println("Pedido EXITOSO de: "+numTortas+" tortas");
                System.out.println("sabor a "+sabor+" de "+cantPorciones+" porciones ");
                System.out.println("y decorada así: "+decoracion);
                tortasDisponibles = tortasDisponibles-numTortas;
                contador = contador+1;
                break;
            }
        } while (opcion!=0);
    }
}
