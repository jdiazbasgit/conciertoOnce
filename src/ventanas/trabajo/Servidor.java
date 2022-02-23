package ventanas.trabajo;

import java.util.HashMap;
import java.util.Map;
import ventanas.hilos.recepcion.HiloEscuchaDesconexionServidor;
import ventanas.hilos.recepcion.HiloEscuchaMensajesServidor;
import ventanas.hilos.recepcion.HiloEscuchaRegistroServidor;

public class Servidor {

	public static Map<String, String> usuarios= new HashMap<>();
	
	public synchronized static Map<String,String> getUsuarios(){
		return Servidor.usuarios;
	}
	
	public Servidor() {	}

	public static void main(String[] args) {
		
		new HiloEscuchaDesconexionServidor(Chat.PUERTO_DESCONEXION).start();
		new HiloEscuchaRegistroServidor(Chat.PUERTO_ESCUCHA_REGISTRO_SERVIDOR).start();
		new HiloEscuchaMensajesServidor(Chat.PUERTO_ESCUCHA_MENSAJES_SERVIDOR).start();

	}

}
