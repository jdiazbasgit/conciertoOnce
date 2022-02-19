package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import lombok.Data;
import ventanas.Chat;

@Data
public class HiloEnvioRegistroCliente extends Thread {
	private Socket socket;

	try

	{
		socket = new Socket(Chat.getIpServidor(), Chat.getPuertoEnvioRegistroCliente());
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		printWriter.println("Hola soy javi");
		printWriter.flush();
	}catch(
	UnknownHostException h)
	{
		h.printStackTrace();
	}catch(
	IOException i)
	{
		i.printStackTrace();
	}finally
	{
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}}
