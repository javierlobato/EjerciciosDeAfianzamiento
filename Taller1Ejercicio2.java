/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller1ejercicio2;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Taller1Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        //programa que pide tu nombre completo edad y estatura
        
        String nombre,apellido; //Definicion de variables
        double estatura; 
        int edad ;
        
        
        
        //Se pide al usuario los datos 
        System.out.println("Digite su Nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Digite su Apellido: ");
        apellido = entrada.nextLine();
        
        System.out.println("Digite su Edad: ");
        edad = entrada.nextInt();
                
        System.out.println("Digite su Estatura en metros");
        estatura = entrada.nextDouble();
        
        
        //Se imprime en pantalla el nombre completo edad y estatura
        System.out.println("Su nombre competo es: "+nombre+" "+apellido+
                " tiene " +edad+" años y mide "+estatura+" metros");
    }
}
