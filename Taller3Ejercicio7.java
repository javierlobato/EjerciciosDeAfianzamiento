/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller3ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 * El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los usuarios del barrio y 
 * requiere una aplicación que permita registrar los vehículos que se cuidan en estas instalaciones.
 * Se sugiere que el parqueadero tenga los atributos del vehículo como son, placa y marca, y
 * los datos del cliente como son nombre completo número de teléfono. Para cada vehículo se debe permitir la opción 
 * de ingresar al parqueadero, retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero.
 * Recuerde que el sistema debe terminar cuando el usuario así lo indique. Tenga en presente que el parqueadero solo 
 * puede almacenar máximo 5 vehículos.
 *  
 */
public class Taller3Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		
        int opcion,opcion2;
		
        String marca[];
	String nombrecliente[];
	String placa[];
	int telefono[];
		 
        telefono = new int[5];
        placa = new String[5];
        marca = new String[5];
        nombrecliente = new String[5];

		
        do {
            System.out.println("**********************************************");
            System.out.println("*          PARQUEADERO EL GUARDIÁN           *");
            System.out.println("**********************************************");
            System.out.println("           -Seleccione una opción- ");
            System.out.println("");
            System.out.println("[1]. -CONSULTAR E INGRESAR VEHÍCULOS");
            System.out.println("[2]. -CONSULTAR Y DAR SALIDA DE VEHÍCULOS");
            System.out.println("[0]. -SALIR");
            opcion = sc.nextInt();
            switch (opcion) {
                                
                
                case 1:
                    
                    System.out.println("Seleccione lugar de parqueo para INGRESAR vehículo");
                    System.out.println("");
                    System.out.println("[1]. Nombre: "+nombrecliente[0]+", Marca: "+marca[0]+", Placa: "+placa[0]+", Teléfeno: "+telefono[0]);
                    System.out.println("[2]. Nombre: "+nombrecliente[1]+", Marca: "+marca[1]+", Placa: "+placa[1]+", Teléfono: "+telefono[1]);
                    System.out.println("[3]. Nombre: "+nombrecliente[2]+", Marca: "+marca[2]+", Placa: "+placa[2]+", Teléfono: "+telefono[2]);
                    System.out.println("[4]. Nombre: "+nombrecliente[3]+", Marca: "+marca[3]+", Placa: "+placa[3]+", Teléfono: "+telefono[3]);
                    System.out.println("[5]. Nombre: "+nombrecliente[4]+", Marca: "+marca[4]+", Placa: "+placa[4]+", Teléfono: "+telefono[4]);
                    System.out.println("[0]. -SALIR-");
                    opcion2 = sc.nextInt();
                    
                    switch (opcion2) {
                        
                        case 1:
                            
                            System.out.println("Datos de Ingreso");
                            System.out.println("");
                            System.out.println("Nombre Completo: ");
                            nombrecliente[0] = sc.nextLine();
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Teléfono: ");
                            telefono[0] = sc.nextInt();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Marca: ");
                            marca[0] = sc.nextLine();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Placa: ");
                            placa[0] = sc.nextLine();
                            
                            break;
                            
                        case 2:
                            
                            System.out.println("Datos de Ingreso");
                            System.out.println("");
                            System.out.println("Nombre Completo: ");
                            nombrecliente[1] = sc.nextLine();
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Teléfono: ");
                            telefono[1] = sc.nextInt();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Marca: ");
                            marca[1] = sc.nextLine();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Placa: ");
                            placa[1] = sc.nextLine();
                            
                            break;
                            
                        case 3:
                            
                            System.out.println("Datos de Ingreso");
                            System.out.println("");
                            System.out.println("Nombre Completo: ");
                            nombrecliente[2] = sc.nextLine();
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Teléfono: ");
                            telefono[2] = sc.nextInt();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Marca: ");
                            marca[2] = sc.nextLine();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Placa: ");
                            placa[2] = sc.nextLine();
                            
                            break;
                        case 4:
                            
                            System.out.println("Datos de Ingreso");
                            System.out.println("");
                            System.out.println("Nombre Completo: ");
                            nombrecliente[3] = sc.nextLine();
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Teléfono: ");
                            telefono[3] = sc.nextInt();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Marca: ");
                            marca[3] = sc.nextLine();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Placa: ");
                            placa[3] = sc.nextLine();
                            
                            break;
                              
                        case 5:
                            
                            System.out.println("Datos de Ingreso");
                            System.out.println("");
                            System.out.println("Nombre Completo: ");
                            nombrecliente[4] = sc.nextLine();
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Teléfono: ");
                            telefono[4] = sc.nextInt();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Marca: ");
                            marca[4] = sc.nextLine();
                            
                            
                            sc.nextLine();//limpiar scanner
                            
                            System.out.println("Placa: ");
                            placa[4] = sc.nextLine();
                            
                            break;
                        }
                        break;
                case 2:
                        do {
                            
                            System.out.println("Para darle SALIDA seleccione un lugar de parqueo");
                            System.out.println("");
                            System.out.println("[1]. Nombre: "+nombrecliente[0]+", Marca: "+marca[0]+", Placa: "+placa[0]+", Teléfeno: "+telefono[0]);
                            System.out.println("[2]. Nombre: "+nombrecliente[1]+", Marca: "+marca[1]+", Placa: "+placa[1]+", Teléfono: "+telefono[1]);
                            System.out.println("[3]. Nombre: "+nombrecliente[2]+", Marca: "+marca[2]+", Placa: "+placa[2]+", Teléfono: "+telefono[2]);
                            System.out.println("[4]. Nombre: "+nombrecliente[3]+", Marca: "+marca[3]+", Placa: "+placa[3]+", Teléfono: "+telefono[3]);
                            System.out.println("[5]. Nombre: "+nombrecliente[4]+", Marca: "+marca[4]+", Placa: "+placa[4]+", Teléfono: "+telefono[4]);
                            System.out.println("[0]. -SALIR-");
                            opcion2 = sc.nextInt();
                            switch (opcion2) {
                                
                            case 1:
                                
                                if (opcion2==1) {
                                        nombrecliente[0] = "Vacío";
                                        marca[0] = "";
                                        placa[0] = "";
                                        telefono[0] = 0;
                                }
                                
                                break;
                                
                            case 2:
                                if (opcion2==2) {
                                        nombrecliente[1] = "Vacío";
                                        marca[1] = "";
                                        placa[1] = "";
                                        telefono[1] = 0;
                                }
                                
                                break;
                                
                            case 3:
                                
                                if (opcion2==3) {
                                        nombrecliente[2] = "Vacío";
                                        marca[2] = "";
                                        placa[2] = "";
                                        telefono[2] = 0;
                                }
                                
                                break;
                                
                            case 4:
                                
                                if (opcion2==4) {
                                        nombrecliente[3] = "Vacío";
                                        marca[3] = "";
                                        placa[3] = "";
                                        telefono[3] = 0;
                                }
                                
                                break;
                                
                            case 5:
                                
                                if (opcion2==5) {
                                        nombrecliente[4] = "Vacío";
                                        marca[4] = "";
                                        placa[4] = "";
                                        telefono[4] = 0;
                                }
                                
                                break;
                                
                            }
                            
                    } while (opcion2!=0);
                        
                    break;
                }
            
        } while (opcion!=0);
     
     
    }
}
