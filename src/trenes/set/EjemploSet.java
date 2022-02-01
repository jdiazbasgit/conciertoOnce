package trenes.set;

import java.util.HashSet;
import java.util.Set;

import trenes.list.Tren;

public class EjemploSet {

	public static void main(String[] args) {
		
		CompararTrenes compararTrenes = new CompararTrenes();
		String obj = "t1,t2,t3,t4,t5,t6";
		System.out.println(compararTrenes.equals(obj));
		System.out.println(compararTrenes.hashCode());

		Set<Tren> trenesJuntos = new HashSet<Tren>();


		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);
		
		trenesJuntos.add(t1);
		trenesJuntos.add(t2);
		trenesJuntos.add(t3);
		trenesJuntos.add(t4);
		trenesJuntos.add(t5);
		trenesJuntos.add(t6);
		
		for (Tren tren : trenesJuntos) {
			System.out.println(tren.toString());
		}
		
		
		
		
		
		
	}



			
	

		
	}


