package streams.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirTexto {

	public static void main(String[] args) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("src/prueba.txt", true);
				PrintWriter printWriter = new PrintWriter(fileOutputStream,true);) {

			printWriter.println("esto es una linea de texto");
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
