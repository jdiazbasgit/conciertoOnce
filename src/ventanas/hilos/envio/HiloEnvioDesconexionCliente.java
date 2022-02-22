package ventanas.hilos.envio;

import java.io.IOException;
import java.net.Socket;

import ventanas.Chat;

public class HiloEnvioDesconexionCliente extends HiloEnvio {


	
	public HiloEnvioDesconexionCliente(Chat chat, String ip, int puerto) {
		super(chat, ip, puerto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		


	}

}
