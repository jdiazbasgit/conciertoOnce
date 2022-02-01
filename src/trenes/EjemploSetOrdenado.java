package trenes;


import java.util.HashSet;
import java.util.TreeSet;


public class EjemploSetOrdenado {

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
		
		for (Tren tren : trenes) {
			System.out.println(tren);
		}

	}
	
	 

	private static TreeSet<Tren> juntarTrenes(String texto, int numero, Tren... trenes) {
		TreeSet<Tren> trenesList = new TreeSet<>();

		for (int i = 0; i < trenes.length; i++) {
			trenesList.add(trenes[i]);
		}

		return trenesList;
	}

}
