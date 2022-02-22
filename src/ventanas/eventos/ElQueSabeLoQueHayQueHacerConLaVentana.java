package ventanas.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lombok.Data;
import ventanas.hilos.envio.HiloEnvioDesconexionCliente;
import ventanas.trabajo.Chat;

@Data
public class ElQueSabeLoQueHayQueHacerConLaVentana implements WindowListener{

	
	public ElQueSabeLoQueHayQueHacerConLaVentana() {
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
	
		HiloEnvioDesconexionCliente hiloEnvioDesconexionCliente=
				new HiloEnvioDesconexionCliente( Chat.IP_SERVIDOR,Chat.PUERTO_DESCONEXION);
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
