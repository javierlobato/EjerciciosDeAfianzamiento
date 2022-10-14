Proceso Taller2Ejercicio10
	//El banco "Su banco fiel" es un banco que inicia sus actividades financieras y necesita una aplicación para 
	//llevar las cuentas de sus usuarios; por lo tanto,se sugiere que la cuenta tenga los atributos titular y cantidad. 
	//Para cada cliente las cuentas permitirán realizar ingresos retiros o consultas de valor. En los ingresos no se pueden 
	//insertar valores negativos y para los retiros el valor no puede ser mayor al valor que tiene en la cuenta.
	
	Definir opcion,montoIngresado,montoRetirar, saldoActual Como Entero;
	definir titular como cadena;
	montoIngresado <- 0;
	montoRetirar <- 0;
	
	Escribir "**********************************************";
	Escribir "*           >>>BIENVENIDO<<<                 *";
	Escribir "*          ****SU BANCO FIEL****             *";
	Escribir "**********************************************";	
	Escribir "Por favor ingrese nombre del titular: ";
	Leer titular;
	
	Repetir
		
		Escribir "**********************************************";
		Escribir "*          PORTAL TRANSACCIONAL              *";
		Escribir "*          ****SU BANCO FIEL****             *";
		Escribir "**********************************************";	
		Escribir "Bienvenido Sr(a): ", titular;
		Escribir "¿Que operación desea realizar?";
		Escribir "";
		Escribir "[1] INGRESAR DINERO";
		Escribir "[2] RETIRAR DINERO";
		Escribir "[3] CONSULTAR SALDO";
		Escribir "[0] PARA SALIR";
		Leer opcion;
		
		
		Segun opcion Hacer
			1:
				Escribir "Digite el monto que desea Ingresar: ";
				Escribir "[0] Para volver al menú";
				Leer montoIngresado;
				
				Si montoIngresado <= 0 Entonces
					Escribir "Error: Monto inválido";
				SiNo
					
					Escribir "Ingreso exitoso";
				FinSi
				
				
				
			2:
				Escribir "Digite el monto a Retirar";
				Escribir "[0] Para volver al menú";
				Leer montoRetirar;
				Si montoRetirar <= 0 O montoRetirar > montoIngresado  Entonces
					Escribir "Error: Monto inválido";
				SiNo
					
					Escribir "Retiro exitoso";
				FinSi
				
			3:
				saldoActual <- montoIngresado-montoRetirar;
				
				Escribir "Su saldo actual es: ", saldoActual;
				
				
			
		FinSegun
		
		
	Hasta Que opcion = 0
	
	
	
	
	
	
	
	
	
	
	
	
	
FinProceso
