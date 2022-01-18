package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banco {
//codigodesergio
	public static void main(String[] args) {
Cuenta miCuenta = new Cuenta();
		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:
					
					System.out.println("¿Qué cantidad quieres ingresar?");
				double cantidadIngresar = Double.parseDouble(leerTeclado());
				miCuenta.ingresar(cantidadIngresar);
				System.out.println("Cantidad correcta  " + miCuenta.getSaldo());
					break;
				case 2:
					
					System.out.println("¿Qué cantidad quieres sacar?");
				double cantidadCobrar = Double.parseDouble(leerTeclado());
				if (miCuenta.getSaldo() - cantidadCobrar >=0) {
				miCuenta.cobrar(cantidadCobrar);
				System.out.println("Extracción de cobro realizada con éxito  " + miCuenta.getSaldo());
				}
				else
					System.out.println("Saldo insuficiente");
					break;

				case 3:
					
					System.out.println("Su saldo es  " + miCuenta.getSaldo());
				

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
