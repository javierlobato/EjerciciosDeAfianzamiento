SubProceso numerosPrimos(datos) 	
	
	definir num, contador, j Como Entero;
	
	contador<-0;
	j<-1;
	Mientras 	j <= datos Hacer
		
		Si datos mod j == 0 Entonces
			contador<-contador+1;
			
		FinSi
		
		j<-j+1;
		
	FinMientras
	Si contador == 2 Entonces
		
		Escribir "Numeros Primos del 1 - 1000: ",datos;
		
		
	FinSi
	
FinSubProceso



Proceso Taller4Ejercicio3
	
	definir num, contador, j Como Entero;
	
	
	
	
	Para num <- 1 hasta 1000 hacer
		contador<-0;
		
		numerosPrimos(num);
		
	FinPara
	
	
FinProceso
