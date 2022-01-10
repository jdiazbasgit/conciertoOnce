package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banco {

	public Banco() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:
					System.out.println("Introduce cantidad a ingresar : ");
					double ingreso = Double.parseDouble(leerTeclado());
					cuenta.ingresar(ingreso);
					break;
				case 2:
					System.out.println("Introduce cantidad a sacar : ");
					double cantidad = Double.parseDouble(leerTeclado());
					cuenta.sacarDinero(cantidad);
					break;
				case 3:
					System.out.println("Saldo Cuenta : " + cuenta.getSaldo());
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
		System.out.println("Teclea opción:");
	}

}
