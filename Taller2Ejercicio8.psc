SubProceso resultado <- tortasActuales ( v1,v2 )
	
	Definir resultado Como Entero;
	
	resultado<-v1-v2;
	
FinSubProceso

Proceso taller2Ejercicio8
	//El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere una aplicación que le permita registrar los pedidos de los clientes
	//en cuanto a las tortas que realiza. Cada torta tiene unas características propias como sabor, cantidad (porciones) y (decoraciones). Se requiere 
	//que la aplicación permita registrar los pedidos, las tortas disponibles y las ventas que se registren diariamente.
	
	
	Definir opcion, numTortas, tortasDisponibles, cantPorciones, contador Como Entero; 
	
	Definir sabor, decoraciones como cadena;
	
	contador <- 0;
	
	Escribir "**********************************************";
	Escribir "*                 PASTELERIA                 *";
	Escribir "*                -DON CARLOS-                *";
	Escribir "**********************************************";	
	Escribir "";
	Escribir "¿Bienvenido, con cuantas tortas iniciamos el día?";
	Leer tortasDisponibles;
	
	
	Repetir
		
		
		Escribir "**********************************************";
		Escribir "*                 PASTELERIA                 *";
		Escribir "*                -DON CARLOS-                *";
		Escribir "**********************************************";	
		Escribir "";
		Escribir "TORTAS DISPONIBLES: ",tortasDisponibles ;
		Escribir "VENTAS REALIZADAS: ",contador;
		Escribir "";
		Escribir "[1] REGISTRAR PEDIDOS";
		Escribir "[0] PARA SALIR";
		Leer opcion;
			
		
		Segun opcion Hacer
			
			
			1: 
				
				Escribir "REGISTRE AQUÍ LOS PEDIDOS";
				Escribir "Número de tortas: ";
				Leer numTortas;
				Escribir "Sabor: ";
				Leer sabor;
				Escribir "cantidad (porciones) max 8:";
				Leer cantPorciones;
				Escribir "Especifique tipo de decoración:";
				Leer decoraciones;
				Escribir "Pedido EXITOSO de: ",numTortas," tortas";
				Escribir "sabor a ",sabor," de ",cantPorciones," porciones ";
				Escribir "y decorada así: ",decoraciones;
				
				
				tortasDisponibles <- tortasActuales(tortasDisponibles,numTortas);
				contador <- contador + 1;
				
		FinSegun
		
		
	Hasta Que opcion = 0
	
	
FinProceso
