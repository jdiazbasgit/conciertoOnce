package ventanas.hilos.recepcion;

import java.io.IOException;
import java.net.Socket;

import ventanas.Chat;

public class HiloEscuchaRegistroCliente extends HiloEscucha{
	public HiloEscuchaRegistroCliente(Chat chat, int puerto) {
		super(chat,puerto);
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
