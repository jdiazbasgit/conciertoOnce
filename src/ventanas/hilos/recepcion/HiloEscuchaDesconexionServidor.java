package ventanas.hilos.recepcion;

import java.io.IOException;
import java.net.Socket;

import lombok.Data;
import ventanas.Chat;

@Data
public class HiloEscuchaDesconexionServidor extends HiloEscucha {

	
	
	public HiloEscuchaDesconexionServidor(Chat chat, int puerto) {
		super(chat, puerto);
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		getChat().getUsuarios().ifPresent(m->{
			m.remove(socket.getInetAddress().getHostAddress());
			});
		getChat().getUsuarios().ifPresent(m->{
			m.forEach((ip,nick)->{
				//envio a todos
			});
		});
		

	}

}
