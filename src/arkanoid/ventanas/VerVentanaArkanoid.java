package arkanoid.ventanas;

import java.awt.Toolkit;

public class VerVentanaArkanoid {

	public static void main(String[] args) {
		VentanaArkanoid ventanaArkanoid = new VentanaArkanoid();
		ventanaArkanoid.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		ventanaArkanoid.setResizable(false);

		ventanaArkanoid.setVisible(true);

	}

}
