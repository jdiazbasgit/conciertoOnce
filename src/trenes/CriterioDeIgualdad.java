package trenes;

import java.util.HashSet;
import java.util.Set;

public class CriterioDeIgualdad {

	public static void main(String[] args) {
		
		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);
		
		 Set<Tren> trenesJuntos1 = new HashSet<Tren>();
		 
		    trenesJuntos1.add(t1);
			trenesJuntos1.add(t2);
			trenesJuntos1.add(t3);
			trenesJuntos1.add(t4);
			trenesJuntos1.add(t5);
			trenesJuntos1.add(t6);
			
			 System.out.println("Primer tren: " + trenesJuntos1);
				
			 
			 Set<Tren> trenesJuntos2 = new HashSet<Tren>();
			 
			 
			    trenesJuntos1.add(t1);
				trenesJuntos1.add(t2);
				trenesJuntos1.add(t3);
				trenesJuntos1.add(t4);
				trenesJuntos1.add(t5);
				trenesJuntos1.add(t6);
				
				  System.out.println("Segundo tren: "+ trenesJuntos2);
				  
				  
				  boolean value = trenesJuntos1.equals(trenesJuntos2);
				  
				  System.out.println("Ambos son iguales " + value);
			 
		
	}

	
}
