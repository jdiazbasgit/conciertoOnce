package ventanas.hilos.envio;

import java.net.Socket;

public class HiloEnvioDesconexionCliente extends HiloEnvio {
	
	public HiloEnvioDesconexionCliente( String ip, int puerto) {
		super( ip, puerto);
	}

	@Override
	public void hacerAlgo(Socket socket)  {	}

}
