package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banco {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		double limiteGastoDiario = cuenta.getLimiteGastoDiario();
		while (true) {
			try {
				menu();
				int opcionMenu = Integer.parseInt(leerTeclado());
				switch (opcionMenu) {
				case 1:
					System.out.println("\r\n" + "¿Qué cantidad vas a ingresar?" + "\r\n");
					double cantidadAIngresar = Double.parseDouble(leerTeclado());
					cuenta.ingresar(cantidadAIngresar);
					System.out.println("\r\n" + "Cantidad ingresada con éxito. Saldo actual = " + cuenta.getSaldo()
							+ " €" + "\r\n");
					break;

				case 2:

					System.out.println("\r\n" + "¿Qué cantidad vas a sacar?" + "\r\n");
					double cantidadAExtraer = Double.parseDouble(leerTeclado());
					if (cuenta.getSaldo() - cantidadAExtraer < cuenta.getLimiteCredito()
							|| limiteGastoDiario - cantidadAExtraer < 0) {
						System.out.println("\r\n" + "La cantidad excede el límite permitido. Saldo actual = "
								+ cuenta.getSaldo() + " €" + "\r\n" + "Límite de gasto diario restante: "
								+ limiteGastoDiario + " €" + "\r\n");
						break;
					}
					cuenta.extraer(cantidadAExtraer);
					limiteGastoDiario = limiteGastoDiario - cantidadAExtraer;
					System.out.println("\r\n" + "Cantidad extraída con éxito. Saldo actual = " + cuenta.getSaldo()
							+ " €" + "\r\n");
					break;

				case 3:
					System.out.println("\r\n" + "Tu saldo es: " + cuenta.getSaldo() + " €" + "\r\n");
					break;

				case 4:
					try {
						menuOtros();
						int opcionOtros = Integer.parseInt(leerTeclado());
						switch (opcionOtros) {

						case 1:
							System.out.println("\r\n" + "El límite de reintegro en cajeros es de: "
									+ cuenta.getLimiteReintegroCajero() + " €" + "\r\n");
							break;
						case 2:
							System.out.println("\r\n" + "El límite de reintegro en cajeros actual es de: "
									+ cuenta.getLimiteReintegroCajero() + "\r\n"
									+ "Introduce el nuevo límite de reintegro en cajeros" + "\r\n");
							double nuevoLimiteReintegroCajero = Double.parseDouble(leerTeclado());
							cuenta.setLimiteReintegroCajero(nuevoLimiteReintegroCajero);
							System.out.println("\r\n" + "Límite de reintegro en cajeros actualizado." + "\r\n"
									+ "Su nuevo límite de reintegro es de: " + nuevoLimiteReintegroCajero + " €"
									+ "\r\n");
							break;
						case 3:
							System.out.println("\r\n" + "El límite de gasto diario es de: "
									+ cuenta.getLimiteGastoDiario() + " €" + "\r\n");
							break;
						case 4:
							System.out.println(
									"\r\n" + "El límite de gasto diario actual es de: " + cuenta.getLimiteGastoDiario()
											+ "\r\n" + "Introduce el nuevo límite de gasto diario" + "\r\n");
							double nuevoLimiteGastoDiario = Double.parseDouble(leerTeclado());
							cuenta.setLimiteGastoDiario(nuevoLimiteGastoDiario);
							nuevoLimiteGastoDiario = nuevoLimiteGastoDiario - limiteGastoDiario;
							limiteGastoDiario=nuevoLimiteGastoDiario;
							System.out.println(
									"\r\n" + "Límite de gasto diario actualizado. Su nuevo límite de gasto es de: "
											+ nuevoLimiteGastoDiario + " €" + "\r\n");
							break;
						case 5:
							cuenta.setLimiteGastoDiario(
									9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999e99);
							System.out.println("\r\n" + "Límite de gasto diario quitado" + "\r\n");
							break;
						case 6:
							break;
						case 7:
							System.out.println("\r\n" + "Fin de la aplicación. ¡Vuelva pronto!" + "\r\n");
							System.exit(0);
						default:
							System.out.println("\r\n" + "opción no válida" + "\r\n");
						}

					} catch (NumberFormatException e) {
						System.out.println("\r\n" + "Debes escribir un número" + "\r\n");
					}
					break;

				case 5:
					System.out.println("\r\n" + "Fin de la aplicación. ¡Vuelva pronto!" + "\r\n");
					System.exit(0);
				default:
					System.out.println("\r\n" + "opción no válida" + "\r\n");

				}
			} catch (NumberFormatException e) {
				System.out.println("\r\n" + "Debes escribir un número" + "\r\n");
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
		System.out.println("5.- Quitar límite de gasto diario");
		System.out.println("6.- Volver al menú principal");
		System.out.println("7.- Salir");
		System.out.println("\r\n" + "Teclea una opción:");
	}
}
