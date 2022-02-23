package ventanas.hilos.recepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import lombok.Data;
import ventanas.trabajo.Chat;

@Data
public class HiloEscuchaMensajesServidor extends HiloEscucha {

	public HiloEscuchaMensajesServidor(Chat chat, int puerto) {
		super(chat, puerto);
		// TODO Auto-generated constructor stub
	}

	public HiloEscuchaMensajesServidor(int puerto) {
		super(puerto);
		// TODO Auto-generated constructor stub
	}

	public void hacerAlgo(Socket socket) throws IOException {
		// aqui hay que meter la funcionalidad del mensaje servidor

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			String mensaje = bufferedReader.readLine();
			String nick = Chat.usuarios.get(getIp());
			String salida = nick + " Dice: " + mensaje;
			Chat.usuarios.forEach((ip, msg) -> {

				// enviar mensaje
			});

		} catch (

		Exception e) {
			e.printStackTrace();
		}

		socket.close();

	}

}
