		package trenes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioIgualDestino {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		//Set<Tren> trenes = new HashSet<>();
		//trenes = juntarTrenes(t1, t2, t3, t4, t5, t6);
		TreeSet<Tren> trenes= new TreeSet<Tren>();
		trenes.add(t1);
		trenes.add(t2);
		trenes.add(t3);
		trenes.add(t4);
		trenes.add(t5);
		trenes.add(t6);
		
		for (Tren tren : trenes)
			System.out.println(tren);
	}

	/*private static HashSet<Tren> juntarTrenes(Tren... trenes) {
		Set<Tren> trenesAux = new HashSet<>();
		for (int i = 0; i < trenes.length; i++) {
			trenesAux.add(trenes[i]);
		}
		return (HashSet<Tren>) trenesAux;
	}*/

}
