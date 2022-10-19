/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller3ejercicio5;

import java.util.Scanner;

/**
 *
 * @author javier Lobato 
 * Menú Ejecicion infinita
 */
public class Taller3Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String nombre = ""; int opcion;//Variables definidas
        
        

        // Menú de usuario de ejecución infinita
        do {
            System.out.println("Menú de usuario");
            System.out.println("1. Captura de nombre");
            System.out.println("2. Saludar Persona");
            System.out.println("3. Salir del sistema");
            opcion = sc.nextInt();
            
            switch (opcion) {
            case 1:
                
                sc.nextLine();//limpiando scanner
                
                System.out.println("Escriba su nombre");//capturando nombre
                nombre = sc.nextLine();
                break;
                
            case 2:
                //imprimiendo saludo en pantalla
                System.out.println(" Hola, "+ nombre);
                break;
            }
        } while (opcion!=3);
        
    }
}
