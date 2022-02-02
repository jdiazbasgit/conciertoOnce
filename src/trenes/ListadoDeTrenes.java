package trenes;

import java.util.TreeSet;

public class ListadoDeTrenes {

	static Tren t1 = new Tren("Madrid", "Barcelona", 180);
	static Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
	static Tren t3 = new Tren("Madrid", "Sevilla", 120);
	static Tren t4 = new Tren("Bilbao", "Sevilla", 300);
	static Tren t5 = new Tren("Zaragoza", "Bilbao", 120);
	static Tren t6 = new Tren("Madrid", "Sevilla", 120);
	static Tren t7 = new Tren("Vigo", "Bilbao", 110);
	static TreeSet<Tren> trenesList = null;

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

	static void pintaJuntos() {

		juntarTrenes(trenesList, t1, t2, t3, t4, t5, t6, t7);
		pintaTrenes(trenesList);

	}

}
