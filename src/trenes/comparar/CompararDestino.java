package trenes.comparar;

import java.util.Comparator;

import trenes.list.Tren;

public class CompararDestino implements Comparator<Tren> {

	@Override
	public int compare(Tren o1, Tren o2) {
		
		return o1.getDestino().compareTo(o2.getDestino());
	}

}
