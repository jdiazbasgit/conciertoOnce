package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banco {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		while (true) {
			try {
				menu();
				int opcionMenu = Integer.parseInt(leerTeclado());
				double operando;
				switch (opcionMenu) {

				case 1:
					System.out.println("\r\n" + "¿Qué cantidad quieres ingresar?" + "\r\n");
					operando = Double.parseDouble(leerTeclado());
					cuenta.ingreso(operando);
					break;

				case 2:
					System.out.println("\r\n" + "¿Qué cantidad quieres extraer?" + "\r\n");
					operando = Double.parseDouble(leerTeclado());
					cuenta.reintegro(operando);
					break;

				case 3:
					cuenta.verSaldo();
					break;

				case 4:
					try {
						menuOtros();
						int opcionOtros = Integer.parseInt(leerTeclado());
						switch (opcionOtros) {

						case 1:
							cuenta.verLimiteCajero();
							break;

						case 2:
							cuenta.verLimiteCajero();
							System.out.println("Introduce el nuevo límite de reintegro en cajeros" + "\r\n");
							operando = Double.parseDouble(leerTeclado());
							cuenta.nuevoLimiteReintegroCajero(operando);
							;
							break;

						case 3:
							cuenta.verLimiteDeGastoDiario();
							break;

						case 4:
							cuenta.verLimiteDeGastoDiario();
							System.out.println("Introduce el nuevo límite de gasto diario" + "\r\n");
							operando = Double.parseDouble(leerTeclado());
							cuenta.nuevoLimiteGastoDiario(operando);
							break;

						case 5:
							break;

						case 6:
							cuenta.despedida();
							System.exit(0);

						default:
							cuenta.errorOpcion();
						}

					} catch (NumberFormatException e) {
						cuenta.errorOpcion();
					}
					break;

				case 5:
					cuenta.despedida();
					System.exit(0);
				default:
					cuenta.errorOpcion();

				}
			} catch (NumberFormatException e) {
				cuenta.errorOpcion();
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

		System.out.println("Menú principal");
		System.out.println("==================" + "\r\n");
		System.out.println("1.- Ingresar dinero");
		System.out.println("2.- Sacar dinero");
		System.out.println("3.- Consultar saldo");
		System.out.println("4.- Otras operaciones");
		System.out.println("5.- Salir");
		System.out.println("\r\n" + "Teclea una opción:");
	}

	public static void menuOtros() {
		System.out.println("Otras operaciones");
		System.out.println("==================" + "\r\n");
		System.out.println("1.- Consultar límite de reintegro en cajeros");
		System.out.println("2.- Cambiar límite de reintegro en cajeros");
		System.out.println("3.- Consultar límite de gasto diario");
		System.out.println("4.- Cambiar límite de gasto diario");
		System.out.println("5.- Volver al menú principal");
		System.out.println("6.- Salir");
		System.out.println("\r\n" + "Teclea una opción:");
	}
}
