package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import lombok.Data;
import ventanas.Chat;

@Data
public class HiloEnvioRegistroCliente extends HiloEnvio {
	// variables estaticas puertos
	// PUERTO 5002
	private Chat chat;
	private int puerto;
	private String nick;
	private String ip;

	public HiloEnvioRegistroCliente(Chat chat, String ip, int puerto, String nick) {
		super(chat, ip, puerto);
		this.nick = nick;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		try {

			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			printWriter.println(getNick());

			System.out.println(getNick() + "Esto es del hilo de registro");

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
