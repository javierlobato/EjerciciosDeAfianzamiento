/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 La Secretaría de Salud Municipal requiere de una aplicación que le permita calcular el IMC (Índice de masa corporal)
y requiere los datos peso en kilogramos y estatura en metros Para cada persona encuestada adicional a los datos suministrados,
debe mostrar el resultado para cada uno y establecer en qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).
	
 */
public class Taller2Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //metodo scanner para introducir datos desde teclado
        
        
        //Variables
        double imc,peso,estatura;

        System.out.println("**********************************************");
        System.out.println("*       SECRETARÍA DE SALUD MUNICIPAL        *");
        System.out.println("*     -CÁLCULO ÍNDICE DE MASA CORPORAL-      *");
        System.out.println("**********************************************");
        System.out.println("Ingrese su peso en Kilogramos (kg): ");
        peso = sc.nextDouble();
        System.out.println("Ingrese su estatura en Metros (m): ");
        estatura = sc.nextDouble();

        // imc <- peso/(estatura*estatura);
        imc = peso/(estatura*estatura);
        if ((imc<18.5)) {
                System.out.println("Su IMC  es: "+imc+" usted tiene BAJO PESO");
        } else {
                if ((imc>=18.5 && imc<=24.9)) {
                        System.out.println("Su IMC  es: "+imc+" usted tiene peso NORMAL");
                } else {
                        if ((imc>=25.0 && imc<=29.9)) {
                                System.out.println("Su IMC  es: "+imc+" usted tiene SOBREPESO");
                        } else {
                                System.out.println("Su IMC  es: "+imc+" usted tiene OBESIDAD");
                        }
                }
        }
    }
}
