SubProceso calcularedad<- verificacionEdad (edad)
	
	Si ( edad <= 18 ) Entonces
		Escribir "Usted aún es un niño(a)";
	SiNo
		Escribir "Sólo para menores de 18 años";
	FinSi
	
	
FinSubProceso

Proceso Taller2Ejercicio2
	//Realizar un programa en el cual se solicite la edad de una persona.
	//Si la persona es menor a 18 años, deberá mostrar en pantalla: Usted aún es un niño(a).
	
	Definir edad Como Entero;
	
	Escribir "Por favor digite su edad: ";
	Leer edad;
	
	edad<-verificacionEdad(edad);
	
	
FinProceso
