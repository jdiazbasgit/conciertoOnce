package ventanas.hilos.recepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import lombok.Data;
import ventanas.hilos.envio.HiloEnvioMensajesServidor;
import ventanas.hilos.envio.HiloEnvioRegistroServidor;
import ventanas.trabajo.Chat;
import ventanas.trabajo.Servidor;

@Data
public class HiloEscuchaRegistroServidor extends HiloEscucha {

	public HiloEscuchaRegistroServidor(Chat chat, int puerto) {
		super(chat, puerto);
	}

	public HiloEscuchaRegistroServidor(int puerto) {
		super(puerto);
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {

		
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			String usuario = bufferedReader.readLine();
			if (Servidor.getUsuarios().isEmpty())
				Servidor.getUsuarios().put(getIp(), usuario);
			else
			Servidor.getUsuarios().forEach((ip, nick) -> {

				if (nick.equalsIgnoreCase(usuario)) {
					HiloEnvioMensajesServidor envio= new HiloEnvioMensajesServidor("El nick ya existe....", getIp(), Chat.PUERTO_ESCUCHA_MENSAJES_CLIENTE);
					envio.start();
					try {
						socket.close(); //cuando el nick coincide mando mensaje y mato el socket
					} catch (IOException e) {
						e.printStackTrace();
					}
					return;
				} else {
					Servidor.getUsuarios().put(getIp(), usuario);
					
				}
				
			});

			Servidor.getUsuarios().forEach((ip, nick) -> {
				HiloEnvioRegistroServidor envio = new HiloEnvioRegistroServidor(getChat(), ip,
						Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE);
				envio.start();
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		socket.close();

	}

}
