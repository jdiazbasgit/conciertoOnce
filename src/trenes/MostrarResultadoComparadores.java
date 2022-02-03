package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class MostrarResultadoComparadores {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		TreeSet<Tren> trenesJuntos = (null);

		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());

				switch (opcion) {

				case 1:
					trenesJuntos = new TreeSet<Tren>(new ComparadorDestino());
					break;

				case 2:
					trenesJuntos = new TreeSet<Tren>(new ComparadorOrigen());
					break;

				case 3:
					trenesJuntos = new TreeSet<Tren>(new ComparadorPasajeros());
					break;

				case 4:
					System.exit(0);

				default:
					System.out.println("opcion no valida");
				}
			} catch (NumberFormatException e) {
				System.out.println("debes escribir un numero");
			}
			juntarTrenes(trenesJuntos, t1, t2, t3, t4, t5, t6);
			pintarTrenes(trenesJuntos);
		}

	}

	private static void pintarTrenes(TreeSet<Tren> trenesJuntos) {
		for (Tren tren : trenesJuntos) {
			System.out.println(tren);
		}
	}

	private static void juntarTrenes(TreeSet<Tren> trenesJuntos, Tren... trenes) {

		for (int i = 0; i < trenes.length; i++) {
			trenesJuntos.add(trenes[i]);
		}

	}

	
	private static String leerTeclado() {
		try {
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			return bufferedReader.readLine();

		} catch (IOException e) {
			return null;
		}

	}

	private static void menu() {
		System.out.println("Aplicación de filtrado de Trenes");
		System.out.println("==================");
		System.out.println("1.- Destino");
		System.out.println("2.- Origen");
		System.out.println("3.- Pasajeros");
		System.out.println("4.- Cerrar Aplicación");
		System.out.println("Teclea opción:");
	}

}
