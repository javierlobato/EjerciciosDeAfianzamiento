/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller2ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 * El profesor de geometría está explicando a sus estudiantes las fórmulas para calcular el área de diferentes figuras geométricas,
 * para ello requiere una aplicación que le facilite el ejercicio solicitándole los valores al estudiante. La aplicación debe permitir 
 * que el estudiante seleccione si desea calcular el área de un rectángulo, triángulo o trapecio. No olvide solicitar los datos necesarios 
 * para realizar cada y mostrar su respectivo resultado.
 */
public class Taller2Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //metodo scanner para introducir datos desde teclado
        
        
        //Variables
        double altura,area,base,baseMayor;
        int opcion;
        
        do {//Menú de inicio
            System.out.println("");
            System.out.println("¿QUE ÁREA DESEAS CALCULAR?");
            System.out.println("");
            System.out.println("[1] RECTÁNGULO");
            System.out.println("[2] TRIÁNGULO");
            System.out.println("[3] TRAPECIO");
            System.out.println("[0] PARA SALIR");
            opcion = sc.nextInt();
            switch (opcion) {
                
            case 1:
                    System.out.println("ÁREA DE UN RECTÁNGULO");
                    System.out.println("");
                    System.out.println("Digite la base: ");
                    base = sc.nextDouble();
                    System.out.println("Digite la altura");
                    altura = sc.nextDouble();
                    area = base*altura;
                    System.out.println("El área del RECTÁNGULO es: "+area);
                    break;
            case 2:
                    System.out.println("ÁREA DE UN TRIÁNGULO");
                    System.out.println("");
                    System.out.println("Digite la base: ");
                    base = sc.nextDouble();
                    System.out.println("Digite la altura");
                    altura = sc.nextDouble();
                    area = (base*altura)/2;
                    System.out.println("El área del TRIÁNGULO es: "+area);
                    break;
            case 3:
                    System.out.println("ÁREA DE UN TRAPECIO");
                    System.out.println("");
                    System.out.println("Digite la base menor: ");
                    base = sc.nextDouble();
                    System.out.println("Digite la base mayor: ");
                    baseMayor = sc.nextDouble();
                    System.out.println("Digite la altura");
                    altura = sc.nextDouble();
                    area = ((base+baseMayor)*altura)/2;
                    System.out.println("El área del TRAPECIO es: "+area);
                    break;
                }
        } while (opcion!=0);
    }
}
