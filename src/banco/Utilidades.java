package banco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utilidades {
	public static String leerTeclado() {

		try {
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			return bufferedReader.readLine();

		} catch (IOException e) {
			return null;
		}
	}
	
	public void ejemploEstatico() {
		
		String numero="2345";
		
		Integer integer= new Integer(numero);
		int nuimeroComoNumero=integer.intValue();
		
		int nuimeroComoNumero1=Integer.parseInt(numero);
		
	}
	
	public static int suma(int a, int b) {
		return a+b;
	}
}
