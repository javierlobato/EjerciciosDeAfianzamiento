/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller1ejercicio4;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Taller1Ejercicio4 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         //programa que pide ciudad capital y pais
        
        String ciudad,pais; //Definicion de variables
        
        
        
        //Se pide al usuario los datos 
        System.out.println("Digite el nombre de un País: ");
        pais = entrada.nextLine();
        
        System.out.println("Digite la capital de "+pais+":");
        ciudad = entrada.nextLine();
        
        
        
        
        
        
        //Se imprime en pantalla el pais y su capital
        System.out.println("La ciudad de "+ciudad+", es la capital del país "+pais);
    }
}
