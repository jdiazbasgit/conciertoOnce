package ventanas.hilos.envio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import lombok.Data;
import ventanas.Chat;

@Data

public class HiloEnvioRegistroCliente extends Thread{
	Chat chat = new Chat();
	socket = new Socket(IP_SERVIDOR, PUERTO_ENVIO_REGISTRO_CLIENTE);
	Socket socket = null;
	try {
		socket = new Socket("192.168.10.18", 5000);
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		printWriter.println("Hola soy javi");
		printWriter.flush();
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
