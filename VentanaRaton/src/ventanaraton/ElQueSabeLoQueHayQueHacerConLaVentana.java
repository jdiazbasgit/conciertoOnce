package ventanaraton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ElQueSabeLoQueHayQueHacerConLaVentana extends WindowAdapter {
	public ElQuesabeLoQueHayQueHacerConLaVentana() {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

}
