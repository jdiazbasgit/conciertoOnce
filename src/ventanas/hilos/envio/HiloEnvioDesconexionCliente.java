package ventanas.hilos.envio;

import java.io.IOException;
import java.net.Socket;

import ventanas.Chat;

public class HiloEnvioDesconexionCliente extends HiloEnvio {

	public HiloEnvioDesconexionCliente(Chat chat, int puerto) {
		super(chat, Chat.IP_SERVIDOR,Chat.PUERTO_DESCONEXION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		

	}

}
