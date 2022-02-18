package ventanas.trabajo;

import ventanas.hilos.recepcion.HiloServidor;

public class Servidor {

	public static void main(String[] args) {
		HiloServidor hiloServidor= new HiloServidor();
		hiloServidor.start();

	}

}
