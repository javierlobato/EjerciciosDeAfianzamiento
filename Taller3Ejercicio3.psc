Proceso Taller3Ejercicio3
	
	Definir lineas,linea,lineafinal,i,j,k,espacios Como Entero;
	
	lineas <-10;
	
	linea<- 1;
	i <- 1;
	j <- 1;
	
	lineafinal <- 2 * lineas - 1;
		
	Para i <- 1 Hasta lineas Con Paso 1 Hacer
		
		escribir ""; 
		espacios <- trunc((lineafinal - j) / 2) ;
		
		
		Para k <- 1 Hasta espacios Con Paso 1 Hacer
			Escribir Sin Saltar" ";
		FinPara
		
		Para k <- 1 Hasta j Con Paso 1 Hacer
			Escribir Sin Saltar"*";
		FinPara
		
		Para k <- 1 Hasta espacios Con Paso 1 Hacer
			Escribir  Sin Saltar" ";
		FinPara
		
		
		
		
		j <- j + 2;
		
		
		
	FinPara
	
	lineas<-4;
	linea<- 2;
	i <- 3;
	j <- 3;
	Para i <- 1 Hasta lineas Con Paso 2 Hacer
		
		escribir " "; 
		
		espacios <- trunc((lineafinal - j) / 2) ;
		
		
		Para k <- 1 Hasta espacios Con Paso 1 Hacer
			Escribir Sin Saltar" ";
		FinPara
		
		Para k <- 1 Hasta j Con Paso 1 Hacer
			Escribir Sin Saltar"*";
		FinPara
		
		Para k <- 1 Hasta espacios Con Paso 1 Hacer
			Escribir  Sin Saltar" ";
		FinPara
		
		j <- j + 2;
		
		
		
	FinPara
	
	Escribir "";
	
	
	
	
FinProceso
