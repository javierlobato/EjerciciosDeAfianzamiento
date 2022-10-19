/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 */
public class Taller2Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // programa solicita edad de una persona
        
        //variables
        int edad;
        
        System.out.println("Por favor digite su edad: ");
        edad = entrada.nextInt();
        
        if (edad >= 18) {
            
            System.out.println("¡Usted NO es un niño(a)!");
        }else{
            System.out.println("¡Usted aún es un niño(a)!");
        }
    }
}
