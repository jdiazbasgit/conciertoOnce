




package trenes;

import java.util.Set;
import java.util.TreeSet;

public class ListConSet {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		Set<Tren> trenesJuntos = juntarTrenes(t1, t2, t3, t4, t5, t6);

		for (Tren tren : trenesJuntos) {
			System.out.println(tren.toString());
		}

	}

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

}