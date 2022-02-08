package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class PrimeraVentana extends Frame {

	public PrimeraVentana(String titulo) {
		super(titulo);
		this.setSize(500, 500);
		this.setLocation(100, 100);

		Color color = new Color(50, 80, 120);
		this.setBackground(color);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.PINK);
		g.fillOval(200, 200, 100, 100);
		g.setColor(Color.YELLOW);
		g.fillRect(50, 50, 100, 150);
		g.setFont(new Font("helvetica", Font.BOLD, 50));
		g.drawString("Estamos en ventanas", 50, 400);
		g.drawLine(490, 490, 490, 10);
	}

}
