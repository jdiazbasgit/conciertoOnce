package ventanas.hilos.recepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import lombok.Data;
import ventanas.hilos.envio.HiloEnvioRegistroServidor;
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

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		// aqui hay que meter la funcionalidad del mensaje servidor

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			String mensaje = bufferedReader.readLine();
			if (Chat.mensajes.isEmpty())
				Chat.mensajes.put(getIp(), mensaje);
			Chat.mensajes.forEach((ip, msg) -> {

				System.out.println(ip + "dice: " + mensaje);

//				if (msg.equals(mensaje)) {
//					
//
//				} else {
//					Chat.mensajes.put(getIp(), mensaje);
//					
//				}
			});

			Chat.mensajes.forEach((ip, msg) -> {
				// aqui seria HiloEnvioMensajeServidor
				HiloEnvioRegistroServidor envioMensaje = new HiloEnvioRegistroServidor(getChat(), ip,
						Chat.PUERTO_ESCUCHA_MENSAJES_SERVIDOR);
				envioMensaje.start();
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		socket.close();

//				String ip = socket.getInetAddress().getHostName();
//				InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
//				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//				String mensaje = bufferedReader.readLine();
//				System.out.println(ip + "dice: " + mensaje);
	}

}
