package trenes;

import java.util.TreeSet;

public class EjemploIgualdadDestino {

	public static void main(String[] args) {
		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		TreeSet<Tren> trenes = new TreeSet<Tren>();
		trenes.add(t1);
		trenes.add(t2);
		trenes.add(t3);
		trenes.add(t4);
		trenes.add(t5);
		trenes.add(t6);

		for (Tren s : trenes) {
			System.out.println(s);

		}

	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
}
