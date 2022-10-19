/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller4ejercicio2;

/**
 *
 * @author Javier Lobato
 * Generando numeros aletario del 1 al 100 para llenar un arreglo
 * generando separando numero pares de los impares
 * 
 */
public class Taller4Ejercicio2 {

    public static void main(String[] args) {
        
		
        int j,num,contador;
        int vector[];
        contador = 0;
        vector = new int[20];

        do {
            num = (int)(Math.random()*100+1);
            vector[contador] = num;
            
            //System.out.println(vector[contador]+" - "+contador); //linea de comprobacion de numeros aleatorios
            contador = contador+1;
            
        } while (contador!=20);//Separacion de numeros pares
        System.out.print("Número Pares: ");
        
        for (j=0;j<=19;j++) {
            if (vector[j]%2==0) {
            System.out.print(vector[j]+", ");
            }
        }
        System.out.println("");//Separacion de numeros impares
        System.out.print("Número Impares: ");
        
        for (j=0;j<=19;j++) {
            if (vector[j]%2!=0) {
            System.out.print(vector[j]+", ");
            }
        }
        
    }
}
