package trenes.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import trenes.comparar.CompararDestino;
import trenes.comparar.CompararOrigen;
import trenes.comparar.CompararPasajeros;

public class EjemploList {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		while (true) {
			menu();

			TreeSet<Tren> trenesJuntos = juntarTrenes(t1, t2, t3, t4, t5, t6);

			for (Tren tren : trenesJuntos) {
				System.out.println(tren.toString());

			}
		}

	}

	private static  TreeSet<Tren> juntarTrenes(Tren... trenes) {

		TreeSet<Tren> trenesList = null;

		
		try {
			int tipo = Integer.parseInt(leerTeclado());
			switch (tipo) {

			case 1:
				trenesList = new TreeSet<Tren>(new CompararOrigen());

				break;
			case 2:
				trenesList = new TreeSet<Tren>(new CompararDestino());

				break;
			case 3:
				trenesList = new TreeSet<Tren>(new CompararPasajeros());

				break;

			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("opcion no valida");
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("debes escribir un numero");
		}

		for (int i = 0; i < trenes.length; i++) {
			trenesList.add(trenes[i]);

		}

		return (TreeSet<Tren>) trenesList;

	}

	public static void menu() {

		System.out.println("Elige una opci�n");
		System.out.println("==================");
		System.out.println("1.- Comparar por origen");
		System.out.println("2.- Comparar por destino");
		System.out.println("3.- Comparar por pasajeros");
		System.out.println("4.- Salir");
	
	}

	private static String leerTeclado() {

		try {
			
			return new BufferedReader(new InputStreamReader(System.in)).readLine();

		} catch (IOException e) {
			
			return null;
		}
	}

}
