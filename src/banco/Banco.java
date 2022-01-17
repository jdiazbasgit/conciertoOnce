package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banco {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1: // ingresar
					ingresar(cuenta);
					break;
				case 2: // cobrar
					cobrar(cuenta);
					break;

				case 3: // saldo
					saldo(cuenta);
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

	private static void cobrar(Cuenta cuenta) {
		System.out.println("Introduce inporte a cobrar:");
		int importe = Integer.parseInt(leerTeclado());
		try {
			System.out.println("Su saldo actual es: " + cuenta.operar(importe, 1));
		} catch (SinSaldoException e) {
			System.out.println("No tienes saldo suficiente, introducca otro importe");
		}

	}

	private static void saldo(Cuenta cuenta) {
		System.out.println("Su saldo actual es: " + cuenta.getSaldo());

	}

	private static void ingresar(Cuenta cuenta)  {
		System.out.println("Introduce inporte a ingresar:");
		int importe = Integer.parseInt(leerTeclado());
		try {
			System.out.println("Su saldo actual es: " + cuenta.operar(importe, 0));
		} catch (SinSaldoException e) {
			System.out.println("Fallo en ingreso, intentelo mas tarde");
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
		System.out.println("3.- Saldo");
		System.out.println("4.- Terminar");
		System.out.println("Teclea opci�n:");
	}

}
