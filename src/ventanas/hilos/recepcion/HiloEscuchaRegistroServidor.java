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

	private boolean existe;
	
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
				
				Servidor.getUsuarios().forEach((ip, nick) -> {
					boolean existeFuncional=existe;
					if (nick.equalsIgnoreCase(usuario)) {
						HiloEnvio envio = new HiloEnvioMensajesServidor("El nick ya existe....",
								getIp(), Chat.PUERTO_ESCUCHA_MENSAJES_CLIENTE);
						envio.start();
						setExiste(true);
						
					} 
				});
				if(!isExiste())
					Servidor.getUsuarios().put(getIp(), usuario);
			}
			
			Servidor.getUsuarios().forEach((ip, nick) -> {
				HiloEnvioRegistroServidor envio = new HiloEnvioRegistroServidor( ip,
						Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE);
				envio.start();
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		socket.close();

	}

}
