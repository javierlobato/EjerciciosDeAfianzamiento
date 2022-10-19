/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author David
 */

/** La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación
para poder facturar los productos que vende a sus clientes y para ello,
los productos tienen unas características que deben indicársele al cliente para que pueda escoger el producto a comprar.
Para cada cliente, se tienen las opciones de compra de producto,
consulta de precios por producto y devoluciones en caso de que se presenten.
*/

public class Taller2Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
        
        //variables
	String nombreProducto,novedades;
		
	int opcion, productodisponible;
		
            do {
            System.out.println("**********************************************");
            System.out.println("*         Bienvenido a la Drogueria          *");
            System.out.println("*                -MI SALUD-                  *");
            System.out.println("**********************************************");
            System.out.println("               -Elija una opción- ");
            System.out.println("");
            System.out.println("[1]. -Medicamentos");
            System.out.println("[2]. -Devolución de Productos");
            System.out.println("[0]. -Salir");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                    System.out.println(" Lista de Productos disponibles");
                    System.out.println("");
                    System.out.println(" *Elija el producto que desea comprar*");
                    System.out.println("");
                    System.out.println(" [1]. - Acetaminofen c/u - Precio: $ 800");
                    System.out.println(" Caracteristica: Lab.GENFAR:Sirve para dolor de cabeza");
                    System.out.println(" ");
                    System.out.println(" [2]. - Aspirina c/u - Precio: $ 1.000");
                    System.out.println(" Caracteristica: Lab. Sanofi:Sirve para dolencias generales");
                    System.out.println(" ");
                    System.out.println(" [3]. - Ibuprofeno c/u - Precio: $ 1.100");
                    System.out.println(" Caracteristica: Lab. Janssen Sirve para aliviar la fiebre");
                    System.out.println(" ");
                    System.out.println(" Presione 0 para Regresar al Menú Principal");
                    productodisponible = sc.nextInt();
                    switch (productodisponible) {
                    case 1:
                            System.out.println("**********************************************");
                            System.out.println("*  Gracias por su compra usted ha adquirido  *");
                            System.out.println("*                ACETAMINOFEN                *");
                            System.out.println("**********************************************");
                            break;
                    case 2:
                            System.out.println("**********************************************");
                            System.out.println("*  Gracias por su compra usted ha adquirido  *");
                            System.out.println("*                  ASPIRINA                  *");
                            System.out.println("**********************************************");
                            break;
                    case 3:
                            System.out.println("**********************************************");
                            System.out.println("*  Gracias por su compra usted ha adquirido  *");
                            System.out.println("*                IBUPROFENO                  *");
                            System.out.println("**********************************************");
                            break;
                    }
                    break;
            case 2:

                    sc.nextLine();//Se utiliza para limpiar el scanner.2
                    System.out.println("Producto a devolver: ");
                    nombreProducto = sc.nextLine();
                    System.out.println("Novedades: ");
                    novedades = sc.nextLine();
                    System.out.println("La Devolución de >>>> "+nombreProducto+" <<<< fue exitosa.");
                    System.out.println("Novedades :"+novedades);
                    break;
            }
        } while (opcion!=0);
	
    }
}
