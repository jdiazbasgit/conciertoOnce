package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import ventanas.Chat;

public class HiloCliente extends Thread {
private Chat chat;
private int puerto;
	public HiloCliente(Chat chat,int puerto) {
		this.chat = chat;
		this.puerto=puerto;
		
	}
	@Override
	public void run() {
		Socket socket = null;
		try {
			socket = new Socket(Chat.IP_SERVIDOR, Chat.PUERTO_ESCUCHA_REGISTRO_SERVIDOR);
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			printWriter.println("Hola soy javi");
			printWriter.flush();
		} catch (UnknownHostException e) {
			e.printStackTrace();
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
