/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2ejercicio6;

import java.util.Scanner;

/**
 *
 * @author javier Lobato
El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje para realizar las respectivas revisiones y requiere
una aplicación que le permita registrar los servicios generados a sus clientes.Para cada motocicleta se debe tener registro del ingreso al taller
y las observaciones por parte del cliente. También debe existir registro de salida del taller con las novedades
y otra de arreglos hechos por el mecánico en caso de que se requiera inventariar cambios repuestos en la motocicleta al entregarla.
		
 */
public class Taller2Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //metodo scanner para introducir datos desde teclado
        
        
        //variables
        String fecha,hora,nombrePropietario,numeroPlaca, observaciones, reparaciones ;
	int opcion;
		
        do {
            System.out.println("**********************************************");
            System.out.println("*        Bienvenido al Taller de Motos       *");
            System.out.println("*               -EL MAQUINISTA-              *");
            System.out.println("**********************************************");
            System.out.println("               -Elija una opción- ");
            System.out.println("");
            System.out.println("[1]. -REGRISTRO INGRESO DE MOTOS");
            System.out.println("[2]. -REGISTRO DE SALIDA DE MOTOS");
            System.out.println("[0]. -Salir");
            opcion = sc.nextInt();
            switch (opcion) {

            case 1:
                    System.out.println(" REGISTRO DE INGRESO DE MOTOS");
                    System.out.println(" ");
                    System.out.println("Fecha: Día/mes/Año");
                    fecha = sc.nextLine();
                    System.out.println("Hora: Hora:Min");
                    hora = sc.nextLine();
                    System.out.println("Nombre del propietario: ");
                    nombrePropietario = sc.nextLine();
                    System.out.println("Número de Placa:");
                    numeroPlaca = sc.nextLine();
                    System.out.println("Obsercaciones: ");
                    observaciones = sc.nextLine();
                    System.out.println(" ");
                    System.out.println("Se ha registrado con exito el INGRESO de la motocicleta");
                    System.out.println("Propietario :"+nombrePropietario);
                    System.out.println("Número de placa :"+numeroPlaca);
                    System.out.println("Observaciones:"+observaciones);
                    System.out.println("Fecha: "+fecha+" || "+"Hora: "+hora);
                    System.out.println(" ");
                    break;
            case 2:
                    System.out.println(" REGISTRO DE SALIDA DE MOTOS");
                    System.out.println(" ");
                    System.out.println("Fecha: Día/mes/Año");
                    fecha = sc.nextLine();
                    System.out.println("Hora: Hora:Min");
                    hora = sc.nextLine();
                    System.out.println("Nombre del propietario: ");
                    nombrePropietario = sc.nextLine();
                    System.out.println("Número de Placa:");
                    numeroPlaca = sc.nextLine();
                    System.out.println("Reparaciones y cambio de respuestos: ");
                    reparaciones = sc.nextLine();
                    System.out.println("Observaciones: ");
                    observaciones = sc.nextLine();
                    System.out.println(" ");
                    System.out.println("Se ha registrado con exito la SALIDA de la motocicleta");
                    System.out.println("Propietario :"+nombrePropietario);
                    System.out.println("Número de placa :"+numeroPlaca);
                    System.out.println("Reparaciones realizadas :"+reparaciones);
                    System.out.println("Observaciones:"+observaciones);
                    System.out.println("Fecha: "+fecha+" || "+"Hora: "+hora);
                    System.out.println(" ");
                    break;
            }
        } while (opcion!=0);
    }
}

