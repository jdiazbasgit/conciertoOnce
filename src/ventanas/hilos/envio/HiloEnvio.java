package ventanas.hilos.envio;

import java.io.IOException;
import java.net.Socket;
import java.util.Optional;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.trabajo.Chat;
import ventanas.trabajo.Servidor;

@Data
@EqualsAndHashCode(callSuper = false)
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
		super();
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
			System.out.println("el usuario " + Servidor.getUsuarios().get(getIp()) + " no esta conectado, lo elimino");
			Servidor.getUsuarios().remove(getIp());
			Servidor.getUsuarios().forEach((ip, nick) -> {
				HiloEnvioRegistroServidor envio = new HiloEnvioRegistroServidor(getChat(), ip,
						Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE);
				envio.start();
			});

			System.out.println("Error de conexión");
		} finally {
			Optional.ofNullable(socket).ifPresent(sock -> {
				try {
					sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
	}

	public abstract void hacerAlgo(Socket socket) throws IOException;

}
