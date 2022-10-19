/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller4ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 */
public class Taller4Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int j,num,contador;

        int vect1[];
        vect1 = new int[5];
        contador = 0;
        vect1[0] = 0;
        vect1[1] = 0;
        vect1[2] = 0;
        vect1[3] = 0;
        vect1[4] = 0;
        num = 1;
                
        do {

            System.out.println("Digite un número ");
            vect1[contador] = sc.nextInt();
            num = num+1;
            contador = contador+1;

            } while (contador!=5);

            System.out.println("°"+"[0]"+" = "+vect1[0]);
            System.out.println("°"+"[1]"+" = "+vect1[1]);
            System.out.println("°"+"[2]"+" = "+vect1[2]);
            System.out.println("°"+"[3]"+" = "+vect1[3]);
            System.out.println("°"+"[4]"+" = "+vect1[4]);
    }
}
