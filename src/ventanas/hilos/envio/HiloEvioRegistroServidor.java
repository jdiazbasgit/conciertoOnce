package ventanas.hilos.envio;

import java.io.IOException;
import java.net.Socket;

public class HiloEvioRegistroServidor extends Thread {

	@Override
	public void run() {
		Socket socket = null;

		try {
			socket = new Socket("getIp", 5000);
			//TODO recibir y mandar paquete con ip y nick

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {

				e.printStackTrace();

			}
		}

	}
}
