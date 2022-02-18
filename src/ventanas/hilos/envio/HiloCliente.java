package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.channels.AsynchronousServerSocketChannel;

public class HiloCliente extends Thread {
	
	@Override
	public void run() {
		
		Socket socket=null;
		try {
			 socket= new Socket("192.168.10.44", 5000);
			PrintWriter printWriter= new PrintWriter(socket.getOutputStream());
			printWriter.println("Hola soy el profe");
			printWriter.flush();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}