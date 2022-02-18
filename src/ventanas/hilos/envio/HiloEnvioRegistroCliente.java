package ventanas.hilos.envio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lombok.Data;
import ventanas.Chat;

@Data

public class HiloEnvioRegistroCliente extends Thread{
	//variables estaticas puertos
	//PUERTO 5002
	private static final int PUERTO_ENVIO_REGISTRO_CLIENTE = 5002;
	private static final String IP_SERVIDOR = "192.168.10.44";
	private String nick;
	
	Chat chat = new Chat();
	chat.getBRegistrar().addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			System.out.println("hola he pulsado el boton");
			String nick;
			nick = getTNick().getText();
			System.out.println(nick);
		}
	});
	
	

}
