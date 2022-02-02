package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class MenuDeOpciones {

	

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		TreeSet<Tren> trenesJuntos = null;

		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());

				switch (opcion) {

				case 1: 
					trenesJuntos = new TreeSet<Tren>(new ComparadorOrigen());
					break;

				case 2:
					trenesJuntos = new TreeSet<Tren>(new ComparadorDestino());
					break;
				case 3: 
					trenesJuntos = new TreeSet<Tren>(new ComparadorPasajeros());
					break;
				case 4:

					System.exit(0);

				default:
					System.out.println("opcion no valida");
				}
				juntarTrenes(trenesJuntos, t1, t2, t3, t4, t5, t6);
				pintarTrenes(trenesJuntos);

			} catch (NumberFormatException e) {
				System.out.println("debes escribir un numero");
			}
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

	@SuppressWarnings("unused")
	private static Set<Tren> juntarTrenes(Tren... trenes) {

		int tipo = 3;

		Set<Tren> trenesList = null;
		if (tipo == 1)
			trenesList = new TreeSet<Tren>(new ComparadorOrigen());
		if (tipo == 2)
			trenesList = new TreeSet<Tren>(new ComparadorDestino());
		if (tipo == 3)
			trenesList = new TreeSet<Tren>(new ComparadorPasajeros());

		for (int i = 0; i < trenes.length; i++) {
			trenesList.add(trenes[i]);
		}

		return trenesList;

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

	public static void menu() {

		System.out.println("Menu  Trenes");
		System.out.println("==================");
		System.out.println("1.- Origen");
		System.out.println("2.- Destino");
		System.out.println("3.- Pasajeros");
		System.out.println("4.- Terminar");
		System.out.println("Teclea opción:");
	}

}
