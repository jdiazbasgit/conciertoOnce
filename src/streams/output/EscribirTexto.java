package streams.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class EscribirTexto {

	public static void main(String[] args) {
		
		//outputStream
		// writer
		
		try {
			FileOutputStream fileOutputStream= new FileOutputStream("prueba.txt");
			PrintWriter printWriter= new PrintWriter(fileOutputStream);
			printWriter.println("esto es una linea de texto");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
