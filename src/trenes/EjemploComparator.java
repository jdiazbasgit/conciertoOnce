package trenes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EjemploComparator {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		Set<Tren> trenesJuntos=juntarTrenes(t1, t2, t3,t4,t5,t6);
		
		for (Tren tren : trenesJuntos) {
			System.out.println(tren.toString());
		}
		
		
		

	}

	

	@SuppressWarnings("unused")
	private static Set<Tren> juntarTrenes(String texto, int numero, Tren... trenes) {
		Set<Tren> trenesList = new TreeSet<Tren>( new ComparadorDestino());
		
		for (int i = 0; i < trenes.length; i++) {
			trenesList.add(trenes[i]);
		}
		
		return trenesList;
	}

}
