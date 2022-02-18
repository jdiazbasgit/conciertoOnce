package chat.hilos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.HashMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.Chat;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
public class HiloEscuchaRegistroCliente extends Thread{
	private Chat chat;
	

	@Override
	public void run() {
	    // crear socket con el nombre host y el número puerto		
		ObjectInputStream objectInputStream=null;
		try(Socket socketCliente = new Socket(Chat.IP_SERVIDOR, Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE)){
			while(true) {
				objectInputStream= new ObjectInputStream(socketCliente.getInputStream());
				HashMap<String,String> listaUsuarios = (HashMap<String,String>)objectInputStream.readObject();
				StringBuilder stringBuilder = new StringBuilder();
				for (String nick : listaUsuarios.values()) {
					stringBuilder.append(nick);
				}
				chat.getTaUsuarios().replaceRange(stringBuilder.toString(), 0, chat.getTaUsuarios().getRows());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (objectInputStream != null)
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	

}