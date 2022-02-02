package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EjemploList {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		TreeSet<Tren> trenesList = null;
		/*
		 * ComparadorDestino comparadorDestino= new ComparadorDestino();
		 * ComparadorOrigen comparadorOrigen= new ComparadorOrigen();
		 * ComparadorPasajeros comparadorPasajeros= new ComparadorPasajeros();
		 */

		while (true) {

			menu();

			int opcion = Integer.parseInt(leerTeclado());

			switch (opcion) {
			case 1:
				trenesList = new TreeSet<Tren>(new ComparadorOrigen());
				juntarTrenes(trenesList, t1, t2, t3, t4, t5, t6);
				pintaTrenes(trenesList);
				break;

			case 2:
				trenesList = new TreeSet<Tren>(new ComparadorDestino());
				juntarTrenes(trenesList, t1, t2, t3, t4, t5, t6);
				pintaTrenes(trenesList);
				break;

			case 3:
				trenesList = new TreeSet<Tren>(new ComparadorPasajeros());
				juntarTrenes(trenesList, t1, t2, t3, t4, t5, t6);
				pintaTrenes(trenesList);
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("opcion no valida");
			}

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

	private static void juntarTrenes(TreeSet<Tren> lista, Tren... trenes) {
		lista.clear();
		for (int i = 0; i < trenes.length; i++) {
			lista.add(trenes[i]);
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
}
