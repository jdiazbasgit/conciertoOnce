package trenes;

import java.util.TreeSet;

public class EjemploIgualdadDos {

	public static void main(String[] args) {
		
		
		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);


		TreeSet<Tren> trenesJuntos = new TreeSet<Tren>();
		
		trenesJuntos.add(t1);
		trenesJuntos.add(t2);
		trenesJuntos.add(t3);
		trenesJuntos.add(t4);
		trenesJuntos.add(t5);
		trenesJuntos.add(t6);
		
		for (Tren s : trenesJuntos)
          
        System.out.println(s);
	        
	    

	}

}
