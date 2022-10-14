SubProceso mostrarContactos ( datos )
	
	Definir j,i Como Entero;
	i<-1;
	Para j <- 0 Hasta 2 Con Paso 1 Hacer
		
		Escribir "[",i,"]",datos[j];
		i<-i+1;
	FinPara
	
	Escribir "";
	
FinSubProceso

Proceso Taller3Ejercicio6
	
	//Se está creando una aplicación que va a estar conectada con un prototipo que permita almacenar contactos telefónicos en el dispositivo.
	//Para ello cada contacto debe contener nombre completo, teléfono y organización. Se requiere que la aplicación permita añadir 3 contactos  
	//verificando que el número no esté almacenado, buscar contactos almacenados y eliminar contactos si el usuario lo requiere.
	//Recuerde que el sistema debe terminar cuando el usuario así lo indique.
	
	//variables definidas
	Definir listaNombres,Listaorganizacion como cadena;
	Definir opcion,opcion2,j,contador,Listatelefono,telefono Como Entero;
	Definir encontrado Como Logico;
		
	//tamaño de los arreglos
	Dimension listaNombres[3];
	Dimension listatelefono[3];
	Dimension listaorganizacion[3];
	
	//variables inicializadas
	j<-0; contador<-0; encontrado<-falso;
	
	//inicializar el arreglo para evitar ERROR DE INICIALIZACION.
	listatelefono[0]<-0;
	listatelefono[1]<-0;
	listatelefono[2]<-0;
	
	listaNombres[0]<-" ";
	listaNombres[1]<-" ";
	listaNombres[2]<-" ";
	
	listaorganizacion[0]<-" ";
	listaorganizacion[1]<-" ";
	listaorganizacion[2]<-" ";
	
	Repetir
		Escribir "**********************************************";
		Escribir "*              AGENDA DE CONTACTOS           *";
		Escribir "**********************************************";		
		Escribir "             -Seleccione una opción- ";
		Escribir "";
		Escribir "[1]. -AGREGAR CONTACTOS";
		Escribir "[2]. -BUSCAR CONTACTOS";
		Escribir "[3]. -ELIMINAR CONTACTOS";
		Escribir "[0]. -SALIR";
		leer opcion;
		
		
		Segun opcion Hacer
			
			1:
				Si contador = 3 Entonces
					Escribir "!MEMORIA LLENA¡";
					contador<-0;
					
				SiNo
					Escribir "AGREGAR CONTACTOS";
					Escribir "";
					
					Escribir "Número:";
					Leer telefono;
					
					Para j<-0 Hasta 1  Hacer
						
						Si telefono = listatelefono[j] Entonces
							Escribir "Número ", telefono ," ya existe";
							
							encontrado<-Verdadero;
							
							
						FinSi
						
						
					FinPara
					
					si encontrado <> Verdadero Entonces
						
						listatelefono[contador]<-telefono;
						
						Escribir "Nombre: ";
						leer listaNombres[contador];
						
						Escribir "Organización: ";
						leer listaorganizacion[contador];
						
						
					FinSi
					
					contador<-contador+1;
				FinSi	
				
				
				
				
				
				
			2: 
				Escribir "CONTACTOS GUARDADOS";
				
				mostrarContactos(listaNombres);
				
				
			3:
				
				Repetir
					Escribir "Seleccione contacto que desea ELIMINAR";
					
					mostrarContactos(listaNombres);
					Leer opcion2;
					
					
					Segun opcion2 Hacer
						
						
						1:
							listatelefono[0]<-0;							
							listaNombres[0]<-" ";				
							listaorganizacion[0]<-" ";
							
							
							
						2:
							listatelefono[1]<-0;
							listaNombres[1]<-" ";
							listaorganizacion[1]<-" ";
							
						3:
							listatelefono[2]<-0;
							listaNombres[2]<-" ";
							listaorganizacion[2]<-" ";
						
					FinSegun
					
					
					
					
				Hasta Que opcion2 = 0
				
				
				
				
			
		FinSegun
		
		
	Hasta Que opcion = 0 
	
	
	
	
	
	
FinProceso
