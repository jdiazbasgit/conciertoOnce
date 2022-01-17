package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import excepcion.SinSaldoException;
import operaciones.Operaciones;

public class Banco {

	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones();
		
		while (true) {
			menu();
			try {
				
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:
					
					System.out.println("�Cuanto vas a meter?");
					Double opcion2 = Double.parseDouble(leerTeclado());	
					operaciones.ingresar(opcion2);
					System.out.println("has ingresado: " + opcion2);
					System.out.println("Tienes: " + operaciones.getSaldo());
					
				
					break;
				case 2:
					try {
						System.out.println("�Cuanto vas a retirar?");
						Double opcion3 = Double.parseDouble(leerTeclado());
						operaciones.retirar(opcion3);
						System.out.println("has retirado: " + opcion3);
						System.out.println("Tienes: " + operaciones.getSaldo());
						break;
						
					} catch (SinSaldoException e) {
						System.out.println("No puedes sacar mas de lo que no tienes");
						break;
					}
					
					
					
				case 3:
					System.out.println("Tienes: " + operaciones.getSaldo());
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

		System.out.println("Menu del banco");
		System.out.println("==================");
		System.out.println("1.- Ingresar");
		System.out.println("2.- Cobrar");
		System.out.println("3.-saldo");
		System.out.println("4.- Terminar");
		System.out.println("Teclea opci�n:");
	}

}
