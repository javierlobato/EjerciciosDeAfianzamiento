Proceso Taller3Ejercicio5
	//Menú de usuario de ejecución infinita
	Definir nombre como cadena;
	Definir opcion Como Entero;
	
	Repetir
		
		Escribir "Menú de usuario";
		Escribir "1. Captura de nombre";
		Escribir "2. Saludar Persona";
		Escribir "3. Salir del sistema";
		
		leer opcion;
		
		Segun opcion Hacer
			
			1:
				Escribir"Escriba su nombre" ;
				Leer nombre;
				
			2: 
				Escribir" Hola, ", nombre ;
				
				
				
		FinSegun
		
		
	Hasta Que opcion = 3 
	
FinProceso
