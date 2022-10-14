SubProceso peliculasDisponibles
	
	Definir peliculaAlquilada Como Entero;
	
	Escribir " Lista de Películas disponibles";
	Escribir "";
	Escribir " Presione 1. - Jhon wick";
	Escribir " Presione 2. - Matrix";
	Escribir " Presione 3. - Constantine";
	Escribir " Presione 4. - El abogado del diablo";
	Escribir " ";
	Escribir " Presione 0 para Regresar al Menú Principal";
	Leer peliculaAlquilada;
	
	Segun peliculaAlquilada Hacer
		1:
			Escribir "**********************************************";
			Escribir "*             Usted ha alquilado             *";
			Escribir "*                 JHON WICK                  *";
			Escribir "**********************************************";
		2:
			Escribir "**********************************************";
			Escribir "*             Usted ha alquilado             *";
			Escribir "*                  MATRIX                    *";
			Escribir "**********************************************";
		3:
			Escribir "**********************************************";
			Escribir "*             Usted ha alquilado             *";
			Escribir "*               CONSTANTINE                  *";
			Escribir "**********************************************";
			
		4:	Escribir "**********************************************";
			Escribir "*             Usted ha alquilado             *";
			Escribir "*           EL ABOGADO DEL DIABLO            *";
			Escribir "**********************************************";
			
			
	FinSegun
	
	
FinSubProceso


SubProceso recibirPeliculas 
	Definir nombrePelicula, novedades como cadena;
	
	Escribir"Nombre de la película: " ;
	Leer nombrePelicula;
	
	Escribir "Novedades: ";
	Leer novedades;
	
	Escribir "La Película >>>> ",nombrePelicula, " <<<< fue recibida." ;
	Escribir "Novedades :",novedades;
	
	
FinSubProceso







Proceso Taller2Ejercicio4
	//La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir,
	//requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios.
	//Para cada usuario se debe permitir la opción de alquilar película,
	//consultar películas disponibles y recibir película en la video tienda con la opción de realizar anotaciones 
	//sobre estas si se llegan a presentar daños u otra novedad sobre la película.
	
	Definir opcion,peliculaAlquilada Como Entero;
	
	
	
	Repetir
		Escribir "**********************************************";
		Escribir "*         Bienvenido a la VideoTienda        *";
		Escribir "*                -EL PORVENIR-               *";
		Escribir "**********************************************";		
		Escribir "               -Elija una opción- ";
		Escribir "";
		Escribir "Presione 1. Consultar películas disponibles";
		Escribir "Presione 2. Recibir película";
		Escribir "Presione 0. Salir";
		Escribir "";
		Escribir "";
		leer opcion;
		
		Segun opcion Hacer
			
			1:  
				peliculasDisponibles;
				
				
			2:
				recibirPeliculas;
				
				
			
			
		FinSegun
		
		
	Hasta Que opcion = 0 

	
	

	
	
FinProceso
