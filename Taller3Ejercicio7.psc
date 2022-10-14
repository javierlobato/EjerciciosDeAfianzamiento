SubProceso MostrarArreglos(datos)
	
	Definir j,i,k Como Entero;
	i<-1;
	
	Para j<-0 Hasta 4 Con Paso 1 Hacer
		
		Escribir "[",i,"]",datos[j]; 
		i<-i+1;
			
	FinPara
	
	
FinSubProceso





Proceso Taller3Ejercicio7
	//El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los usuarios del barrio y 
	//requiere una aplicación que permita registrar los vehículos que se cuidan en estas instalaciones.
	//Se sugiere que el parqueadero tenga los atributos del vehículo como son, placa y marca, y
	//los datos del cliente como son nombre completo número de teléfono. Para cada vehículo se debe permitir la opción 
	//de ingresar al parqueadero, retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero.
	//Recuerde que el sistema debe terminar cuando el usuario así lo indique. Tenga en presente que el parqueadero solo 
	//puede almacenar máximo 5 vehículos.
	
	//variables definidas
	Definir opcion,opcion2, telefono Como Entero;
	Definir placa,marca,nombreCliente como cadena;
	
	
	
	//tamaño de los arreglos	
	Dimension telefono[5];
	Dimension placa[5];
	Dimension marca[5];
	Dimension nombreCliente[5];
	
	//inicializacion de arreglo evitar ¡¡ERROR DE INICIALIZACION!!
	placa[0]<-""; telefono[0]<-0; marca[0]<-""; nombreCliente[0]<-"Vacío"; 
	placa[1]<-""; telefono[1]<-0; marca[1]<-""; nombreCliente[1]<-"Vacío"; 
	placa[2]<-""; telefono[2]<-0; marca[2]<-""; nombreCliente[2]<-"Vacío"; 
	placa[3]<-""; telefono[3]<-0; marca[3]<-""; nombreCliente[3]<-"Vacío"; 
	placa[4]<-""; telefono[4]<-0; marca[4]<-""; nombreCliente[4]<-"Vacío"; 
	
	Repetir
		Escribir "**********************************************";
		Escribir "*          PARQUEADERO EL GUARDIÁN           *";
		Escribir "**********************************************";		
		Escribir "           -Seleccione una opción- ";
		Escribir "";
		Escribir "[1]. -CONSULTAR E INGRESAR VEHÍCULOS";		
		Escribir "[2]. -CONSULTAR Y DAR SALIDA DE VEHÍCULOS";
		Escribir "[0]. -SALIR";
		leer opcion;
		
		
		
		Segun opcion Hacer
			1:
				
				Escribir "Seleccione lugar de parqueo para INGRESAR vehículo";
				MostrarArreglos(placa); 
				Escribir "[0]. -SALIR-";
				leer opcion2;
				
				Segun opcion2 Hacer
					
					1:
						
						Escribir "Datos de Ingreso";
						Escribir "";
						Escribir "Nombre Completo: ";
						Leer nombreCliente[0];
						Escribir "Teléfono: ";
						leer telefono[0];
						Escribir "Marca: ";
						Leer marca[0];
						Escribir "Placa: ";
						Leer placa[0];				
						
						
					2:
						Escribir "Datos de Ingreso";
						Escribir "";
						Escribir "Nombre Completo: ";
						Leer nombreCliente[1];
						Escribir "Teléfono: ";
						leer telefono[1];
						Escribir "Marca: ";
						Leer marca[1];
						Escribir "Placa: ";
						Leer placa[1];	
						
					3:
						Escribir "Datos de Ingreso";
						Escribir "";
						Escribir "Nombre Completo: ";
						Leer nombreCliente[2];
						Escribir "Teléfono: ";
						leer telefono[2];
						Escribir "Marca: ";
						Leer marca[2];
						Escribir "Placa: ";
						Leer placa[2];	
						
					4:
						
						Escribir "Datos de Ingreso";
						Escribir "";
						Escribir "Nombre Completo: ";
						Leer nombreCliente[3];
						Escribir "Teléfono: ";
						leer telefono[3];
						Escribir "Marca: ";
						Leer marca[3];
						Escribir "Placa: ";
						Leer placa[3];	
					5:	
						
						Escribir "Datos de Ingreso";
						Escribir "";
						Escribir "Nombre Completo: ";
						Leer nombreCliente[4];
						Escribir "Teléfono: ";
						leer telefono[4];
						Escribir "Marca: ";
						Leer marca[4];
						Escribir "Placa: ";
						Leer placa[4];	
						
				FinSegun
				
			2:
				Repetir
					Escribir "Para darle SALIDA seleccione un lugar de parqueo";
					Escribir "";
					MostrarArreglos(placa);
					Escribir "[0]. -SALIR-";
					leer opcion2;
					
					
					Segun opcion2 Hacer
						
						1:
							Si opcion2 = 1 Entonces
								
								nombreCliente[0]<-"Vacío";
								marca[0]<-"";
								placa[0]<-"";
								telefono[0]<-0;
								
							FinSi
							
							
							
						2:
							Si opcion2 = 2 Entonces
								
								nombreCliente[1]<-"Vacío";
								marca[1]<-"";
								placa[1]<-"";
								telefono[1]<-0;
								
							FinSi	
							
						3:
							Si opcion2 = 3 Entonces
								
								nombreCliente[2]<-"Vacío";
								marca[2]<-"";
								placa[2]<-"";
								telefono[2]<-0;
								
							FinSi
							
						4:
							
							Si opcion2 = 4 Entonces
								
								nombreCliente[3]<-"Vacío";
								marca[3]<-"";
								placa[3]<-"";
								telefono[3]<-0;
								
							FinSi
						5:	
							
							Si opcion2 = 5 Entonces
								
								nombreCliente[4]<-"Vacío";
								marca[4]<-"";
								placa[4]<-"";
								telefono[4]<-0;
								
							FinSi
					FinSegun
				Hasta Que opcion2 = 0
				
			
		FinSegun
	Hasta Que opcion = 0
	
	
	
	
	
	
	
	
FinProceso
