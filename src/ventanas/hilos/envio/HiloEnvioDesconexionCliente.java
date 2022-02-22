package ventanas.hilos.envio;

import java.io.IOException;
import java.net.Socket;

import ventanas.trabajo.Chat;

public class HiloEnvioDesconexionCliente extends HiloEnvio {


	
	public HiloEnvioDesconexionCliente( String ip, int puerto) {
		super( ip, puerto);

	}

	@Override
	public void hacerAlgo(Socket socket)  {
		


	}

}
