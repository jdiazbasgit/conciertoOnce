package trenes.set;

import java.util.Objects;

import trenes.list.Tren;

public class CompararTrenes {

	Tren t1 = new Tren("Madrid", "Barcelona", 180);
	Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
	Tren t3 = new Tren("Madrid", "Sevilla", 120);
	Tren t4 = new Tren("Madrid", "Sevilla", 120);
	Tren t5 = new Tren("Madrid", "Sevilla", 120);
	Tren t6 = new Tren("Madrid", "Sevilla", 120);

	@Override
	public int hashCode() {
		return Objects.hash(t1, t2, t3, t4, t5, t6);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompararTrenes origen = (CompararTrenes) obj;
		return Objects.equals(t1, origen.t2) && Objects.equals(t2, origen.t3) && Objects.equals(t3, origen.t4)
				&& Objects.equals(t4, origen.t5) && Objects.equals(t5, origen.t6);
	}

}
