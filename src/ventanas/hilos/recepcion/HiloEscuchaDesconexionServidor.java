package ventanas.hilos.recepcion;

import java.io.IOException;
import java.net.Socket;

import lombok.Data;
import ventanas.hilos.envio.HiloEnvioRegistroServidor;
import ventanas.trabajo.Chat;

@Data
public class HiloEscuchaDesconexionServidor extends HiloEscucha {

	
	
	public HiloEscuchaDesconexionServidor(Chat chat, int puerto) {
		super(chat, puerto);
	}
	public HiloEscuchaDesconexionServidor(int puerto) {
		super(puerto);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void hacerAlgo(Socket socket)  {
		Chat.usuarios.remove(socket.getInetAddress().getHostAddress());
			
		for (String ip : Chat.usuarios.keySet()) {
			HiloEnvioRegistroServidor envio= new HiloEnvioRegistroServidor(getChat(), ip, Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE);
			envio.start();
			
		}
		

	}

	

}
