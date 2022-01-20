package streams.ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fichero {

	public static void main(String[] args) {

	}

	

	public static void menu() {

		System.out.println("Menu Fichero:");
		System.out.println("=============");
		System.out.println("1.- Crear Fichero");
		System.out.println("2.- Leer Fichero");
		System.out.println("4.- Terminar");

	}
	private static String leerTeclado() {

		try {
			return new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			return null;
		}
	}

}
