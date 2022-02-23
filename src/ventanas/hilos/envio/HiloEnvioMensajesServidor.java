package ventanas.hilos.envio;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import lombok.Data;
import ventanas.trabajo.Chat;
@Data
public class HiloEnvioMensajesServidor extends HiloEnvio {
	
	  private String texto; private String ip; private int puerto;
	
 
	public HiloEnvioMensajesServidor(String texto, String ip, int puerto) {
		super(ip,puerto);
		 this.puerto = puerto;
		 
	}

	
		
	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		PrintStream printStream=new PrintStream(socket.getOutputStream());
		printStream.println(getTexto());
		printStream.flush();
/*
		 * printWriter.println(getChat().getTNick().getText()); printWriter.flush();
		 */
	}

}
