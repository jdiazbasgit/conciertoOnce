package trenes;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class MenuTrenes {

	public static void main(String[] args) {
		Tren t1 = new Tren("Madrid", "Sevilla", 120);
		Tren t2 = new Tren("Barcelona", "Zaragoza", 290);
		Tren t3 = new Tren("Segovia", "Alicante", 150);
		Tren t4 = new Tren("Madrid", "La Coruña", 130);
		Tren t5 = new Tren("Tenerife", "Valencia", 110);
		Tren t6 = new Tren("Francia", "Madrid", 125);
		Tren t7 = new Tren("Irun", "Francia", 109);
		Tren t8 = new Tren("Malaga", "Alicante", 102);

		TreeSet<Tren> trenesJuntos = null;
		Comparator<Tren> comparadorTrenes = null;

		while (true) {
			menu();
			try {
				int opcion = leerTeclado();
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
					System.out.println("Fin del programa...");
					System.exit(0);
				default:
					System.out.println("Debe indicar una opcion valida...");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			trenesJuntos = juntarTrenes(comparadorTrenes,t1,t2,t3,t4,t5,t6,t7);
			for(Tren tren:trenesJuntos) {
				System.out.println(tren.toString());
			}
		}

	}

	private static TreeSet<Tren> juntarTrenes(Comparator<Tren> comparadorTrenes, Tren...trenes) {
		
		TreeSet<Tren> trenesTreeSet = new TreeSet<Tren>(comparadorTrenes);
		for(int i=0;i<trenes.length;i++) trenesTreeSet.add(trenes[i]);
		return trenesTreeSet;
	}

	public static void menu() {
		System.out.println("");
		System.out.println("----- Menu ordenacion de trenes -----");
		System.out.println("1 Por origen");
		System.out.println("2 Por destino");
		System.out.println("3 Por pasajeros");
		System.out.println("4 Salir...");
		System.out.print("Introduzca una opcion: ");
	}

	@SuppressWarnings("resource")
	public static int leerTeclado() {
		return new Scanner(System.in).nextInt();
	}

}
