package trenes;

import java.util.Arrays;
import java.util.List;

public class EjemploFuncionalTrenes {

	public static void main(String[] args) {
		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		List<Tren> trenes = Arrays.asList(t1, t2, t3, t4, t5,t6);
		//HashSet<Tren> trenesSet= new HashSet<>(trenes);
		int tipo = 3;

		if (tipo == 1)// Origen
			trenes.stream().sorted((o1,o2)->o1.getOrigen().compareTo(o2.getOrigen())).forEach(tren -> System.out.println(tren));

		if (tipo == 2)// destino")
			trenes.stream().sorted((o1,o2)->o1.getDestino().compareTo(o2.getDestino())).forEach(tren -> System.out.println(tren));
		if (tipo == 3)// pasajewros
			trenes.stream().sorted((o1,o2)->o1.getPasajeros()-o2.getPasajeros()).forEach(t -> System.out.println(t));

		// trenesJuntos.stream().sorted(new
		// ComparadorPasajeros()).filter(tren->tren.getPasajeros()>150).forEach(tren->System.out.println(tren));

		/*
		 * for (Tren tren : trenesJuntos) { System.out.println(tren.toString()); }
		 */

	}

}
