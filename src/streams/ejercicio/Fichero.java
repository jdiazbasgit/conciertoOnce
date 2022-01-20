package streams.ejercicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Fichero {
 
	
	
	public static void main(String[] args)  {
		String nombreFichero = null;
		//Scanner scanner = new Scanner(System.in);
		while (true) {
			menu();
			try {

				int opcion = Integer.parseInt(leerTeclado());
				switch (opcion) {
				case 1:

					System.out.println("Escribe nombre del fichero: ");
					nombreFichero = leerTeclado();
					//System.out.println("nombre: " + nombreFichero);
					
					FileOutputStream fileOutputStream = new FileOutputStream(nombreFichero,true);
					System.out.println("Escribe el texto del fichero: ");
					String textoFichero = leerTeclado();
					
					
					//System.out.println("texto: " + textoFichero);
					
					PrintWriter printWriter = new PrintWriter(fileOutputStream, true);
					printWriter.println(textoFichero);

					break;
				case 2:
					try(
							FileInputStream fileInputStream= new FileInputStream(nombreFichero);
							InputStreamReader inputStreamReader= new InputStreamReader(fileInputStream);
							BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
							) {
						
						while(bufferedReader.ready()) {
							System.out.println(bufferedReader.readLine());
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}

					break;

				case 3:

					System.exit(0);

				default:
					System.out.println("opcion no valida");
				}
			} catch (NumberFormatException e) {
				System.out.println("debes escribir un numero");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void menu() {

		System.out.println("Menu Fichero:");
		System.out.println("=============");
		System.out.println("1.- Crear Fichero");
		System.out.println("2.- Leer Fichero");
		System.out.println("3.- Terminar");

	}
	
	private static String leerTeclado() {

		try {
			return new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			return null;
		}
	}

}
