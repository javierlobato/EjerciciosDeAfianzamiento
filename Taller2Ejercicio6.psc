Proceso Taller2Ejercicio6
	//El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje para realizar las respectivas revisiones y requiere
	//una aplicación que le permita registrar los servicios generados a sus clientes.Para cada motocicleta se debe tener registro del ingreso al taller
	//y las observaciones por parte del cliente. También debe existir registro de salida del taller con las novedades
	//y otra de arreglos hechos por el mecánico en caso de que se requiera inventariar cambios repuestos en la motocicleta al entregarla.
	
	
	Definir opcion Como Entero;
	Definir nombrePropietario,numeroPlaca,observaciones, reparaciones, hora, fecha  como cadena;
	
	
	
	Repetir
		Escribir "**********************************************";
		Escribir "*        Bienvenido al Taller de Motos       *";
		Escribir "*               -EL MAQUINISTA-              *";
		Escribir "**********************************************";		
		Escribir "               -Elija una opción- ";
		Escribir "";
		Escribir "[1]. -REGRISTRO INGRESO DE MOTOS";
		Escribir "[2]. -REGISTRO DE SALIDA DE MOTOS";
		Escribir "[0]. -Salir";
		
		leer opcion;
		
		Segun opcion Hacer
				
			1:
				Escribir" REGISTRO DE INGRESO DE MOTOS" ;
				Escribir" " ;
				
				Escribir "Fecha: Día/mes/Año";
				Leer fecha;
				
				Escribir "Hora: Hora:Min";
				Leer hora;
				
				Escribir"Nombre del propietario: " ;
				Leer nombrePropietario;
				
				Escribir "Número de Placa:";
				Leer numeroPlaca;
				
				Escribir "Obsercaciones: ";
				Leer observaciones;
				
				Escribir" " ;
				Escribir "Se ha registrado con exito el INGRESO de la motocicleta";
				Escribir "Propietario :",nombrePropietario;
				Escribir "Número de placa :",numeroPlaca;
				Escribir "Observaciones:",observaciones;
				Escribir "Fecha: ",fecha ," || ","Hora: ",hora ;
				Escribir" " ;
				
			2: 
				Escribir" REGISTRO DE SALIDA DE MOTOS" ;
				Escribir" " ;
				
				Escribir "Fecha: Día/mes/Año";
				Leer fecha;
				
				Escribir "Hora: Hora:Min";
				Leer hora;
				
				Escribir"Nombre del propietario: " ;
				Leer nombrePropietario;
				
				Escribir "Número de Placa:";
				Leer numeroPlaca;
				
				Escribir "Reparaciones y cambio de respuestos: ";
				Leer reparaciones;
				
				Escribir "Observaciones: ";
				Leer observaciones;
				
				Escribir" " ;
				Escribir "Se ha registrado con exito la SALIDA de la motocicleta";
				Escribir "Propietario :",nombrePropietario;
				Escribir "Número de placa :",numeroPlaca;
				Escribir "Reparaciones realizadas :",reparaciones;				
				Escribir "Observaciones:",observaciones;
				Escribir "Fecha: ",fecha ," || ","Hora: ",hora ;
				Escribir" " ;
				
				
				
		FinSegun
		
		
	Hasta Que opcion = 0 
	
	
	
FinProceso
