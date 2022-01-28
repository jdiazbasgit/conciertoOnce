package banco;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class EjercicioStreams {

	public  int main1(String[] args) {

		while (true) {
			System.out.println("Escribe fichero:");
			String fichero = Utilidades.leerTeclado();
			if(fichero.equals("exit"))
				System.exit(0);
			System.out.println("escribe texto:");
			String texto = Utilidades.leerTeclado();
			grabaTexto(fichero, texto);
			
			//Utilidades utilidades= new Utilidades();
			System.out.println(Utilidades.suma(4, 5));
			
			System.out.println();
			Persona persona= new Persona(34);
			persona.suma(5);

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
