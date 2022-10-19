/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller3ejercicio2;

/**
 *
 * @author Javier Lobato
 * Figura con astericos
 */
public class Taller3Ejercicio2 {

    public static void main(String[] args) {
        int i,j,k;
		
		
        i = 10;
        while ((i>=1)) {
            j = 1;
            while ((j<=i)) {
                    System.out.print(" ");
                    j = j+1;
            }
            for (k=10;k>=i;k--) {
                    System.out.print("*");
            }
            i = i-1;
            System.out.println("");
        }
    }
}
