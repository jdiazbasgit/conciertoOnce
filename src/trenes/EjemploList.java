package trenes;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 100);
		Tren t2 = new Tren("Zaragona", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		

		List<Tren> trenesJuntos = juntarTrenes("pepe", 5, t1, t2, t3);
		for (Tren tren : trenesJuntos) {
			System.out.println(tren.toString());
		}
	}

	private static List<Tren> juntarTrenes(String texto, int numero, Tren... trenes) {
		List<Tren> trenesList = new ArrayList<>();

		for (int i = 0; i < trenes.length; i++) {
			trenesList.add(trenes[i]);
		}

		return trenesList;

	}

}
