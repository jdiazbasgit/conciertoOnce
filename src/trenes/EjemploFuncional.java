package trenes;

import java.util.Set;

public class EjemploFuncional {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		// List<Tren> trenes = Arrays.asList(t1,t2,t3,t4,t5,t6);
		Set<Tren> trenes = Set.of(t1, t2, t3, t4, t5, t6);
		// HashSet<Tren> trenesSet=new HashSet<>(trenes);
		int tipo = 3;

		if (tipo == 1)// Origen
			trenes.stream().sorted(new ComparadorOrigen()).forEach(tren -> System.out.println(tren));

		if (tipo == 2)//Destino
			trenes.stream().sorted((o1, o2) -> o1.getDestino().compareTo(o2.getDestino()))
					.forEach(tren -> System.out.println(tren));

		if (tipo == 3)//Pasajeros
			trenes.stream().filter(tren -> true).sorted(new ComparadorPasajeros()).forEach(t -> System.out.println(t));

	}
}
