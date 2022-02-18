package ventanas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class HiloEscuchaRegistroServidor extends Thread {
	private Chat chat;
	private HashMap hashMap;

	public HiloEscuchaRegistroServidor(Chat chat) {
		this.chat = chat;
	}

	@Override
	public void run() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5001);
			while (true) {
				Socket socketDeRecepcion = serverSocket.accept();
				String direccionIp = socketDeRecepcion.getInetAddress().getHostAddress();
				InputStreamReader inputStreamReader = new InputStreamReader(socketDeRecepcion.getInputStream());
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				String nickDeUsuario = bufferedReader.readLine();

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
