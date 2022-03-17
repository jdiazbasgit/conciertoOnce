package concierto.excepciones;


public class SinSonidoException extends Exception {
	
	public void instrumentoRoto() {
		System.out.println("Ya la hemos liado");
	}
}
