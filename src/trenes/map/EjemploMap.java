package trenes.map;

import java.util.HashMap;
import java.util.Map;

import trenes.list.Tren;

public class EjemploMap {

	public static void main(String[] args) {

		Map<String, Tren> ejemploMap = new HashMap<>();

		ejemploMap.put("t1", new Tren("Madrid", "Barcelona", 180));
		ejemploMap.put("t2", new Tren("Zaragoza", "Barcelona", 235));
		ejemploMap.put("t3", new Tren("Madrid", "Sevilla", 120));
		ejemploMap.put("t4", new Tren("Madrid", "Sevilla", 120));
		ejemploMap.put("t5", new Tren("Madrid", "Sevilla", 120));
		ejemploMap.put("t6", new Tren("Madrid", "Sevilla", 120));

		for (String nombre : ejemploMap.keySet()) {
			System.out.println( "origen" + "  " + ejemploMap.get(nombre).getOrigen() +" "+ "destino"+ "  "
					+ ejemploMap.get(nombre).getDestino() +" "+ "pasajeros" +" "+ ejemploMap.get(nombre).getPasajeros());
		}

		
		
	
	}
}
