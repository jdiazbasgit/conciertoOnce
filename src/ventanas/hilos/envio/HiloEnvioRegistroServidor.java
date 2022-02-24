package ventanas.hilos.envio;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import ventanas.trabajo.Chat;
import ventanas.trabajo.Servidor;

public class HiloEnvioRegistroServidor extends HiloEnvio  {

	
	

	public HiloEnvioRegistroServidor(String ip, int puerto) {
		super(ip, puerto);	
	}
	



	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(socket.getOutputStream());
		objectOutputStream.writeObject(Servidor.getUsuarios());
		objectOutputStream.flush();
		
		
		
	}
}
