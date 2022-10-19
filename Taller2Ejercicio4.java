/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 */
public class Taller2Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Programa para registrar actividades en una videotienda
        
        
        
        //Definiendo tamaño del array    
        String[] pelisDisponibles = new String [3];
        
        //variables
        int opcion,j,select;
        String anotacion;
        
        for (int i=0; i<3 ; i++){//llenar el array con peliculas
            
            System.out.println("Ingrese las películas disponibles: ");
            pelisDisponibles[i] = entrada.nextLine();
           
        }
        
        do{
            
            System.out.println("**************************");
            System.out.println("*VIDEO TIENDA EL PORVENIR*");
            System.out.println("**************************");
            System.out.println("");
            System.out.println("     Elija una Opcíon");
            System.out.println("[1]- Alquilar películas.");//En esta opcion permite ver las peliculas disponibles y asi mismo alquilar
            System.out.println("[2]- Recibir películas.");
            System.out.println("[9]- Salir");
            opcion = entrada.nextInt();
            
            switch(opcion){
                
                case 1: 
                    
                    //primer case realiza el alquiler de la película
                    
                    System.out.println("¿Qué película desea alquilar?");
                    
                    //Se recorre el array para crear una lista de peliculas disponibles
                    for (j=0; j<3;j++){
                        System.out.println("["+j+"] "+pelisDisponibles[j]);
                        
                    }
                       
                    System.out.println("Seleccione una opción");
                    System.out.println("Presione 9 para salir");
                    select = entrada.nextInt();
                    
                    
                    //Condicional para visualizar la película escogida y volver al menu principal
                    if (select >=0 || select <= 3){
                                               
                        System.out.println("La Película " + pelisDisponibles[select]+" ha sido alquilada con EXITO");
                        System.out.println("Presione 9 para volver al menú principal");
                    
                    }
                    
                    break;
                
                case 2:
                    
                                      
                    //aquí se reciben la películas
                    System.out.println("Recepción de películas");
                    
                    //Se recorre el array para crear una lista de peliculas disponibles
                    for (j=0; j<3;j++){
                        System.out.println("["+j+"] "+pelisDisponibles[j]);
                        
                    }
                    
                    System.out.println("Seleccione una PELÍCULA");
                    System.out.println("Presione 9 para salir");
                    select = entrada.nextInt();
                    
                    entrada.nextLine();
                    
                    System.out.println("Observaciones: ");
                    anotacion = entrada.nextLine();
                   
                    System.out.println("La pelicula "+pelisDisponibles[select]+" RECIBIDA CON EXITO");
                    System.out.println("Observaciones: "+anotacion);
                     
                break;
                
                
                
            }
        
        }while (opcion != 9);
     
    }
}
