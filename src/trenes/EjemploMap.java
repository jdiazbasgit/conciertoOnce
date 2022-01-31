package trenes;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
	public static void main(String[] args) {
		Map<String, Tren> coleccion = new HashMap<>();

		coleccion.put("Viaje1", new Tren("Madrid", "Barcelona", 300));
		coleccion.put("Viaje2", new Tren("Madrid", "Alicante", 190));
		coleccion.put("Viaje3", new Tren("Madrid", "Sevilla", 100));

		for (String nombre : coleccion.keySet()) {
			System.out
					.println(nombre + "-" + coleccion.get(nombre).getOrigen() + "-" + coleccion.get(nombre).getDestino()
							+ "-" + coleccion.get(nombre).getPasajeros() + " - " + "Pasajeros");
		}

	}

}
