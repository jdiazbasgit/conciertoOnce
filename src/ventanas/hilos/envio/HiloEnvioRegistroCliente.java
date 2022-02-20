package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.Chat;

@EqualsAndHashCode(callSuper = false)
@Data
public class HiloEnvioRegistroCliente extends Thread {
private Socket socketRegistroCliente = null;
	public void run() {
		
		try {
			socketRegistroCliente = new Socket(Chat.getIpServidor(), Chat.getPuertoEnvioRegistroCliente());
			PrintWriter printWriter = new PrintWriter(socketRegistroCliente.getOutputStream());
			printWriter.println("Grupo 1 +++");
			printWriter.flush();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socketRegistroCliente.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}