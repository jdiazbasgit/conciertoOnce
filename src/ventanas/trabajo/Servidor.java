package ventanas.trabajo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.Data;
import ventanas.hilos.envio.HiloEnvioMensajesServidor;
import ventanas.hilos.recepcion.HiloEscuchaDesconexionServidor;
import ventanas.hilos.recepcion.HiloEscuchaMensajesServidor;
import ventanas.hilos.recepcion.HiloEscuchaRegistroServidor;


public class Servidor {

	public static Map<String, Set<String>> usuarios= new HashMap<>();
	
	public synchronized static Map<String,Set <String>> getUsuarios(){
		return Servidor.usuarios;
	}
	
	public Servidor() {
	}


	public static void main(String[] args) {
		HiloEscuchaDesconexionServidor desconexion= new HiloEscuchaDesconexionServidor(Chat.PUERTO_DESCONEXION);
		desconexion.start();
		HiloEscuchaRegistroServidor registro= new HiloEscuchaRegistroServidor(Chat.PUERTO_ESCUCHA_REGISTRO_SERVIDOR);
		registro.start();
		HiloEscuchaMensajesServidor mensajes= new HiloEscuchaMensajesServidor(Chat.PUERTO_ESCUCHA_MENSAJES_SERVIDOR);
		mensajes.start();
		
		

	}

}
