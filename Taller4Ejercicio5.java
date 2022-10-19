/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller4ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 * Generar una tabla y con las coordenadas dar el resultado de multiplicar los numeros asignados
 * en las coordenadas.
 */
public class Taller4Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int i,j,numFila,numColumna;//Variables tipo entero
        
        int matriz[][];//Creacion array
        
        
        matriz = new int[11][11];//tamaño del array
        
        
        for (i=1;i<=10;i++) {//FOr para recorrer el arreglo  y generar la tabla
            for (j=1;j<=10;j++) {
                if (i!=10) {
                    System.out.print(j+"x"+i+"   ");
                } else {
                    System.out.print(j+"x"+i+"   ");
                }
            }
            System.out.println(" ");
        }
        
        
        System.out.println("");
        for (i=0;i<=10;i++) {
            for (j=0;j<=10;j++) {
                matriz[i][j] = i*j;
            }
        }
        
        System.out.println("Ingrese el número de la fila: ");
        numFila = sc.nextInt();
        
        System.out.println("Ingrese el número de la Columna: ");
        numColumna = sc.nextInt();
        
        System.out.println(matriz[numFila][numColumna]);
    }
}
