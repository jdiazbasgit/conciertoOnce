package trenes;

import java.util.Comparator;

public class ComparadorPasajeros implements Comparator<Tren> {

	@Override
	public int compare(Tren o1, Tren o2) {
		return o1.getPasajeros()-o2.getPasajeros();
	}

}
