package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banco {

	public static void main(String[] args) {
		Cuenta cuenta=new Cuenta();
		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:
					System.out.println("¿Qué cantidad vas a ingresar?");
					double ingresar = Double.parseDouble(leerTeclado());
					cuenta.ingresar(ingresar);
					break;
					
				case 2:
					System.out.println("¿Qué cantidad vas a sacar?");
					double numerosRojos= -200;
					double pagar = Double.parseDouble(leerTeclado());
					
					if (cuenta.getSaldo() - pagar <= numerosRojos) {
						System.out.println("La cantidad excede el límite permitido");
						break;
					}
					cuenta.sacar(pagar);	
					break;

				case 3:
					System.out.println("Tu saldo es: " + cuenta.getSaldo());
					break;
				case 4:
					
					System.exit(0);

				default:
					System.out.println("opción no válida");
				}
			} catch (NumberFormatException e) {
				System.out.println("Debes escribir un número");
			}
		}
	}

	private static String leerTeclado() {

		try {
			return new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			return null;
		}
	}

	public static void menu() {

		System.out.println("Menu del banco");
		System.out.println("==================");
		System.out.println("1.- Ingresar dinero");
		System.out.println("2.- Sacar dinero");
		System.out.println("3.- Consultar saldo");
		System.out.println("4.- Terminar");
		System.out.println("Teclea una opción:");
	}

}
