package trenes;
import.trenes.tren;
import trenes.ComparadorDestino;
import trenes.ComparadorOrigen;
import trenes.ComparadorPasajeros;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EjemploComparator {

	public static void main(String[] args) {

	

	Tren t1 = new Tren("Madrid", "Barcelona", 180);
	Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
	Tren t3 = new Tren("Madrid", "Sevilla", 520);
	Tren t4 = new Tren("Madrid", "Oviedo", 720);
	Tren t5 = new Tren("Madrid", "Cadiz", 620);
	Tren t6 = new Tren("Madrid", "Almeria", 820);

	
	
	Set<Tren> trenesJuntos = juntarTrenes(t1, t2, t3, t4, t5, t6);
		
	
		int tipo;
		do {
            System.out.println("*****************************************************");
			System.out.println("Introduce 1 para Comparar por origen");
			System.out.println("Introduce 2 para Comparar por destino");
			System.out.println("Introduce 3 para Comparar por pasajeros");
			System.out.println("Introduce 0 para salir");
			System.out.println("*****************************************************");
			System.out.println("Teclea opcion: ");
			System.out.println("****************************************************");
           
			try (Scanner reader = new Scanner(System.in)) {
				tipo = reader.nextInt();
			}

			switch (tipo) {
			case 1:
				trenesJuntos = new TreeSet<Tren>(new ComparadorOrigen());
                listaTrenes(trenesJuntos);
				break;
			case 2:
				trenesJuntos = new TreeSet<Tren>(new ComparadorDestino());
				 listaTrenes(trenesJuntos);
				break;
			case 3:
				trenesJuntos = new TreeSet<Tren>(new ComparadorPasajeros());
				 listaTrenes(trenesJuntos);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("escribir una opcion buena");
			}

		} while (tipo != 0);
	}
	private static Set<Tren> juntarTrenes(Tren... trenes) {
		
		Set<Tren> trenesList = null;
		for (int i = 0; i < trenes.length; i++)
			if(trenesList != null)
			trenesList.add(trenes[i]);

		return trenesList;
	}
	private static void listaTrenes(TreeSet<Tren> trenes) {
		for (Tren tren : trenes)
		System.out.println(tren.toString());
	}
}