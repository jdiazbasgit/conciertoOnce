package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Banco {

	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones();

		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				
				case 1:
					System.out.println("Cuanto quieres ingresar?");
					double ingreso = Double.parseDouble(leerTeclado());
					operaciones.ingresar(ingreso);
					break;
					
				case 2:
					System.out.println("Cuanto quieres retirar?");
					double retiro = Double.parseDouble(leerTeclado());
					operaciones.retirar(retiro);
					break;

				case 3:
					System.out.println("El saldo es: " + operaciones.getSaldo());
					break;
					
				case 4:
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
