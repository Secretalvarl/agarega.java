package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz
{
	public int menuYSeleccion(Scanner sc) 
	{
		int opcion;
		
		System.out.println("--------------------");
		System.out.println("|0. Añadir venta   |");
		System.out.println("|1. Gestionar venta|");
		System.out.println("|2. Mostrar venta  |");
		System.out.println("|3. Cerrar menu    |");
		System.out.println("---------------------");
		System.out.println("Seleccione una opcion");
		
		opcion = sc.nextInt();
				
		return opcion;
		
	}

	public int solicitarVenta(Scanner sc) 
	{
		int numeroInicial = 0;
		
		System.out.println("Escriba cual ha sido la venta");
		int numeroVenta = sc.nextInt();
		
		numeroInicial = numeroVenta + numeroInicial;
		
		System.out.println(numeroInicial);
		
		return numeroInicial;
		
	}
	
	
 

}
