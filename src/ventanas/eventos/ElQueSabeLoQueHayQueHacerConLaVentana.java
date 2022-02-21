package ventanas.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lombok.Data;
import ventanas.Chat;
import ventanas.hilos.envio.HiloEnvioDesconexionCliente;

@Data
public class ElQueSabeLoQueHayQueHacerConLaVentana implements WindowListener{

	private Chat chat;
	public ElQueSabeLoQueHayQueHacerConLaVentana(Chat chat) {
		this.chat=chat;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
	
		HiloEnvioDesconexionCliente hiloEnvioDesconexionCliente= new HiloEnvioDesconexionCliente(getChat(), Chat.PUERTO_DESCONEXION);
		hiloEnvioDesconexionCliente.start();
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
