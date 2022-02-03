package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
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
		
		TreeSet<Tren> trenesJuntos = null;
		Comparator<Tren> comparadorTrenes = null;
		
		Set<Tren> trenesList = null;
		// TODO Auto-generated method stub
		while (true) {
			menu();
			try {

				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:
					comparadorTrenes = new ComparadorOrigen();
					break;
				case 2:
					comparadorTrenes = new ComparadorDestino();
					break;
				case 3:
					comparadorTrenes = new ComparadorPasajeros();
					break;
					
				case 4:

					System.exit(0);

				default:
					System.out.println("opcion no valida");
				}
			} catch (NumberFormatException e) {
				System.out.println("debes escribir un numero");
			}
			trenesJuntos = juntarTrenes(comparadorTrenes,t1,t2,t3,t4,t5,t6);
			for(Tren tren:trenesJuntos) {
				System.out.println(tren.toString());
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

private static TreeSet<Tren> juntarTrenes(Comparator<Tren> comparadorTrenes, Tren...trenes) {
		
		TreeSet<Tren> trenesTreeSet = new TreeSet<Tren>(comparadorTrenes);
		for(int i=0;i<trenes.length;i++) trenesTreeSet.add(trenes[i]);
		return trenesTreeSet;
	}

	private static String leerTeclado() {

		try {
			return new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			return null;
		}
	}
}
