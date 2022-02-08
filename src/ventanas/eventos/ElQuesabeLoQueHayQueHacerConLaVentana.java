package ventanas.eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ElQuesabeLoQueHayQueHacerConLaVentana extends WindowAdapter {

	public ElQuesabeLoQueHayQueHacerConLaVentana() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

}
