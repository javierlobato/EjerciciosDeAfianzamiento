/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller4ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 * Creando una matriz pidiendo datos al usuaio y cambiando el orden en la linea siguiente
 * de 01 - 05
 * 10-06
 * 11-15
 * 20-16
 * 
 */
public class Taller4Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //variables
        int i,j;
        
        String matriz[][];//arreglo de filas y columnas
        
        //definiendo tamaño del arreglo
        matriz = new String[4][5];
        for (i=0;i<=3;i++) {
            for (j=0;j<=4;j++) {
            System.out.print("Ingrese datos: "+i+","+j+": ");
            matriz[i][j] = sc.nextLine();
            }
        }
        for (i=0;i<=0;i++) {//imprime de 01 - 05
            for (j=0;j<=4;j++) {
                 System.out.print(matriz[i][j]+" ");
                }
            System.out.println(" ");
        }
        
        for (i=1;i>=1;i--) {//imprime de 10 - 06
            for (j=4;j>=0;j--) {
                    System.out.print(matriz[i][j]+" ");
                }
            System.out.println(" ");
        }
        
        for (i=2;i<=2;i++) {//imprime de 11 - 15
                for (j=0;j<=4;j++) {
                    System.out.print(matriz[i][j]+" ");
                }
            System.out.println(" ");
        }
        
        for (i=3;i>=3;i--) {//imprime de 20 - 16
                for (j=4;j>=0;j--) {
                    System.out.print(matriz[i][j]+" ");
                }
            System.out.println(" ");
        }
        
        
    }
}
