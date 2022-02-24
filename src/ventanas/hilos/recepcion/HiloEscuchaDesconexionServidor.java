package ventanas.hilos.recepcion;

import java.io.IOException;
import java.net.Socket;

import lombok.Data;
import ventanas.hilos.envio.HiloEnvio;
import ventanas.hilos.envio.HiloEnvioRegistroServidor;
import ventanas.trabajo.Chat;
import ventanas.trabajo.Servidor;

@Data
public class HiloEscuchaDesconexionServidor extends HiloEscucha {

	
	
	
	public HiloEscuchaDesconexionServidor(int puerto) {
		super(puerto);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void hacerAlgo(Socket socket)  {
		Servidor.getUsuarios().remove(socket.getInetAddress().getHostAddress());
			
		for (String ip : Servidor.getUsuarios().keySet()) {
			HiloEnvio envio= new HiloEnvioRegistroServidor( ip, Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE);
			envio.start();
			
		}
		

	}

	

}
