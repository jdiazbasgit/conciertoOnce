package ventanas.hilos.recepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.hilos.envio.HiloEnvioMensajesServidor;
import ventanas.trabajo.Chat;
import ventanas.trabajo.Servidor;

@Data
@EqualsAndHashCode(callSuper = false)
public class HiloEscuchaMensajesServidor extends HiloEscucha {

	public HiloEscuchaMensajesServidor(Chat chat, int puerto) {
		super(chat, puerto);
	}

	public HiloEscuchaMensajesServidor(int puerto) {
		super(puerto);
	}

	public void hacerAlgo(Socket socket) throws IOException {
		
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			String mensaje = bufferedReader.readLine();
			String nick = Servidor.getUsuarios().get(getIp());
			String salida = nick + " Dice: " + mensaje;
			Servidor.getUsuarios().keySet().forEach(ip -> {
					new HiloEnvioMensajesServidor(salida, ip, Chat.PUERTO_ESCUCHA_MENSAJES_CLIENTE).start();
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
