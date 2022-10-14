Proceso Ejercicio5
	//Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota,el tipo de mascota y su nombre completo.
	//Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje:
	//[Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo] es actualmente su dueño(a)
	
	Definir nomMascota,tipoMascota,nomPropietario como cadena;
	Definir  edadMascota Como Entero;
	
	Escribir "Hola, ¿cuál es tu nombre completo?";
	Leer nomPropietario;
	
	Escribir nomPropietario,", ¿cuál es el nombre de tu mascota?";
	Leer nomMascota;
	
	Escribir "¿Qué tipo de mascota es ",nomMascota,"?";
	Leer tipoMascota;
	
	Escribir "¿Cuantos años tiene ",nomMascota,"?";
	leer edadMascota;
	
	Escribir nomMascota, " es un (a) ",tipoMascota, ", el cual, tiene ",edadMascota," años de edad y ",nomPropietario," es actualmente su dueño (a)";
	
	
	
	
FinProceso
