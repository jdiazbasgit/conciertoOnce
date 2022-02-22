package ventanas.hilos.recepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import lombok.Data;
import ventanas.hilos.envio.HiloEnvioRegistroServidor;
import ventanas.trabajo.Chat;

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
			if(Chat.usuarios.isEmpty())
				Chat.usuarios.put(getIp(), usuario);
			Chat.usuarios.forEach((ip, nick) -> {
				
				if (nick.equals(usuario)) {
					// envio menmsaje usuario existente

				} else {
					Chat.usuarios.put(getIp(), usuario);
					
				}
			});
			
			Chat.usuarios.forEach((ip,nick)->{
				HiloEnvioRegistroServidor envio = new HiloEnvioRegistroServidor(getChat(), ip,
						Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE);
				envio.start();
			});

		} catch (IOException e) {
			e.printStackTrace();
		}

		
		socket.close();

	}

}
