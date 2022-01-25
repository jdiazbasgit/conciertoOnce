package ventanas;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

public class VentanaBolas extends Frame {

	public VentanaBolas() {
		this.setSize(500, 500);

	}

	@Override
	public void paint(Graphics g) {

		Image imagen = this.createImage(2000, 2000);
		Graphics externo = imagen.getGraphics();
		Bola bola = new Bola(200, 200, 1, 1, 2, 1, 50);
		while (true) {
			externo.clearRect(0, 0,this.getWidth() , this.getHeight());
			

			if (bola.getPosicionX() < 0 || bola.getPosicionX() > this.getWidth()-bola.getDimension())
				bola.setSentidoX(bola.getSentidoX() * -1);
			
			if (bola.getPosicionY() < 5 || bola.getPosicionY() > this.getHeight()-bola.getDimension())
				bola.setSentidoY(bola.getSentidoY() * -1);

			bola.setPosicionX(bola.getPosicionX() + (bola.getIncrementoX() * bola.getSentidoX()));
			bola.setPosicionY(bola.getPosicionY() + (bola.getIncrementoY() * bola.getSentidoY()));
			externo.fillOval(bola.getPosicionX(), bola.getPosicionY(), bola.getDimension(), bola.getDimension());
			g.drawImage(imagen, 0, 0, 2000, 2000, this);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

}
