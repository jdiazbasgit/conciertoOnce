package ventanas.hilos.envio;

import java.io.IOException;
import java.net.Socket;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.trabajo.Chat;
import ventanas.trabajo.Servidor;

@EqualsAndHashCode(callSuper=false)
@Data
public abstract class HiloEnvio extends Thread implements HiloInterface {

	private Chat chat;
	private int puerto;

	private String ip;

	public HiloEnvio(Chat chat, String ip, int puerto) {
		this.chat = chat;
		this.puerto = puerto;
		this.ip = ip;
	}
	public HiloEnvio( String ip, int puerto) {
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
			System.out.println(
					"el usuario " + Servidor.getUsuarios().get(getIp()) + " no esta conectado, lo elimino");
			Servidor.getUsuarios().remove(getIp());
			Servidor.getUsuarios().forEach((ip,nick)->{
				HiloEnvioRegistroServidor envio = new HiloEnvioRegistroServidor( ip,
						Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE);
				envio.start();
			});
			
			//e.printStackTrace();
			System.out.println("Error de conexión");
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	
}
