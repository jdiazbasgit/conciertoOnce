package banco;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EjercicioStreams {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Escribe fichero:");
			String fichero = Utilidades.leerTeclado();
			if(fichero.equals("exit"))
				System.exit(0);
			System.out.println("escribe texto:");
			String texto = Utilidades.leerTeclado();
			grabaTexto(fichero, texto);

		}
	}

	private static void grabaTexto(String fichero, String texto) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(fichero, true);
				PrintWriter printWriter = new PrintWriter(fileOutputStream,true);) {
			printWriter.println(texto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

}
