package Servicios;

import java.util.Scanner;

public class OperarImplementacion implements OperarInterfaz 
{
	MenuImplementacion mi = new MenuImplementacion();
	
	public int numeroGasto(Scanner sc) 
	{
		
        int numeroTotal = mi.solicitarVenta(sc);
		
		System.out.println("Escriba cual ha sido el gasto");
		int numeroGasto = sc.nextInt();
		
		int numeroDefinitivo = numeroTotal - numeroGasto;
		
		if(numeroDefinitivo == 0)
		{
			System.out.println("Estas en 0 ");
		}else {
			
			System.out.println("Debes dinero");
		}
		
		System.out.println(numeroDefinitivo);
		
		return numeroDefinitivo;	
			
		
		
	}
}
