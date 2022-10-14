SubProceso llenarMatriz(datos)
	
	Definir i, j Como Entero;
	
	Para i <- 1 Hasta 10 Con Paso 1 Hacer
		
		Para j <- 1 Hasta 10 Con Paso 1 Hacer
			
			Si i <> 10 Entonces
				Escribir Sin Saltar j, "x", i,"   ";  
			SiNo
				Escribir Sin Saltar j, "x", i,"   "; 
			FinSi
			
		FinPara
		
		Escribir " ";
	FinPara
	
FinSubProceso

SubProceso multiplicacionfilasxcolumnas(datos) 
	
	Definir i, j Como Entero;
	
	Para  i<- 0 Hasta 10 Con Paso 1 Hacer
		
		Para j <-0 Hasta 10 Con Paso 1 Hacer
			
			datos[i,j]<-i*j;
			
		FinPara
		
	FinPara
	
FinSubProceso

Proceso Taller4Ejercicio5
	
	Definir matriz, i, j, numFila, numColumna Como Entero;
	
	Dimension matriz[11,11];
	
	//llenar la matriz
	llenarMatriz(matriz);
	
	
	Escribir "";
	
	// multiplicacion de filas y columnas
	multiplicacionfilasxcolumnas(matriz);
	
	
	Escribir "Ingrese el número de la fila: ";
	Leer numFila;
	Escribir "Ingrese el número de la Columna: ";
	Leer numColumna;
	
	Escribir matriz[numFila, numColumna];
	
	
	
	
	
	
	
	
	
	
	
	
	
FinProceso
