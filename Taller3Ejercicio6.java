/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller3ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Javier Lobato
 * Se está creando una aplicación que va a estar conectada con un prototipo que permita almacenar contactos telefónicos en el dispositivo.
 * Para ello cada contacto debe contener nombre completo, teléfono y organización. Se requiere que la aplicación permita añadir 3 contactos  
 * verificando que el número no esté almacenado, buscar contactos almacenados y eliminar contactos si el usuario lo requiere.
 * Recuerde que el sistema debe terminar cuando el usuario así lo indique.
 *         
 */
public class Taller3Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int contador,j,opcion,opcion2,telefono;
        boolean encontrado;
        
        String listanombres[];
        String listaorganizacion[];
        int listatelefono[];
        
        
        listanombres = new String[3];
        listatelefono = new int[3];
        listaorganizacion = new String[3];
        
        
        // variables inicializadas
        j = 0;
        contador = 0;
        encontrado = false;
        
        
        
        do {
            System.out.println("**********************************************");
            System.out.println("*              AGENDA DE CONTACTOS           *");
            System.out.println("**********************************************");
            System.out.println("             -Seleccione una opción- ");
            System.out.println("");
            System.out.println("[1]. -AGREGAR CONTACTOS");
            System.out.println("[2]. -BUSCAR CONTACTOS");
            System.out.println("[3]. -ELIMINAR CONTACTOS");
            System.out.println("[0]. -SALIR");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                if (contador==3) {
                        System.out.println("!MEMORIA LLENA¡");
                        contador = 0;
                } else {

                    System.out.println("AGREGAR CONTACTOS");
                    System.out.println("");
                    System.out.println("Número:");
                    telefono = sc.nextInt();

                    for (j=0;j<=1;j++) {//este for se usa para comprobar que no este repetido el telefono
                        if (telefono==listatelefono[j]) {
                            System.out.println("Numero "+telefono+" ya existe");
                            encontrado = true;//aqui se valida con un booleano
                        }
                    }

                    sc.nextInt();//limpiar Scanner

                    if (encontrado!=true) {


                        listatelefono[contador] = telefono;

                        System.out.println("Nombre: ");                                                                                   
                        listanombres[contador] = sc.nextLine();

                        sc.nextInt();//limpiar Scanner

                        System.out.println("Organización: ");                            
                        listaorganizacion[contador] = sc.nextLine();
                    }
                    contador = contador+1;
                }
                break;
                    
                    
            case 2:

                //se imprime en pantalla los contactos
                System.out.println("Contactos guardados");
                System.out.println("1. "+listanombres[0]+", Núnmero: "+listatelefono[0]+", Org: "+listaorganizacion[0]);
                System.out.println("2. "+listanombres[1]+", Núnmero: "+listatelefono[1]+", Org: "+listaorganizacion[1]);
                System.out.println("3. "+listanombres[2]+", Núnmero: "+listatelefono[2]+", Org: "+listaorganizacion[2]);

                break;

            case 3:

                do {
                    System.out.println("Seleccione contacto que desea ELIMINAR");
                    System.out.println("1. "+listanombres[0]+"-"+listatelefono[0]+"-"+listaorganizacion[0]);
                    System.out.println("2. "+listanombres[1]+"-"+listatelefono[1]+"-"+listaorganizacion[0]);
                    System.out.println("3. "+listanombres[2]+"-"+listatelefono[2]+"-"+listaorganizacion[0]);
                    System.out.println("[0]. -SALIR");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {

                        //aca se reestableces los valores a cero o vacio para que la agenda de contactos quede limpia
                        //cuando se elimine un contacto
                    case 1:
                            listatelefono[0] = 0;
                            listanombres[0] = " ";
                            listaorganizacion[0] = " ";

                            break;

                    case 2:
                            listatelefono[1] = 0;
                            listanombres[1] = " ";
                            listaorganizacion[1] = " ";

                            break;

                    case 3:
                            listatelefono[2] = 0;
                            listanombres[2] = " ";
                            listaorganizacion[2] = " ";

                            break;
                        }

                    } while (opcion2!=0);

                break;
                }
            
        } while (opcion!=0);
    }
}
