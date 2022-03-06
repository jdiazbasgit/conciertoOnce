package proyecto.ventanaglobal;

import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class VerVentanaGlobal {

	public static void main(String[] args) {

		SwingUtilities.invokeLater( () -> {
			VentanaGlobal ventanaGlobal = new VentanaGlobal();
			ventanaGlobal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	 
			ventanaGlobal.setVisible(true);           
	    });			
	}

}
