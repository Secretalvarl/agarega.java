
package Servicios;

import java.util.Scanner;

/**
 * Catalogo de los metodos del menu
 * 05/12/2023 - agb
 */
public interface MenuInterfaz {
	
	/**
	 * Metodo que muestra el menu por consola 
	 * 05/12/2023 - agb
	 * @param sc
	 * @return
	 */
	
	public int menuYSeleccion(Scanner sc );
	
	/**
	 * Metodo que solicita la cantidad de la venta
	 * 05/12/2023 - agb
	 * @param sc
	 * @return
	 */
	public int solicitarVenta(Scanner sc);

}
