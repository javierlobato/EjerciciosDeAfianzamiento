Proceso Taller4Ejercicio3
	
	definir num, contador, x Como Entero;
	
	
	
	
	Para num <- 1 hasta 1000 hacer
		
		contador<-0;
		x<-1;
		
		Mientras 	x <= num Hacer
			
			Si num mod x == 0 Entonces
				contador<-contador+1;
			
			FinSi
			
			x<-x+1;
			
		FinMientras
		
		
		Si contador == 2 Entonces
			
			Escribir "Numeros Primos del 1 - 1000: ",num;
			
			
		FinSi
		
	FinPara
	
	
FinProceso
