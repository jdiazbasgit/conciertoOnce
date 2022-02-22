package ventanas.hilos.recepcion;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import ventanas.trabajo.Chat;

public class HiloEscuchaRegistroCliente extends HiloEscucha{
	private static final String SALTO_LINEA="\n";
	
	public HiloEscuchaRegistroCliente(Chat chat, int puerto) {
		super(chat,puerto);
	}

	@Override
	public void hacerAlgo(Socket socket)  {
		
		try (ObjectInputStream objectInputStream= new ObjectInputStream(socket.getInputStream())){
			Object objectRecibido = objectInputStream.readObject();
			if( objectRecibido instanceof Map<?,?>) {
				Collection<?> nicksCollection = ((Map<?,?>)objectRecibido).values();				
				StringBuilder stringBuilder = new StringBuilder();
				nicksCollection.stream().forEach(n->{
					stringBuilder.append( (String)n );
					stringBuilder.append( HiloEscuchaRegistroCliente.SALTO_LINEA );
				});			
				this.getChat().getTaUsuarios().setText(stringBuilder.toString());
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
				Optional.ofNullable(socket).ifPresent(s -> {
					try {
						s.close();
					} catch (IOException e) {
						e.getMessage();
					}
				});
		}
	

		
	}
}
