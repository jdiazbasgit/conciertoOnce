package ventanas.hilos.recepcion;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.hilos.envio.HiloInterface;
import ventanas.trabajo.Chat;

@EqualsAndHashCode(callSuper=false)
@Data
public abstract  class HiloEscucha extends Thread implements HiloInterface {

	private Chat chat;
	private int puerto;

	private String ip;

	

	public HiloEscucha(int puerto) {
		this.puerto = puerto;
	}
	
	public HiloEscucha(Chat chat,int puerto) {
		this.puerto = puerto;
		this.chat=chat;
	}

	@Override
	public void run() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(getPuerto());
			while (true) {
				Socket socket = serverSocket.accept();
				setIp(socket.getInetAddress().getHostAddress());
				hacerAlgo(socket);
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
