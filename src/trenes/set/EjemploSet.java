package trenes.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import trenes.list.Tren;

public class EjemploSet {

	public static void main(String[] args) {

		Set<Tren> trenesConSet = todosLosTrenes();

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

	}

	private static Set<Tren> todosLosTrenes(Tren... trenes) {
		Set<Tren> trenesSet = new HashSet();
		
		
		

		return null;
	}

}
