package ventanas.hilos.recepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import ventanas.trabajo.Chat;

public class HiloEscuchaMensajeCliente extends HiloEscucha {

	

	

	public HiloEscuchaMensajeCliente(int puerto) {
		super( puerto);
	}

	public HiloEscuchaMensajeCliente(Chat chat, int puerto) {
		super(chat, puerto);
	}

	
	@Override
	public void hacerAlgo(Socket socket) throws IOException {
               
		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		getChat().getTaMensajes().append(bufferedReader.readLine() +" \n");
		
	}

	
}
