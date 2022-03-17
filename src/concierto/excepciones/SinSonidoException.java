package concierto.excepciones;

@SuppressWarnings("serial")
public class SinSonidoException extends Exception {
	public void instrumentoRoto() {
		System.out.println("ya la hemos liado");
	}

}
