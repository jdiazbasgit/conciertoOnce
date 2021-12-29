package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banco {
	private double saldo;

	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public Banco(double saldo) {
		super();
		this.saldo = saldo;
	}

	public static void main(String[] args) {

		while (true) {
			menu();
			try {
				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:
					ingresar();
					break;
				case 2:
					cobrar();
					break;

				case 3:
					System.out.println("el saldo es : " + getSaldo());
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

	public static void ingresar() {
		System.out.println("escribe un ingreso en decimal");
		double ingreso = Double.parseDouble(leerTeclado());
		if (ingreso >= 0)
			setSaldo(ingreso + getSaldo());

	}

	public static void cobrar() {
		System.out.println("escribe un cobro en decimal");
		double cobro = Double.parseDouble(leerTeclado());
		if ( getSaldo() >= cobro ) 
		setSaldo( getSaldo()-cobro);
	}

}
