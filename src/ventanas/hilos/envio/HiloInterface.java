package ventanas.hilos.envio;

import java.io.IOException;
import java.net.Socket;

public interface HiloInterface {

	public void hacerAlgo(Socket socket) throws IOException;
}
