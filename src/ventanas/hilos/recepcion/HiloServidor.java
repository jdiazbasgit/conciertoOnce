package ventanas.hilos.recepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HiloServidor extends Thread {

	@Override
	public void run() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5000);
			while (true) {

				Socket socket = serverSocket.accept();
				String ip = socket.getInetAddress().getHostAddress();
				InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				String mensaje = bufferedReader.readLine();
				System.out.println(ip + " dice: " + mensaje);
				
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
