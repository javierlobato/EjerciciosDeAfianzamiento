SubProceso areaTrapecio
	Definir area,base,baseMayor,altura Como Real;
	
	Escribir "ÁREA DE UN TRAPECIO";
	Escribir "";
	Escribir "Digite la base menor: ";
	Leer base;
	Escribir "Digite la base mayor: ";
	Leer baseMayor;
	Escribir "Digite la altura";
	Leer altura;
	
	area <- ((base+baseMayor)*altura)/2;
	Escribir "El área del TRAPECIO es: ",area;
	
FinSubProceso

SubProceso areaTriangulo
	
	Definir area,base,altura Como Real;
	Escribir "ÁREA DE UN TRIÁNGULO";
	Escribir "";
	Escribir "Digite la base: ";
	Leer base;
	Escribir "Digite la altura";
	Leer altura;
	
	area <- (base*altura)/2;
	Escribir "El área del TRIÁNGULO es: ",area;
	
FinSubProceso

SubProceso areaRectangulo
	
	Definir base, altura, area Como Real;
	
	
	Escribir "ÁREA DE UN RECTÁNGULO";
	Escribir "";
	Escribir "Digite la base: ";
	Leer base;
	Escribir "Digite la altura";
	Leer altura;
	
	area <- base*altura;
	Escribir "El área del RECTÁNGULO es: ",area;
	
FinSubProceso



Proceso Taller2Ejercicio9
	//El profesor de geometría está explicando a sus estudiantes las fórmulas para calcular el área de diferentes figuras geométricas,
	//para ello requiere una aplicación que le facilite el ejercicio solicitándole los valores al estudiante. La aplicación debe permitir 
	//que el estudiante seleccione si desea calcular el área de un rectángulo, triángulo o trapecio. No olvide solicitar los datos necesarios 
	//para realizar cada y mostrar su respectivo resultado.
	
	Definir opcion Como entero;
	
	
	Repetir
		
		Escribir "";
		Escribir "¿QUE ÁREA DESEAS CALCULAR?";
		Escribir "";
		Escribir "[1] RECTÁNGULO";
		Escribir "[2] TRIÁNGULO";
		Escribir "[3] TRAPECIO";
		Escribir "[0] PARA SALIR";
		Leer opcion;
		
		Segun opcion Hacer
			1:
				
				areaRectangulo;
				
			2:
				areaTriangulo;
				
			3:
				areaTrapecio;
				
		FinSegun
		
		
		
		
		
	Hasta Que opcion = 0
	
	
	
	
FinProceso
