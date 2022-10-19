/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller1ejercicio3;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Taller1Ejercicio3 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         
         //programa que pide tu nombre completo y de tus padres
         
        
        String nombreCompleto,nomMadre,nomPadre; //Definicion de variables
        
        
        //Se pide al usuario los datos 
        System.out.println("Digite su Nombre completo: ");
        nombreCompleto = entrada.nextLine();
        
        System.out.println("Digite nombre completo de su Madre: ");
        nomMadre = entrada.nextLine();
        
        System.out.println("Digite nombre completo de su padre: ");
        nomPadre = entrada.nextLine();
        
        
        
        
        //Se imprime en pantalla el nombre completo edad y estatura
        System.out.println("yo "+nombreCompleto+", soy hijo de " + nomMadre + " y " + nomPadre);
    }
}
