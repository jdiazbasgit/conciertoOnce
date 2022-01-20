package streams.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EscribirTexto {

	public static void main(String[] args) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("prueba.txt", true);
				PrintWriter printWriter = new PrintWriter(fileOutputStream,true);) {

			printWriter.println("esto es una linea de texto");
			
			
			
			Calendar fecha1= new GregorianCalendar();
			System.err.println(fecha1.get(Calendar.DAY_OF_MONTH));
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
