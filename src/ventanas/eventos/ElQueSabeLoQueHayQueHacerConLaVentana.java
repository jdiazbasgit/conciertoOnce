package ventanas.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import lombok.Data;
import ventanas.hilos.envio.HiloEnvioDesconexionCliente;
import ventanas.trabajo.Chat;

@Data
public class ElQueSabeLoQueHayQueHacerConLaVentana implements WindowListener{

	
	public ElQueSabeLoQueHayQueHacerConLaVentana() {}

	
	@Override
	public void windowClosing(WindowEvent e) {	

		HiloEnvioDesconexionCliente hiloEnvioDesconexionCliente=
				new HiloEnvioDesconexionCliente( Chat.IP_SERVIDOR,Chat.PUERTO_DESCONEXION);
		hiloEnvioDesconexionCliente.start();
		System.exit(0);		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

}
