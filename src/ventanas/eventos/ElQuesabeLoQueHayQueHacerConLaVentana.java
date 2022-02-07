package ventanas.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class ElQuesabeLoQueHayQueHacerConLaVentana extends WindowAdapter {

	public ElQuesabeLoQueHayQueHacerConLaVentana() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

}
