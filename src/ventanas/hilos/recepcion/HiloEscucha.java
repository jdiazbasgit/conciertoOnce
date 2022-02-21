package ventanas.hilos.recepcion;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import lombok.Data;
import ventanas.Chat;

@Data
public abstract class HiloEscucha extends Thread {

	private Chat chat;
	private int puerto;
	
	private String ip;
	
	
	public HiloEscucha(Chat chat,int puerto) {
		this.chat = chat;
		this.puerto=puerto;
	}
	@Override
	public void run() {
		ServerSocket serverSocket=null;
		while (true) {
			try {
				serverSocket = new ServerSocket(getPuerto());
				Socket socket = serverSocket.accept();
				setIp(socket.getInetAddress().getHostAddress());
				hacerAlgo(socket);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					serverSocket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
		
	}
	public abstract void hacerAlgo(Socket socket) throws IOException ;
}
