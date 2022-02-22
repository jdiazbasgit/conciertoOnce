package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import lombok.Data;
import ventanas.trabajo.Chat;

@Data
public class HiloEnvioRegistroCliente extends HiloEnvio {
	// variables estaticas puertos
	// PUERTO 5002
	private Chat chat;
	private int puerto;
	private String ip;

	public HiloEnvioRegistroCliente(Chat chat, String ip, int puerto) {
		super(chat, ip, puerto);
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {

		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		printWriter.println(getChat().getTNick().getText());
		printWriter.flush();

		System.out.println(getChat().getTNick().getText() + "Esto es del hilo de registro");

		
		

	}

}
