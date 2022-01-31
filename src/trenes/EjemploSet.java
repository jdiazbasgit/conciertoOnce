package trenes;


import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

	public static void main(String[] args) {

		

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Oviedo", 120);
		Tren t5 = new Tren("Madrid", "Cadiz", 120);
		Tren t6 = new Tren("Madrid", "Almeria", 120);

		Set<Tren> trenesJuntos = juntarTrenes(t1, t2, t3,t4,t5,t6);
		
		for (Tren tren : trenesJuntos) {
			System.out.println(tren.toString());
		}
		
		
		

	}

	private static Set<Tren> juntarTrenes(Tren... trenes) {
		Set<Tren> trenesList = new HashSet<>();
		
		for (int i = 0; i < trenes.length; i++) {
			trenesList.add(trenes[i]);
		}
		
		return trenesList;
	}

	}

/*@Override
public int hashCode() {
	
	return this.getInstrumentoBean().getSonido().hashCode()+1;
}*/



/*@Override
public boolean equals(Object obj) {
	Instrumento instrumento=(Instrumento) obj;
	return this.getInstrumentoBean().getSonido().equals(instrumento.getInstrumentoBean().getSonido());
	
}*/

