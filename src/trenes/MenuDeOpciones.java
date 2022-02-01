package trenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

	public class MenuDeOpciones {

		public static void main1(String[] args) {
			
			
			Tren t1 = new Tren("Madrid", "Barcelona", 180);
			Tren t2 = new Tren("Zaragoza", "Barcelona", 235);
			Tren t3 = new Tren("Madrid", "Sevilla", 120);
			Tren t4 = new Tren("Madrid", "Sevilla", 120);
			Tren t5 = new Tren("Madrid", "Sevilla", 120);
			Tren t6 = new Tren("Madrid", "Sevilla", 120);


			TreeSet<Tren> trenesJuntos = new TreeSet<Tren>();
			
			trenesJuntos.add(t1);
			trenesJuntos.add(t2);
			trenesJuntos.add(t3);
			trenesJuntos.add(t4);
			trenesJuntos.add(t5);
			trenesJuntos.add(t6);
			
			for (Tren s : trenesJuntos)
	          
	        System.out.println(s);
		        
		    

		}







	@SuppressWarnings({"null" })
	public static void main(String[] args) {
	
		
	Tren tren=  new Tren(null, null, 0);
		
		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1: // ingresar
		            
			System.out.println(tren.getOrigen()+tren.getDestino()+tren.getPasajeros());
				case 2: ;
					break;

				case 3: // saldo
					
					break;
				case 4:// terminar

					System.exit(0);

				default:
					System.out.println("opcion no valida");
				}
			} catch (NumberFormatException e) {
				System.out.println("debes escribir un numero");
			}
		}
	}

















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

		System.out.println("Menu  Trenes");
		System.out.println("==================");
		System.out.println("1.- Origen");
		System.out.println("2.- Destino");
		System.out.println("3.- Pasajeros");
		System.out.println("4.- Terminar");
		System.out.println("Teclea opción:");
	}



	
	
}
