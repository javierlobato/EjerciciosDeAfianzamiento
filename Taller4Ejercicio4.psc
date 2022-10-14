SubProceso mostrar16hasta20(datos)
	
	Definir i, j Como Entero;
	
	Para i <- 3 Hasta 3 Con Paso -1 Hacer
		
		Para j <- 4 Hasta  0 Con Paso -1 Hacer
			Escribir Sin Saltar datos[i,j], " ";
			
		FinPara
		Escribir " ";
		
	FinPara
	
FinSubProceso

SubProceso mostrar11hasta15(datos)
	
	Definir i, j Como Entero;
	
	
	Para i <- 2 Hasta 2 Con Paso 1 Hacer
		
		Para j <- 0 Hasta  4 Con Paso 1 Hacer
			Escribir Sin Saltar datos[i,j], " ";
			
		FinPara
		Escribir " ";
		
	FinPara
	
FinSubProceso

SubProceso mostrar10hasta06(datos)
	Definir i, j Como Entero;
	
	Para i <- 1 Hasta 1 Con Paso -1 Hacer
		
		Para j <- 4 Hasta  0 Con Paso -1 Hacer
			Escribir Sin Saltar datos[i,j], " ";
			
		FinPara
		Escribir " ";
		
	FinPara
	
	
FinSubProceso

SubProceso mostrar01hasta05 (datos)
	//mostrar datos desde el 01 hsata el 05
	
	Definir i, j Como Entero;
	
	Para i <- 0 Hasta 0 Con Paso 1 Hacer
		
		Para j <- 0 Hasta  4 Con Paso 1 Hacer
			Escribir Sin Saltar datos[i,j], " ";
			
		FinPara
		Escribir " ";
		
	FinPara
	
FinSubProceso

Proceso Taller4Ejercicio4
	
	Definir i,j Como entero;
	Definir matriz como caracter;
	Dimension matriz[4,5];
	
	Para i <- 0 Hasta 3 Con Paso 1 Hacer
		
		Para j <- 0 Hasta  4 Con Paso 1 Hacer
			Escribir Sin Saltar"Ingrese datos: ",i,",",j;
			Leer matriz[i,j];
		FinPara
		
	FinPara
	
	//mostrar del 01 hasta 05
	mostrar01hasta05(matriz);
	
	
	//mostrar del 10 hasta 06
	mostrar10hasta06(matriz);
	
	
	//mostrar del 11 hasta 15
	mostrar11hasta15(matriz);
	
	//mostrar del 16 hasta 20
	mostrar16hasta20(matriz);
	
	
	Escribir "";
FinProceso
