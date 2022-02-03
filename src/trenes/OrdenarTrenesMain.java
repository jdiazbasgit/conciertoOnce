package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OrdenarTrenesMain {

	private static final String MENSAJE_ORIGEN = "\t**  Por Origen : **";
	private static final String MENSAJE_DESTINO = "\t**  Por destino : **";
	private static final String MENSAJE_PASAJEROS = "\t**  Por pasajeros : **";
	private static final String MENSAJE_FIN = "\t===  FIN  ===";
	private static final String MENSAJE_ERROR_OPCION = "Error => Opción no válida";
	private static final String MENSAJE_ERROR_NUMERO = "Error => Debes escribir un número";

	private static final String[] TEXTO_OPCIONES_MENU = { 	"\tOrdenar Trenes Por...",
															"\t\t==================",
															"\t1.- Origen",
															"\t2.- Destino",
															"\t3.- Pasajeros",
															"\t4.- Terminar",
															"Teclea opción:"    };

	
	public static void main(String[] args) {
		
		String mensaje = "";
		Comparator<Tren> comparadorTrenes = null;
		Set<Tren> trenesTreeSet = null;
		List<Tren> trenesList = Arrays.asList(  new Tren("Madrid", "Barcelona", 180),
												new Tren("Barcelona", "Sevilla", 200), 
												new Tren("Zaragoza", "Barcelona", 235),
												new Tren("Madrid", "Sevilla", 120), 
												new Tren("Madrid", "Sevilla", 120),
												new Tren("Madrid", "Sevilla", 120), 
												new Tren("Madrid", "Sevilla", 120)  );

		while (true) {
			
			mostrarMenu(TEXTO_OPCIONES_MENU);
			
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:
					mensaje = MENSAJE_ORIGEN;
					comparadorTrenes = (tren01, tren02) -> tren01.getOrigen().compareTo(tren02.getOrigen());
					break;
				case 2:
					mensaje = MENSAJE_DESTINO;
					comparadorTrenes = (tren01, tren02) -> tren01.getDestino().compareTo(tren02.getDestino());
					break;
				case 3:
					mensaje = MENSAJE_PASAJEROS;
					comparadorTrenes = (tren01, tren02) -> tren01.getPasajeros() - tren02.getPasajeros();
					break;
				case 4:
					mensaje = MENSAJE_FIN;
					System.exit(0);
				default:
					mensaje = MENSAJE_ERROR_OPCION;
					// continue; Se salta el resto de la ejecución de las instrucciones contenidas en el bucle while
					// y pasa directamente a ejecutar la condición del bucle while en la línea 42 
					// Es decir no ejecuta el código contenido entre las líneas 72 y 82
					continue;  
				}
			} catch (NumberFormatException e) {
				mensaje = MENSAJE_ERROR_NUMERO;
				continue;
			} finally {
				System.out.println(mensaje);
			}

			trenesTreeSet = new TreeSet<Tren>(comparadorTrenes);
			trenesTreeSet.addAll(trenesList);

			for (Tren tren : trenesTreeSet) {
				System.out.println(tren);
			}
			System.out.println();   //salto de línea
		}
	}

	private static String leerTeclado() {

		try {
			return new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			return null;
		}
	}

	public static void mostrarMenu(String... texto_opciones_Menu) {

		for (String texto_opcion : texto_opciones_Menu) {
			System.out.println(texto_opcion);
		}
	}

}
