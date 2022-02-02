package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class EjemploSet {

	public static void main(String[] args) {

		while (true) {

			menu();

			int opcion = Integer.parseInt(leerTeclado());

			switch (opcion) {

			case 1:

				ListadoDeTrenes.trenesList = new TreeSet<Tren>(new ComparadorOrigen());
				ListadoDeTrenes.pintaJuntos();

				break;

			case 2:

				ListadoDeTrenes.trenesList = new TreeSet<Tren>(new ComparadorDestino());
				ListadoDeTrenes.pintaJuntos();

				break;

			case 3:
				ListadoDeTrenes.trenesList = new TreeSet<Tren>(new ComparadorPasajeros());
				ListadoDeTrenes.pintaJuntos();

				break;

			case 4:

				System.exit(0);

			default:

				System.out.println("Opci�n no v�lida.");
			}

		}

	}

	public static void menu() {
		System.out.println("==================");
		System.out.println("Menu de trenes");
		System.out.println("==================");
		System.out.println("1.- Comparar por ORIGEN");
		System.out.println("2.- Comparar por DESTINO");
		System.out.println("3.- Comparar por PASAJEROS");
		System.out.println("4.- Terminar");
		System.out.println("Teclea opcion:");
	}

	private static String leerTeclado() {

		try {
			return new BufferedReader(new InputStreamReader(System.in)).readLine();

		} catch (IOException e) {
			return null;

		}
	}
}
