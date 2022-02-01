package trenes.comparar;

import java.util.Comparator;

import trenes.list.Tren;

public class CompararPasajeros implements Comparator<Tren> {

	@Override
	public int compare(Tren o1, Tren o2) {
		
		return o1.getPasajeros()-o2.getPasajeros();
	}

	

}
