SubProceso mostrarAreglo(datos)
	
	Definir j Como Entero;
	
	
	Para j <- 0 Hasta 4 Con Paso 1 Hacer
		escribir "[",j,"] ", datos[j];
	FinPara
	
	
FinSubProceso

Proceso Taller4Ejercicio1
	
	Definir vectores1,contador, num, j Como Entero;
	
	Dimension vectores1[5];
	contador<-0;
	vectores1[0]<-0; vectores1[1]<-0; vectores1[2]<-0; vectores1[3]<-0; vectores1[4]<-0;
	num<-1;
	
	
	Repetir
		
		Escribir "Digite un número ";
		Leer vectores1[contador];
		
		
		num<-num+1;
		contador<-contador+1;
	Hasta Que contador = 5
	
	mostrarAreglo(vectores1);
	
	
FinProceso
