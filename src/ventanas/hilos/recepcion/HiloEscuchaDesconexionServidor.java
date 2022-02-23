package ventanas.hilos.recepcion;


import java.net.Socket;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.hilos.envio.HiloEnvioRegistroServidor;
import ventanas.trabajo.Chat;
import ventanas.trabajo.Servidor;

@Data
@EqualsAndHashCode(callSuper=false)
public class HiloEscuchaDesconexionServidor extends HiloEscucha {
	
	public HiloEscuchaDesconexionServidor(Chat chat, int puerto) {
		super(chat, puerto);
	}
	
	public HiloEscuchaDesconexionServidor(int puerto) {
		super(puerto);
	}
	
	@Override
	public void hacerAlgo(Socket socket)  {
		
		Servidor.getUsuarios().remove(socket.getInetAddress().getHostAddress());
			
		for (String ip : Servidor.getUsuarios().keySet()) {
			new HiloEnvioRegistroServidor(getChat(), ip, Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE).start();
			
		}	
	}
}
