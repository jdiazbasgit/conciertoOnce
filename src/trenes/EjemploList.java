package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class EjemploList {

	public static void main(String[] args) {

		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		Set<Tren> trenesJuntos = juntarTrenes(t1, t2, t3, t4, t5, t6);

		for (Tren tren : trenesJuntos) {
			System.out.println(tren.toString());
		}

	
		private static Set<Tren> juntarTrenes(Tren... trenes){
	while (true) {
		
		menu();
		try {
			int opcion = Integer.parseInt(leerTeclado());
		
			switch (opcion) {
			case 1:
				trenesList = new TreeSet<Tren>(new ComparadorOrigen());
				for (int i = 0; i < trenes.length; i++) {
					trenesList.add(trenes[i]);
				}
				return trenesList;

				break;
				
			case 2:
				trenesList = new TreeSet<Tren>(new ComparadorDestino());
				for (int i = 0; i < trenes.length; i++) {
					trenesList.add(trenes[i]);
				}
				return trenesList;
				break;
			
			case 3:
				trenesList = new TreeSet<Tren>(new ComparadorPasajeros());
				for (int i = 0; i < trenes.length; i++) {
					trenesList.add(trenes[i]);
				}
				return trenesList;

				break;
				
			case 4:
				System.exit(0);
				
			default:
				System.out.println("opcion no valida");
			}
			
		}
	} catch (NumberFormatException e) {
		System.out.println("debes escribir un numero");
	}
}
}
		

	/*private static Set<Tren> juntarTrenes(Tren... trenes) {

		int tipo = 3;

		Set<Tren> trenesList = null;
		if (tipo == 1)
			trenesList = new TreeSet<Tren>(new ComparadorOrigen());
		if (tipo == 2)
			trenesList = new TreeSet<Tren>(new ComparadorDestino());
		if (tipo == 3)
			trenesList = new TreeSet<Tren>(new ComparadorPasajeros());

		for (int i = 0; i < trenes.length; i++) {
			trenesList.add(trenes[i]);
		}

		return trenesList;
	}
		catch (NumberFormatException e) {
				System.out.println("debes escribir un numero");
			}
	*/
			private static String leerTeclado() {

				try {
					return new BufferedReader(new InputStreamReader(System.in)).readLine();
				} catch (IOException e) {
					return null;
				}
			}
	
	
	
	
	
	
	
	
	
	public static void menu() {
		System.out.println("==================");
		System.out.println("Menu del banco");
		System.out.println("==================");
		System.out.println("1.- Ingresar");
		System.out.println("2.- Retirar");
		System.out.println("3.- Consultar el saldo");
		System.out.println("4.- Terminar");
		System.out.println("Teclea opción:");
	}
			}

