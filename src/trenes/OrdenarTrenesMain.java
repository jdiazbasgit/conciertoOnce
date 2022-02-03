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

	public static void main(String[] args) {
		Comparator<Tren> comparadorTrenes=null;
		Set<Tren> trenesTreeSet = null;		
		List<Tren> trenesList = Arrays.asList(	new Tren("Madrid","Barcelona",180),
												new Tren("Zaragoza","Barcelona",235),
												new Tren("Madrid","Sevilla",120),
												new Tren("Madrid","Sevilla",120),
												new Tren("Madrid","Sevilla",120),
												new Tren("Madrid","Sevilla",120)   );
		
		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
					case 1:
						System.out.println("\t**  Por Origen : **");
						comparadorTrenes= (tren01,tren02)->tren01.getOrigen().compareTo(tren02.getOrigen());												
						break;
					case 2:
						System.out.println("\t**  Por destino : **");
						comparadorTrenes= (tren01,tren02)->tren01.getDestino().compareTo(tren02.getDestino());
						break;
					case 3:
						System.out.println("\t**  Por pasajeros : **");
						comparadorTrenes= (tren01,tren02)->tren01.getPasajeros()-tren02.getPasajeros();
						break;
					case 4:
						System.out.println("\t===  FIN  ===");
						System.exit(0);
					default:
						System.out.println("Error => Opción no válida");
					}
			} catch (NumberFormatException e) {
				System.out.println("Error => Debes escribir un número");
			}
			
			trenesTreeSet = new TreeSet<Tren>(comparadorTrenes);
			trenesTreeSet.addAll ( trenesList);
			
			for (Tren tren : trenesTreeSet) {
				System.out.println(tren.toString());
			}
			System.out.println();
		}
	}

	private static String leerTeclado() {

		try {
			return new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			return null;
		}
	}

	public static void menu() {

		System.out.println("\tOrdenar Trenes Por...");
		System.out.println("\t\t==================");
		System.out.println("\t1.- Origen");
		System.out.println("\t2.- Destino");
		System.out.println("\t3.- Pasajeros");
		System.out.println("\t4.- Terminar");
		System.out.println("Teclea opción:");
	}

}

