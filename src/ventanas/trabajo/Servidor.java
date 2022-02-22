package ventanas.trabajo;

import ventanas.hilos.recepcion.HiloEscuchaDesconexionServidor;

public class Servidor {

	public Servidor() {
	}

	public static void main(String[] args) {
		HiloEscuchaDesconexionServidor hiloEscuchaDesconexionServidor= new HiloEscuchaDesconexionServidor( Chat.PUERTO_DESCONEXION);
	}

}
