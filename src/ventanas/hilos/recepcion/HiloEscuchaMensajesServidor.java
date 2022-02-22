package ventanas.hilos.recepcion;

import java.io.IOException;
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

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		// TODO Auto-generated method stub

	}

}
