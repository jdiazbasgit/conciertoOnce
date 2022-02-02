package trenes;

import java.util.Comparator;

public class ComparadorDestino implements Comparator<Tren> {

	@Override
	public int compare(Tren o1, Tren o2) {
		return o1.getDestino().compareTo(o2.getDestino());
	}

}
