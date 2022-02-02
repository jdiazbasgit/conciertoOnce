package trenes;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

	public static void main(String[] args) {
		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		Set<Tren> trenesJuntos = juntarTrenes("pepe", 5, t1, t2, t3, t4, t5, t6);

		for (Tren tren : trenesJuntos) {
			System.out.println(tren.toString());
		}

	}

	private static Set<Tren> juntarTrenes(String texto, int numero, Tren... trenes) {
		Set<Tren> trenesSet = new HashSet<Tren>();

		for (int i = 0; i < trenes.length; i++) {
			trenesSet.add(trenes[i]);
		}

		return trenesSet;

	}

}
