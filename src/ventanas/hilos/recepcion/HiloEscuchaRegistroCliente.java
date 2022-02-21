package ventanas.hilos.recepcion;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import ventanas.Chat;

public class HiloEscuchaRegistroCliente extends HiloEscucha{
	private static final String SALTO_LINEA="\n";
	
	public HiloEscuchaRegistroCliente(Chat chat, int puerto) {
		super(chat,puerto);
	}

	@Override
	public void hacerAlgo(Socket socket) throws IOException {
		ObjectInputStream objectInputStream= new ObjectInputStream(socket.getInputStream());
		try {
			Object objectRecibido = objectInputStream.readObject();
			if( objectRecibido instanceof Map<?,?>) {
				Collection<?> nicksCollection = ((Map<?,?>)objectRecibido).values();
				
				StringBuilder stringBuilder = new StringBuilder();
				nicksCollection.stream().forEach(n->{
					stringBuilder.append( (String)n );
					stringBuilder.append( HiloEscuchaRegistroCliente.SALTO_LINEA );
				});
			
				super.getChat().getTaUsuarios().setText(stringBuilder.toString());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		/*if( objectRecibido instanceof Map<?,?>) {
			Collection<?> nicksCollection = ((Map<?,?>)objectRecibido).values();
			StringBuilder stringBuilder = new StringBuilder();
			for (Object nick : nicksCollection) {						
				stringBuilder.append( (String)nick );
				stringBuilder.append( HiloRecibeMapaUsuarios.SALTO_LINEA );
			}
			chat.getTaUsuarios().setText(stringBuilder.toString());
		}
		
		*/
		
	}
}
