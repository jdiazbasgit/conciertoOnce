package ventanas;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Graphics;
import java.awt.Image;

@SuppressWarnings("serial")
public class VentanaBolas extends Frame implements WindowListener{
 private int fin;
	public VentanaBolas() {
		this.setSize(500, 500);
		this.addWindowListener(this);
		
	}

	@Override
	public void paint(Graphics g) {

		Image imagen = this.createImage(2000, 2000);
		Graphics externo = imagen.getGraphics();
		Bola bola = new Bola(200, 200, 1, 1, 2, 1, 50);
		while (fin==0) {
			externo.clearRect(0, 0, this.getWidth(), this.getHeight());

			if (bola.getPosicionX() < 0 || bola.getPosicionX() > this.getWidth() - bola.getDimension()) {
				bola.setSentidoX(bola.getSentidoX() * -1);
				if (bola.getPosicionX() <= 0) {

					for (int i = 50; i > 25; i--) {
						externo.clearRect(0, 0, this.getWidth(), this.getHeight());
						externo.fillOval(bola.getPosicionX(), bola.getPosicionY(), i, bola.getDimension());
						g.drawImage(imagen, 0, 0, 2000, 2000, this);
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					for (int i = 25; i < 50; i++) {
						externo.clearRect(0, 0, this.getWidth(), this.getHeight());
						externo.fillOval(bola.getPosicionX(), bola.getPosicionY(), i, bola.getDimension());
						g.drawImage(imagen, 0, 0, 2000, 2000, this);
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				if (bola.getPosicionX() <= 950) {

					for (int i = 50; i > 25; i--) {
						externo.clearRect(0, 0, this.getWidth(), this.getHeight());
						externo.fillOval(bola.getPosicionX(), bola.getPosicionY(), i, bola.getDimension());
						//bola.setPosicionX(bola.getPosicionX() +1);
						g.drawImage(imagen, 0, 0, 2000, 2000, this);
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					for (int i = 25; i < 50; i++) {
						externo.clearRect(0, 0, this.getWidth(), this.getHeight());
						externo.fillOval(bola.getPosicionX(), bola.getPosicionY(), i, bola.getDimension());
						g.drawImage(imagen, 0, 0, 2000, 2000, this);
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				if (bola.getPosicionY() <= 50) {

					for (int i = 50; i > 25; i--) {
						externo.clearRect(0, 0, this.getWidth(), this.getHeight());
						externo.fillOval(bola.getPosicionX(), bola.getPosicionY(), i, bola.getDimension());
						g.drawImage(imagen, 0, 0, 2000, 2000, this);
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					for (int i = 25; i < 50; i++) {
						externo.clearRect(0, 0, this.getWidth(), this.getHeight());
						externo.fillOval(bola.getPosicionX(), bola.getPosicionY(), i, bola.getDimension());
						g.drawImage(imagen, 0, 0, 2000, 2000, this);
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

			if (bola.getPosicionY() < 5 || bola.getPosicionY() > this.getHeight() - bola.getDimension())
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

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		setFin(1);
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the fin
	 */
	public int getFin() {
		return fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(int fin) {
		this.fin = fin;
	}

}
