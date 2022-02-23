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
	public synchronized void hacerAlgo(Socket socket) throws IOException {

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			String usuario = bufferedReader.readLine();			
			Servidor.getUsuarios().forEach( (ip, nick) -> {
				if (nick.equalsIgnoreCase(usuario)) {
					HiloEnvioMensajesServidor envio= new HiloEnvioMensajesServidor("El nick ya existe....", getIp(), Chat.PUERTO_ESCUCHA_MENSAJES_CLIENTE);
					envio.start();
					return;		
				}
			});
			
			Servidor.getUsuarios().put(getIp(), usuario);			
			Servidor.getUsuarios().forEach((ip, nick) -> {
				new HiloEnvioRegistroServidor(getChat(), ip, Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE).start();
				
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		socket.close();

	}

}
