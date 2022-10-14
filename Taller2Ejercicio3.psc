SubProceso calcularedad<- verificacionEdad (edad)
	
	Si  edad >= 18  Entonces
		Escribir " Usted es mayor de edad, por lo tanto puede entrar a la fiesta.";
		
	SiNo
		Escribir " Usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.";
		
	FinSi
	
	
FinSubProceso

Proceso Taller2Ejercicio3
	//Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona.
	//Si la persona es mayor o igual a 18 años, entonces se deberá imprimir en pantalla 
//	//[Nombre completo] usted es mayor de edad, por lo tanto puede entrar a la fiesta.
	//Si la edad de la persona es menor que 18 años, entonces, deberá imprimirse el siguiente mensaje:
	//[Nombre completo] usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.
	
	Definir nombre,apellido como cadena;
	definir edad Como Entero;
	
	Escribir "Ingrese su nombre: ";
	Leer nombre;
	Escribir "Ingrese su apellido: ";
	Leer apellido;
	Escribir "Ingrese su edad: ";
	Leer edad;
	
	
	Escribir nombre," ",apellido, verificacionEdad(edad);
	
	
FinProceso
