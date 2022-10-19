/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller1ejercicio5;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Taller1Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        //programa que pide datos de de una mascota
        
        String dueno,nomMascota,tipoMascota; //Definicion de variables
        int edad;
        
        
        
        //Se pide al usuario los datos 
        System.out.println("Dueño de la mascota: ");
        dueno = entrada.nextLine();
        
        System.out.println("Nombre de la mascota");
        nomMascota= entrada.nextLine();
        
        System.out.println("Tipo de mascota");
        tipoMascota = entrada.nextLine();
        
        System.out.println("Edad de la Mascota");
        edad = entrada.nextInt();
                
        
        
        
        //Se imprime en pantalla el nombre completo edad y estatura
        System.out.println(nomMascota+" es un(a) "+tipoMascota+", el cual tiene "+edad+" años de edad"
        +" y "+dueno+" es actualmente su dueño.");
    }
}
