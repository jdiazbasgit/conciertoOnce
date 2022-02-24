package ventanas.hilos.recepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import lombok.Data;
import ventanas.hilos.envio.HiloEnvio;
import ventanas.hilos.envio.HiloEnvioMensajesServidor;
import ventanas.hilos.envio.HiloEnvioRegistroServidor;
import ventanas.trabajo.Chat;
import ventanas.trabajo.Servidor;

@Data
public class HiloEscuchaRegistroServidor extends HiloEscucha {

	public HiloEscuchaRegistroServidor(int puerto) {
		super(puerto);
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			String usuario = bufferedReader.readLine();
			if (Servidor.getUsuarios().isEmpty())
				Servidor.getUsuarios().put(getIp(), usuario);
			else {

				if (Servidor.getUsuarios().values().stream().filter(n -> n.equalsIgnoreCase(usuario)).count() > 0)
					new HiloEnvioMensajesServidor("El nick ya existe...", getIp(), Chat.PUERTO_ESCUCHA_MENSAJES_CLIENTE)
							.start();
				else
					Servidor.getUsuarios().put(getIp(), usuario);
			}

			Servidor.getUsuarios().forEach((ip, nick) -> {
				HiloEnvioRegistroServidor envio = new HiloEnvioRegistroServidor(ip,
						Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE);
				envio.start();
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		socket.close();

	}

}
