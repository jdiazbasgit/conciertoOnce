package ventanas.hilos.envio;

import java.io.IOException;
import java.net.Socket;

import lombok.Data;
import ventanas.trabajo.Chat;

@Data
public abstract class HiloEnvio extends Thread {

	private Chat chat;
	private int puerto;

	private String ip;

	public HiloEnvio(Chat chat, String ip, int puerto) {
		this.chat = chat;
		this.puerto = puerto;
		this.ip = ip;
	}

	public HiloEnvio(String ip, int puerto) {
		this.puerto = puerto;
		this.ip = ip;
	}

	@Override
	public void run() {
		Socket socket = null;
		try {

			socket = new Socket(getIp(), getPuerto());
			hacerAlgo(socket);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("el usuario " + Chat.usuarios.get().get(getIp()) + " no esta conectado, lo elimino");
			Chat.usuarios.get().remove(getIp());
			Chat.usuarios.ifPresent(m -> {
				m.forEach((ip, nick) -> {
					// enviar map a esta ip
				});
			});

		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public abstract void hacerAlgo(Socket socket) throws IOException;
}
