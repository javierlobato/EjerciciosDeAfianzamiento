/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 */
public class Taller2Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona.
        
        //variables
        int edad; 
        String nombre,apellido;
        
        System.out.println("Por favor digite Nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor digite su Apellido: ");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor digite su edad: ");
        edad = entrada.nextInt();
        
        if (edad >= 18) {
            
            System.out.println("¡"+nombre+" "+apellido+" usted es MAYOR de edad, por lo tanto puede entrar a la fiesta.!");
        }else{
            System.out.println("¡"+nombre+" "+apellido+" usted es menor de edad, por lo tanto, no "
                    + "puede entrar a la fiesta, por favor devuélvase a su casa.!");
        }
    }
}
