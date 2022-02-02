package trenes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class EjemploList {

	public static void main(String[] args) {			
		
		System.out.println ("\n\t====   List<Tren>   ====");
		
		List<Tren> trenesList = Arrays.asList(
				new Tren("Madrid","Barcelona",180),
				new Tren("Zaragoza","Barcelona",235),
				new Tren("Madrid","Sevilla",120),
				new Tren("Madrid","Sevilla",120),
				new Tren("Madrid","Sevilla",120),
				new Tren("Madrid","Sevilla",120)
		);
		
		for (Tren tren : trenesList) {
			System.out.println(tren);
		}
		
		System.out.println ("\n\t====   HashSet<Tren>   ====");
		
		Set<Tren> trenesHashSet= new HashSet<Tren>(trenesList);		
		
		for (Tren tren : trenesHashSet) {
			System.out.println(tren);
		}
		System.out.println ("\n\t====   SortedSet<Tren>   ====");
		
		SortedSet<Tren> trenesSortedSet= new TreeSet<Tren>(trenesList);		
		
		for (Tren tren : trenesSortedSet) {
			System.out.println(tren);
		}
		
		System.out.println ("\n\t====   HashMap<Tren>   ====");
		
		Map<String,Tren> trenesHashMap= new HashMap<String,Tren>();	
		
		for (int i=0; i<trenesList.size(); i++) {
			trenesHashMap.put("Tren_" + (i+1), trenesList.get(i));
		}
			
		for (String nombreTren : trenesHashMap.keySet())
			System.out.println (nombreTren + " => " + trenesHashMap.get(nombreTren));
		
		System.out.println ("\n\t=== print trenesHashMap por defecto   ====\n" + trenesHashMap);
		
	}

}
