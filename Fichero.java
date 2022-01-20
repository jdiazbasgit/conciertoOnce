package fichero;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fichero {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
  
        try (PrintWriter salida = new PrintWriter("D:/JACINTO/FULL-STACK-JAVA/fichero.txt")) { //try with resources                
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {                                                             
                salida.println(cadena);
                cadena = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        }
        finally {
        	sc.close();
        }

	}

}
