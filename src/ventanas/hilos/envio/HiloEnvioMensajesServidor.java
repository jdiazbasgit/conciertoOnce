package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class HiloEnvioMensajesServidor extends HiloEnvio {

	private String texto;

	public HiloEnvioMensajesServidor(String texto, String ip, int puerto) {
		super(ip, puerto);
		this.texto = texto;
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		PrintStream printStream = new PrintStream(socket.getOutputStream());
		printStream.println(getTexto());
		printStream.flush();
	}

}
