package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class MenuTrenes {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);


		while (true) {
			menu(); 
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:
					compararDestino(t1, t2, t3, t4, t5, t6);
					break;
				case 2:
					compararOrigen(t1, t2, t3, t4, t5, t6);
					break;
				case 3:
					compararPasajeros(t1, t2, t3, t4, t5, t6);
					break;
				case 4:
					System.exit(0);

				default:
					System.out.println("OPCIÓN NO VALIDA");
				}
			} catch (NumberFormatException e) {
				System.out.println("DEBES ESCRIBIR UN NÚMERO");
			}
		}

	}

	private static void compararDestino(Tren... trenes) {

		TreeSet<Tren> trenesList = new TreeSet<Tren>(new ComparadorDestino());

		juntarTrenes(trenesList,trenes);
		
		pintaTrenes(trenesList);
	}

	private static void compararOrigen(Tren... trenes) {

		TreeSet<Tren> trenesList = new TreeSet<Tren>(new ComparadorOrigen());
		juntarTrenes(trenesList,trenes);
		pintaTrenes(trenesList);
	}

	private static void compararPasajeros(Tren... trenes) {

		TreeSet<Tren> trenesList = new TreeSet<Tren>(new ComparadorPasajeros());

		juntarTrenes(trenesList,trenes);
		pintaTrenes(trenesList);
	}

	private static void juntarTrenes(TreeSet<Tren> lista, Tren... trenes) {
		lista.clear();
		for (int i = 0; i < trenes.length; i++) {
			lista.add(trenes[i]);
		}
	}

	private static void pintaTrenes(TreeSet<Tren> trenes) {
		for (Tren tren : trenes) {
			System.out.println(tren);
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

		System.out.println("COMPARADOR TRENES");
		System.out.println("==============");
		System.out.println("1.- COMPARADOR POR DESTINO");
		System.out.println("2.- COMPARADOR POR ORIGEN");
		System.out.println("3.- COMPARADOR POR PASAJEROS");
		System.out.println("4.- TERMINAR");
		System.out.println();
		System.out.println("TECLEA UNA OPCIÓN:");
	}

}
