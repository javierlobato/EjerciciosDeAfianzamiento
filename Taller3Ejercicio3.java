/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller3ejercicio3;

/**
 *
 *@author Javier Lobato
 * Figura con astericos arbol
 */
public class Taller3Ejercicio3 {

    public static void main(String[] args) {
        
        //variables
        int espacios,i,j,k,lineaFinal,lineas;

        
        //Inicializacion de variables
        lineas = 10;
        i = 1;
        j = 1;
        
        
        lineaFinal = 2*lineas-1;//operacion matématica
        
        
        //recorriendo e imprimiendo asteriscos
        for (i=1;i<=lineas;i++) {
            System.out.println("");
            espacios = ((lineaFinal-j)/2);
            
            

            for (k=1;k<=espacios;k++) {
                    System.out.print(" ");
            }
            
            for (k=1;k<=j;k++) {
                    System.out.print("*");
            }
            
            for (k=1;k<=espacios;k++) { 
                    System.out.print(" ");
            }
            j = j+2;
        }
        
        
        
        //Dando un nuevo valor a las variables
        lineas = 4;
        i = 3;
        j = 3;
        
        //recorriendo e imprimiendo asteriscos
        for (i=1;i<=lineas;i+=2) {
            System.out.println(" ");
            espacios = ((lineaFinal-j)/2);
            
            
            for (k=1;k<=espacios;k++) {
                    System.out.print(" ");
            }
            
            for (k=1;k<=j;k++) {
                    System.out.print("*");
            }
            
            for (k=1;k<=espacios;k++) {
                    System.out.print(" ");
            }
            j = j+2;
        }
        System.out.println("");
        
    }
}
