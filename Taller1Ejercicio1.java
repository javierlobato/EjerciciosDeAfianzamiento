/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Taller1Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //programa para pedir nombre y apellidos
        
        String nombre,apellido; //Definicion de variables
        
        
        
        //Se pide al usuario los datos 
        System.out.println("Digite su Nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Digite su Apellido");
        apellido = entrada.nextLine();
        
        
        //Se imprime en pantalla el nombre completo
        System.out.println("Su nombre competo es: "+nombre+" "+apellido);
    }
}
