package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.trabajo.Chat;

@Data
@EqualsAndHashCode(callSuper = false)
public class HiloEnvioRegistroCliente extends HiloEnvio {

	public HiloEnvioRegistroCliente(Chat chat, String ip, int puerto) {
		super(chat, ip, puerto);
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {

		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		printWriter.println(getChat().getTNick().getText());
		printWriter.flush();

	}

}
