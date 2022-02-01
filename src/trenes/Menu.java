package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Menu {

	public static void main(String[] args) {
		
		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		/*Set<Tren> trenesJuntos = juntarTrenes(t1, t2, t3, t4, t5, t6);

		for (Tren tren : trenesJuntos) {
			System.out.println(tren.toString());
		}*/
		
		
		Set<Tren> trenesList = null;
		// TODO Auto-generated method stub
		while (true) {
			menu();
			try {

				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:
					Set<Tren> trenesJuntos = juntarTrenes(t1, t2, t3, t4, t5, t6);

					for (Tren tren : trenesJuntos) {
						System.out.println(tren.toString());
					}
					
					

					break;
				case 2:
					
					Set<Tren> trenesJuntos2 = juntarTrenes2(t1, t2, t3, t4, t5, t6);

					for (Tren tren : trenesJuntos2) {
						System.out.println(tren.toString());
					}
					
					break;

				case 3:
					Set<Tren> trenesJuntos3 = juntarTrenes3(t1, t2, t3, t4, t5, t6);

					for (Tren tren : trenesJuntos3) {
						System.out.println(tren.toString());
					}
					break;
				case 4:

					System.exit(0);

				default:
					System.out.println("opcion no valida");
				}
			} catch (NumberFormatException e) {
				System.out.println("debes escribir un numero");
			}
		}

	}

	public static void menu() {

		System.out.println("Menu Trenes");
		System.out.println("==================");
		System.out.println("1.- Ordenar por Origen");
		System.out.println("2.- Ordenar por Destino");
		System.out.println("3.- Ordenar por Pasajeros");
		System.out.println("4.- Terminar");
		System.out.println("Teclea opción:");
	}

	private static Set<Tren> juntarTrenes(Tren... trenes) {
		int tipo = 1;

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
	private static Set<Tren> juntarTrenes2(Tren... trenes) {
		

		Set<Tren> trenesList = null;
		
		
			trenesList = new TreeSet<Tren>(new ComparadorDestino());
		
		for (int i = 0; i < trenes.length; i++) {
			trenesList.add(trenes[i]);
		}

		return trenesList;
	}
	private static Set<Tren> juntarTrenes3(Tren... trenes) {
		
		Set<Tren> trenesList = null;
		
			trenesList = new TreeSet<Tren>(new ComparadorPasajeros());

		for (int i = 0; i < trenes.length; i++) {
			trenesList.add(trenes[i]);
		}

		return trenesList;
	}

	private static String leerTeclado() {

		try {
			return new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			return null;
		}
	}
}
