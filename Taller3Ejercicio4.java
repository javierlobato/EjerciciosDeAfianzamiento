/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller3ejercicio4;

import java.util.Scanner;

/**
 *
 * @author javier Lobato
 * Tabla de multiplicar
 */
public class Taller3Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//metodo para recibir datos desde teclado
        
        int num1,num2,resultado;
        
        
        
        System.out.println("¿Qué tabla de multiplicar desea?");
        num1 = sc.nextInt();
        
        //inicializaca la variable num2 para iniciar la multiplicación
        num2 = 1;
        
        //for se utilizara para recorrer los diferentes numeros a multiplicar   
        for (num2=1;num2<=10;num2++) {
            resultado = num1*num2;
            
            System.out.println(num2+" x "+num1+" = "+resultado);
        }
    }
}
