package trenes;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet  {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);
		
		 Set<Tren> conjunto = new HashSet<Tren>(); 
		 conjunto.add(t1);
		 conjunto.add(t2);
		 conjunto.add(t3);
		 conjunto.add(t4);
		 conjunto.add(t5);
		 conjunto.add(t6);
		 for(Tren s : conjunto) {
		     System.out.println(s);
		 }


	}

	
		
}


