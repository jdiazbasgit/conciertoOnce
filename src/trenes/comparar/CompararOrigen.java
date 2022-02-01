package trenes.comparar;

import java.util.Comparator;

import trenes.list.Tren;

public class CompararOrigen implements Comparator<Tren> {

	@Override
	public int compare(Tren o1, Tren o2) {
		
		return o1.getOrigen().compareTo(o2.getOrigen());
	}

}
