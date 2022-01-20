package stream.fichero;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribeFichero{
	
     public static void main(String[] args) throws IOException{
			 
			try(FileOutputStream fileOutputStream =new FileOutputStream ("ejercicio.txt");
			        PrintWriter printWriter = new PrintWriter(fileOutputStream);){
			printWriter.println("escribe fichero");
			System.out.println("Introduce el nombre del fichero: ");
			Scanner leer = new Scanner(System.in);
			String nombreFichero = leer.nextLine();

			
	File file = new File(nombreFichero+".txt");		
	FileOutputStream fileOutputStream2 =new FileOutputStream (file);
	PrintWriter printWriterUno = new PrintWriter(fileOutputStream2);
	System.out.println("Introduce el texto");
	String cadena = leer.nextLine();
	printWriterUno.print(cadena);
	printWriterUno.close();
			       
     }catch(FileNotFoundException e){
				
 e.printStackTrace();
     }
}}	       		