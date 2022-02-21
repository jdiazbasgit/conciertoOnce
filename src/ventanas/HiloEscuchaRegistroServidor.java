package ventanas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import lombok.Data;
import ventanas.hilos.recepcion.HiloEscucha;

@Data
public class HiloEscuchaRegistroServidor extends HiloEscucha {
	private Chat chat;
	private int puerto;

	public HiloEscuchaRegistroServidor(Chat chat, int puerto) {
		super(chat, puerto);
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		getChat().getUsuarios().ifPresent(m -> {
			String usuario = null;
			try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
				usuario = bufferedReader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

		});

	};
}
