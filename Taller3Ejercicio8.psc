Proceso Taller3Ejercicio8
	//La escuela automovilística "El Maestro" requiere una aplicación que permita registrar a sus clientes en los cursos de enseñanza automovilística
	//y establecer quienes lo han aprobado para continuar con el trámite de adquirir la licencia de conducción. Para cada usuario se debe permitir
	//registrar su ingreso al curso, consultar usuarios que hayan presentado el curso y resultados de la prueba del curso (si fueron aprobados o no).
	//Recuerde que el sistema debe terminar cuando el usuario así lo indique. Tenga presente que la escuela tiene 
	//capacidad máxima de gestionar 8 usuarios en su totalidad.
	
	
	
	Definir nombreCompleto como cadena;
	Definir opcion,opcion2,opcion3,notas,contador,numIdentificacion Como Entero;
	
	
	
	
	//tamaño de los arreglos
	Dimension nombreCompleto[8];
	Dimension notas[8];
	Dimension numIdentificacion[8];
	//variables inicializadas
	contador<-0;
	
	nombreCompleto[0]<-""; nombreCompleto[1]<-""; nombreCompleto[2]<-""; nombreCompleto[3]<-"";
	nombreCompleto[4]<-""; nombreCompleto[5]<-""; nombreCompleto[6]<-""; nombreCompleto[7]<-"";
	
	numIdentificacion[0]<-0; numIdentificacion[1]<-0; numIdentificacion[2]<-0; numIdentificacion[3]<-0;
	numIdentificacion[4]<-0; numIdentificacion[5]<-0; numIdentificacion[6]<-0; numIdentificacion[7]<-0;
	
	notas[0]<-0; notas[1]<-0; notas[2]<-0; notas[3]<-0; notas[4]<-0; notas[5]<-0; notas[6]<-0; notas[7]<-0;
	
	
	
	
	
	
	Repetir
		Escribir "**********************************************";
		Escribir "*     ESCUELA AUTOMOVILISTISCA EL MAESTRO    *";
		Escribir "**********************************************";		
		Escribir "             -Seleccione una opción- ";
		Escribir "";
		Escribir "[1]. -REGISTRAR INGRESOS";
		Escribir "[2]. -AGREGAR NOTAS";
		Escribir "[3]. -CONSULTAR RESULTADOS DE PRUEBAS";
		Escribir "[0]. -SALIR";
		leer opcion;
		
		
		Segun opcion Hacer
			
			1:
				Escribir "Registro de Clientes";
				Escribir "";
				Escribir "Nombre Completo:";
				Leer nombreCompleto[contador];
				Escribir "Número de identificación: ";
				Leer numIdentificacion[contador];
				
				Escribir " ***REGISTRO EXITOSO***";
				
				contador<-contador+1;
			2: 
				Repetir
					
					Escribir "--REGISTRO DE NOTAS--";
					Escribir "";
					Escribir "Seleccione usuario para agregar nota";
					Escribir "";
					Escribir "[1] - Nombre: ",nombreCompleto[0], "Identificación No.: ",numIdentificacion[0];
					Escribir "[2] - Nombre: ",nombreCompleto[1], "Identificación No.: ",numIdentificacion[1];
					Escribir "[3] - Nombre: ",nombreCompleto[2], "Identificación No.: ",numIdentificacion[2];
					Escribir "[4] - Nombre: ",nombreCompleto[3], "Identificación No.: ",numIdentificacion[3];
					Escribir "[5] - Nombre: ",nombreCompleto[4], "Identificación No.: ",numIdentificacion[4];
					Escribir "[6] - Nombre: ",nombreCompleto[5], "Identificación No.: ",numIdentificacion[5];
					Escribir "[7] - Nombre: ",nombreCompleto[6], "Identificación No.: ",numIdentificacion[6];
					Escribir "[8] - Nombre: ",nombreCompleto[7], "Identificación No.: ",numIdentificacion[7];
					Escribir "[0]. -SALIR";
					Leer opcion2;
					
					
					
					Segun opcion2 Hacer
						1:
							Escribir "Recuerde que la nota debe estar entre 0 y 10 sin puntos ni comas";
							Escribir "Ingrese la nota para: ",nombreCompleto[0], " Identificación No.: ",numIdentificacion[0];
							Leer notas[0];
							Si notas[0] >= 0  y  notas[0] <= 10 Entonces
								
								Escribir "la nota ha sido agregada con EXITO";
							SiNo
								Escribir "Error: la nota digitada no es válida";
								Escribir "";
								notas[0]<-0;
							FinSi
						2:
							Escribir "Recuerde que la nota debe estar entre 0 y 10 sin puntos ni comas";
							Escribir "Ingrese la nota para: ",nombreCompleto[1], " Identificación No.: ",numIdentificacion[1];
							Leer notas[1];
							Si notas[1] >= 0  y  notas[1] <= 10 Entonces
								
								Escribir "la nota ha sido agregada con EXITO";
							SiNo
								Escribir "Error: la nota digitada no es válida";
								Escribir "";
								notas[1]<-0;
							FinSi
							
						3:
							Escribir "Recuerde que la nota debe estar entre 0 y 10 sin puntos ni comas";
							Escribir "Ingrese la nota para: ",nombreCompleto[2], " Identificación No.: ",numIdentificacion[2];
							Leer notas[2];
							Si notas[2] >= 0  y  notas[2] <= 10 Entonces
								
								Escribir "la nota ha sido agregada con EXITO";
							SiNo
								Escribir "Error: la nota digitada no es válida";
								Escribir "";
								notas[2]<-0;
							FinSi
						4:
							
							Escribir "Recuerde que la nota debe estar entre 0 y 10 sin puntos ni comas";
							Escribir "Ingrese la nota para: ",nombreCompleto[3], " Identificación No.: ",numIdentificacion[3];
							Leer notas[3];
							Si notas[3] >= 0  y  notas[3] <= 10 Entonces
								
								Escribir "la nota ha sido agregada con EXITO";
							SiNo
								Escribir "Error: la nota digitada no es válida";
								Escribir "";
								notas[3]<-0;
							FinSi
							
						5:
							Escribir "Recuerde que la nota debe estar entre 0 y 10 sin puntos ni comas";
							Escribir "Ingrese la nota para: ",nombreCompleto[4], " Identificación No.: ",numIdentificacion[4];
							Leer notas[4];
							Si notas[4] >= 0  y  notas[4] <= 10 Entonces
								
								Escribir "la nota ha sido agregada con EXITO";
							SiNo
								Escribir "Error: la nota digitada no es válida";
								Escribir "";
								notas[4]<-0;
							FinSi
						6:	
							
							Escribir "Recuerde que la nota debe estar entre 0 y 10 sin puntos ni comas";
							Escribir "Ingrese la nota para: ",nombreCompleto[5], " Identificación No.: ",numIdentificacion[5];
							Leer notas[5];
							Si notas[5] >= 0  y  notas[5] <= 10 Entonces
								
								Escribir "la nota ha sido agregada con EXITO";
							SiNo
								Escribir "Error: la nota digitada no es válida";
								Escribir "";
								notas[5]<-0;
							FinSi
							
							
						7:	
							
							Escribir "Recuerde que la nota debe estar entre 0 y 10 sin puntos ni comas";
							Escribir "Ingrese la nota para: ",nombreCompleto[6], " Identificación No.: ",numIdentificacion[6];
							Leer notas[6];
							Si notas[6] >= 0  y  notas[6] <= 10 Entonces
								
								Escribir "la nota ha sido agregada con EXITO";
							SiNo
								Escribir "Error: la nota digitada no es válida";
								Escribir "";
								notas[6]<-0;
							FinSi
							
						8:
							
							Escribir "Recuerde que la nota debe estar entre 0 y 10 sin puntos ni comas";
							Escribir "Ingrese la nota para: ",nombreCompleto[7], " Identificación No.: ",numIdentificacion[7];
							Leer notas[7];
							Si notas[7] >= 0  y  notas[7] <= 10 Entonces
								
								Escribir "la nota ha sido agregada con EXITO";
							SiNo
								Escribir "Error: la nota digitada no es válida";
								Escribir "";
								notas[7]<-0;
							FinSi
						
					FinSegun
				Hasta Que opcion2 = 0
				
				
			3:
				
				
				Repetir
					Escribir "--CONSULTA Y RESULTADO DE PRUEBAS";
					Escribir "";
					Escribir "No aprobó: Notas entre 0 y 6";
					Escribir "APROBADO: Notas entre 7 y 10";
					Escribir "";
					Escribir "[1] Nombre: ",nombreCompleto[0],"- Identificación No. ",numIdentificacion[0],"- Nota: ",notas[0]; 
					Escribir "[2] Nombre: ",nombreCompleto[1],"- Identificación No. ",numIdentificacion[1],"- Nota: ",notas[1];
					Escribir "[3] Nombre: ",nombreCompleto[2],"- Identificación No. ",numIdentificacion[2],"- Nota: ",notas[2];
					Escribir "[4] Nombre: ",nombreCompleto[3],"- Identificación No. ",numIdentificacion[3],"- Nota: ",notas[3];
					Escribir "[5] Nombre: ",nombreCompleto[4],"- Identificación No. ",numIdentificacion[4],"- Nota: ",notas[4];
					Escribir "[6] Nombre: ",nombreCompleto[5],"- Identificación No. ",numIdentificacion[5],"- Nota: ",notas[5];
					Escribir "[7] Nombre: ",nombreCompleto[6],"- Identificación No. ",numIdentificacion[6],"- Nota: ",notas[6];
					Escribir "[8] Nombre: ",nombreCompleto[7],"- Identificación No. ",numIdentificacion[7],"- Nota: ",notas[7];
					Escribir "";
					Escribir "Presione 0 para regresar al menú";
					Leer opcion3;
					
				Hasta Que opcion3 = 0
				
				
				

		FinSegun
		
		
	Hasta Que opcion = 0
	
	
	
	
FinProceso
