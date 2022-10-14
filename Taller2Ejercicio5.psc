SubProceso devolucionProductos
	
	Definir nombreProducto, novedades como cadena;
	
	Escribir"Producto a devolver: " ;
	Leer nombreProducto;
	
	Escribir "Novedades: ";
	Leer novedades;
	
	Escribir "La Devolución de >>>> ",nombreProducto, " <<<< fue exitosa." ;
	Escribir "Novedades :",novedades;
	
FinSubProceso

SubProceso listaProductosDisponibles
	
	Definir productoDisponible Como Entero;
	
	Escribir " Lista de Productos disponibles";
	Escribir "";
	Escribir " *Elija el producto que desea comprar*";
	Escribir "";
	Escribir " [1]. - Acetaminofen c/u - Precio: $ 800";
	Escribir " Caracteristica: Lab.GENFAR:Sirve para dolor de cabeza";
	Escribir " ";
	Escribir " [2]. - Aspirina c/u - Precio: $ 1.000";
	Escribir " Caracteristica: Lab. Sanofi:Sirve para dolencias generales";
	Escribir " ";
	Escribir " [3]. - Ibuprofeno c/u - Precio: $ 1.100";
	Escribir " Caracteristica: Lab. Janssen Sirve para aliviar la fiebre";
	Escribir " ";
	Escribir " Presione 0 para Regresar al Menú Principal";
	
	Leer productoDisponible;
	
	Segun productoDisponible Hacer
		1:
			Escribir "**********************************************";
			Escribir "*  Gracias por su compra usted ha adquirido  *";
			Escribir "*                ACETAMINOFEN                *";
			Escribir "**********************************************";
		2:
			Escribir "**********************************************";
			Escribir "*  Gracias por su compra usted ha adquirido  *";
			Escribir "*                  ASPIRINA                  *";
			Escribir "**********************************************";
		3:
			Escribir "**********************************************";
			Escribir "*  Gracias por su compra usted ha adquirido  *";
			Escribir "*                IBUPROFENO                  *";
			Escribir "**********************************************";
			
			
			
	FinSegun
	
FinSubProceso






Proceso Taller2Ejercicio5
	//La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación
	//para poder facturar los productos que vende a sus clientes y para ello,
	//los productos tienen unas características que deben indicársele al cliente para que pueda escoger el producto a comprar.
	//Para cada cliente, se tienen las opciones de compra de producto,
	//consulta de precios por producto y devoluciones en caso de que se presenten.
	
	
	
	Definir opcion  Como Entero;
	
	Repetir
		Escribir "**********************************************";
		Escribir "*         Bienvenido a la Drogueria          *";
		Escribir "*                -MI SALUD-                  *";
		Escribir "**********************************************";		
		Escribir "               -Elija una opción- ";
		Escribir "";
		Escribir "[1]. -Medicamentos";
		Escribir "[2]. -Devolución de Productos";
		Escribir "[0]. -Salir";
		
		leer opcion;
		
		Segun opcion Hacer
			
			1:  
				listaProductosDisponibles;
				
				
			2:
				devolucionProductos;
				
		FinSegun
		
		
	Hasta Que opcion = 0 
	
	
FinProceso
