package trenes;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class FiltrarUsandoSet {

	public static void main(String[] args) {
		FiltrosSet filtrosSet = new FiltrosSet() ;
		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				/*case 1: // origen
					origen(filtrosSet);
					break;*/
				case 2: // destino
					destino(filtrosSet);
					break;

				/*case 3: // pasajeros
					pasajeros(filtrosSet);
					break;*/
					
				case 4:// cerrar

					System.exit(0);
				

				default:
					System.out.println("opcion no valida");
				}
			} catch (NumberFormatException e) {
				System.out.println("debes escribir un numero");
			}
		}
	}

	/*private static void cobrar(FiltrosSet filtrosSet) {
		System.out.println("Selecciona tu filtro");
		int importe = Integer.parseInt(leerTeclado());
		System.out.println("El orden por origen es: " + cuenta.operar(importe, 1));

	}*/

	private static void destino(FiltrosSet filtrosSet) {
		Tren t1 = new Tren("Madrid", "Barcelona", 180);
		Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
		Tren t3 = new Tren("Madrid", "Sevilla", 120);
		Tren t4 = new Tren("Madrid", "Sevilla", 120);
		Tren t5 = new Tren("Madrid", "Sevilla", 120);
		Tren t6 = new Tren("Madrid", "Sevilla", 120);

		TreeSet<Tren> trenes = new TreeSet<Tren>();
		trenes.add(t1);
		trenes.add(t2);
		trenes.add(t3);
		trenes.add(t4);
		trenes.add(t5);
		trenes.add(t6);

		for (Tren s : trenes) {
			System.out.println(s);

		}

	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
		System.out.println("El orden por destino es: " + Tren.getDestino());

	

	
	/*private static void saldo(FiltrosSet filtrosSet) {
		System.out.println("El orden por pasajeros es: " + cuenta.getSaldo());

	}*/

	

	private static String leerTeclado() {

		try {
			InputStreamReader inputStreamReader= new InputStreamReader(System.in);
			BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
			return bufferedReader.readLine();
			
		} catch (IOException e) {
			return null;
		}
	}

	public static void menu() {

		System.out.println("Menu de estación");
		System.out.println("==================");
		System.out.println("1.- Filtrar por Origen");
		System.out.println("2.- Filtrar por Destino");
		System.out.println("3.- Filtrar por Pasajeros");
		System.out.println("4.- Cerrar aplicación");
		System.out.println("Teclea opción:");
	}


	}


