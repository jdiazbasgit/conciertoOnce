package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import ventanas.trabajo.Chat;

public class HiloEnvioMensajeCliente  extends HiloEnvio {


	public HiloEnvioMensajeCliente(Chat chat, String ip, int puerto) {
		super(chat, ip, puerto);
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
       try(PrintWriter printWriter = new PrintWriter(socket.getOutputStream());){
    	   printWriter.println(getChat().getTMensaje().getText());
   		   printWriter.flush();

       }
		
		
		

	}

}