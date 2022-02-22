package ventanas.hilos.envio;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import ventanas.Chat;

public class HiloEnvioRegistroServidor extends HiloEnvio  {

	
	

	public HiloEnvioRegistroServidor(Chat chat,String ip, int puerto) {
		super(chat, ip, puerto);	
	}



	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(socket.getOutputStream());
		objectOutputStream.writeObject(socket);
		objectOutputStream.flush();
		
		
		
	}
}
