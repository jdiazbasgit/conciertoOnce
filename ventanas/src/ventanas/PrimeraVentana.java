/*package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class PrimeraVentana extends Frame {

	public PrimeraVentana(String title) {
		super(title);
	this.setSize(500, 500);
	this.setLocation(100, 100);
    Color color=new Color(40,60,120);
    this.setBackground(color);
	}

@Override
public void paint(Graphics g) {
	g.setColor(Color.PINK);
	g.fillOval(200, 200,100,100);
	g.setColor(Color.ORANGE);
	g.fillRect(50,50,100,150);
	g.setFont(new Font("Arial",Font.BOLD,50));
	g.drawString("Estamos en ventanas",50,400);
	g.drawLine(490, 490, 490,10);
	
}
	}*/
	
	
	

package ventanas;
public class PrimeraVentana {

	public PrimeraVentana(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PrimeraVentana primeraVentana= new PrimeraVentana("Titulo de la primera ventana");
		primeraVentana.setVisible(true);
		
	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
