package ventanas.hilos.recepcion;

import java.io.IOException;
import java.net.Socket;

import lombok.Data;
import ventanas.trabajo.Chat;

@Data
public class HiloEscuchaDesconexionServidor extends HiloEscucha {

	
	
	public HiloEscuchaDesconexionServidor(Chat chat, int puerto) {
		super(chat, puerto);
	}
	public HiloEscuchaDesconexionServidor(int puerto) {
		super(puerto);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void hacerAlgo(Socket socket)  {
		Chat.usuarios.ifPresent(m->{
			m.remove(socket.getInetAddress().getHostAddress());
			});
		Chat.usuarios.ifPresent(m->{
			m.forEach((ip,nick)->{
				//envio a todos
			});
		});
		

	}

	

}
