package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperarImplementacion;
import Servicios.OperarInterfaz;

/**
 * Clase principal de nuestra a aplicacion
 * 05/12/2023 - agb
 */
public class inicioAplicacion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MenuInterfaz omega = new MenuImplementacion();
		OperarInterfaz alpha = new OperarImplementacion();		
		boolean cerrarMenu = false;
		
		
		while(!cerrarMenu) 
		{
			int opcionSeleccionada = omega.menuYSeleccion(sc);
			
			switch (opcionSeleccionada) {
			
			case 0:
				System.out.println("Añadir venta");
				omega.solicitarVenta(sc);
			    break;
			case 1:
				System.out.println("Gestionar gasto");
				alpha.numeroGasto(sc);
				break;
			case 2:
				System.out.println("Modificar venta");
                long total = alpha.numeroGasto(sc);
				long numeroTotal = total;
				if(numeroTotal == 0) {
					System.out.println("Vamos mal " + numeroTotal);
				}else {
					System.out.println("Vamos muy mal " + numeroTotal);
				}
				break;
			case 3:
				System.out.println("Menu cerrado");
				cerrarMenu = true;
				break;
			default:
				break;
			
			
			}
			
			
			
			
			
		
			
		}
		
		

	}

}
