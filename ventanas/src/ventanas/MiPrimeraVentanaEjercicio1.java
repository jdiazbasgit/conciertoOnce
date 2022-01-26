package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class MiPrimeraVentanaEjercicio1 extends Frame {
	public MiPrimeraVentanaEjercicio1(String title) {
		super(title);
		this.setSize(500, 500);
		this.setLocation(20, 20);
		Color color = new Color(140, 180, 50);
		this.setBackground(color);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.PINK);
		g.fillOval(100, 350, 150, 150);
		g.setColor(Color.ORANGE);
		g.fillRect(600, 150, 250, 150);
		g.setFont(new Font("Arial", Font.BOLD,50));
		g.drawString("Mi Ventana", 50,300);
		g.drawLine(175, 425, 725, 225);
	}

	}
