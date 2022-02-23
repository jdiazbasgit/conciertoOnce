package ventanas.hilos.recepcion;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Optional;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.trabajo.Chat;

@Data
@EqualsAndHashCode(callSuper=false)
public abstract class HiloEscucha extends Thread {

	private Chat chat;
	private int puerto;

	private String ip;

	public HiloEscucha(Chat chat, int puerto) {
		super();
		this.chat = chat;
		this.puerto = puerto;
	}

	public HiloEscucha(int puerto) {
		super();
		this.puerto = puerto;
	}


	public HiloEscucha(Chat chat, int puerto, String ip) {
		this(chat,puerto);
		this.ip = ip;
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
				Optional.ofNullable(serverSocket).ifPresent(socket->{
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				});	
		}

	}

	public abstract void hacerAlgo(Socket socket) throws IOException;

	

}
