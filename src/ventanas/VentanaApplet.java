package ventanas;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class VentanaApplet extends Applet {

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(100,100,100,100);
	}
	
	

}
