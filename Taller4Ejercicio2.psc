SubProceso arreglosImpares(datos) 
	
	Definir j Como Entero;
	
	Para j <- 0 Hasta 19  Con Paso 1 Hacer
		
		Si datos[j] mod 2 <> 0 Entonces
			
			Escribir Sin Saltar , datos[j] ,", ";
			
			
			
		FinSi
		
		
		
	FinPara 
	
	
FinSubProceso

SubProceso arreglosPares(datos)
	
	Definir j Como Entero;
	
	Para j <- 0 Hasta 19  Con Paso 1 Hacer
		
		Si datos[j] mod 2 = 0 Entonces
			
			Escribir Sin Saltar , datos[j] ,", ";
			
			
			
		FinSi
		
		
		
	FinPara 
FinSubProceso



Proceso Taller4Ejercicio2
	
	
	Definir vector,contador,j,num Como Entero;
	Definir encontrado Como Logico;
	
	encontrado<-Falso;
	contador<-0;
	Dimension vector[20];
	
	vector[0]<-0; vector[1]<-0; vector[2]<-0; vector[3]<-0; vector[4]<-0; vector[5]<-0; vector[6]<-0; vector[7]<-0; vector[8]<-0; vector[9]<-0;
	vector[10]<-0; vector[11]<-0; vector[12]<-0; vector[13]<-0; vector[14]<-0; vector[15]<-0; vector[16]<-0; vector[17]<-0; vector[18]<-0; vector[19]<-0;
	
	
	Repetir
		
		num<- azar(100);
		
		vector[contador]<-num;
		
		Escribir vector[contador] ," - ", contador;
		
		
		contador<-contador+1;
		
		
	Hasta Que contador = 20
	
	Escribir Sin Saltar "Número Pares: ";
	
	arreglosPares(vector);
	
	Escribir "";
	
	Escribir Sin Saltar "Número Impares: ";
	
	arreglosImpares(vector);
	Escribir "";
	
	
FinProceso
