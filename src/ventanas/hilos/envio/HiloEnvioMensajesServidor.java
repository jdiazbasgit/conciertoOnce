package ventanas.hilos.envio;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import ventanas.trabajo.Chat;

public class HiloEnvioMensajesServidor extends HiloEnvio {
	
	  private String texto; private String ip; private int puerto;
	
 
	public HiloEnvioMensajesServidor(String texto, String ip, int puerto) {
		
		
		 this.texto = texto; this.ip = ip; this.puerto = puerto;
		 
	}

	
		
	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		DataOutputStream envioMensaje = new DataOutputStream(socket.getOutputStream());

		envioMensaje(getChat().getTMensaje().getText());

		/*
		 * printWriter.println(getChat().getTNick().getText()); printWriter.flush();
		 */
	}

}
