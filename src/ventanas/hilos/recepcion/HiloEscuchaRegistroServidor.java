package ventanas.hilos.recepcion;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class HiloEscuchaRegistroServidor extends Thread {

	@Override
	public void run() {
		ServerSocket serverSocket = null;
		HashMap<String, String> escucharRegistro = new HashMap<>();

		try {
			serverSocket = new ServerSocket(5000);
			while (true) {
				Socket socket = serverSocket.accept();
			

			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
