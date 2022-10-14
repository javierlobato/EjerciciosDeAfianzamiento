Proceso Taller2Ejercicio7
	//La Secretaría de Salud Municipal requiere de una aplicación que le permita calcular el IMC (Índice de masa corporal)
	//y requiere los datos peso en kilogramos y estatura en metros Para cada persona encuestada adicional a los datos suministrados,
	//debe mostrar el resultado para cada uno y establecer en qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).
	
	
	Definir peso,estatura, imc Como Real;
	
	
	
	Escribir "**********************************************";
	Escribir "*       SECRETARÍA DE SALUD MUNICIPAL        *";
	Escribir "*     -CÁLCULO ÍNDICE DE MASA CORPORAL-      *";
	Escribir "**********************************************";	
	
	Escribir "Ingrese su peso en Kilogramos (kg): ";
	Leer peso;
	
	Escribir "Ingrese su estatura en Metros (m): ";
	Leer estatura;
	
	//imc <- peso/(estatura*estatura);
	
	imc <- peso/(estatura*estatura);	
	
	Si (imc < 18.5) Entonces
		Escribir "Su IMC  es: ",imc," usted tiene BAJO PESO";
		
	SiNo
		Si (imc >= 18.5 Y imc <= 24.9) Entonces
			Escribir "Su IMC  es: ",imc," usted tiene peso NORMAL";
		SiNo
			Si (imc >= 25.0 y imc <= 29.9) Entonces
				Escribir "Su IMC  es: ",imc," usted tiene SOBREPESO";
			SiNo
				Escribir "Su IMC  es: ",imc," usted tiene OBESIDAD";
			FinSi
		FinSi
	
	FinSi
	
	
	
FinProceso
