package trenes;

import java.util.Comparator;

public class ComparadorOrigen implements Comparator<Tren> {

	@Override
	public int compare(Tren o1, Tren o2) {
		// TODO Auto-generated method stub
		return o1.getOrigen().compareTo(o2.getOrigen());
	}

	

}
