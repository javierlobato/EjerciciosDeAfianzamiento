/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller4ejercicio3;

/**
 *
 * @author Javie Lobato
 * Generando  numeros primos del 1 al 1000
 * 
 */
public class Taller4Ejercicio3 {

    public static void main(String[] args) {
        int contador, num, x;
	
	for (num=1;num<=1000;num++) {
	contador = 0;
	
        x = 1;
        
	while (x<=num) {
	    if (num%x==0) {
		contador = contador+1;
		}
	    x = x+1;
	    }
	if (contador==2) {
            System.out.println("Numeros Primos del 1 - 1000: "+num);
            }
        }
        
    }
}
