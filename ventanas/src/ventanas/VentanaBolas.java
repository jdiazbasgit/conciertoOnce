package ventanas;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

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
		Bola bola=new Bola(200,200, 1,1,2,1,50);
		
		while (fin==0) {
			externo.clearRect(0, 0, 1000, 1000);
			
			if (bola.getPosicionX() < 0 || bola.getPosicionX() > this.getWidth()-bola.getDimension()) {
				bola.setSentidoX(bola.getSentidoX() * -1);
				if(bola.getPosicionX() <0)	{
					
					
				for(int i=25;i<50;i++) {
					externo.clearRect(0, 0,this.getWidth(),this.getHeight());
	             externo.fillOval(bola.getPosicionX(),bola.getPosicionY(),i,bola.getDimension());
	             g.drawImage(imagen,0,0,2000,2000,this);
	          
			      try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

			for(int i=(bola.getDimension()/2);i<(bola.getDimension());i++) {
				externo.clearRect(0, 0,this.getWidth(),this.getHeight());
	             externo.fillOval(bola.getPosicionX(),bola.getPosicionY(),i,bola.getDimension());
	             g.drawImage(imagen,0,0,2000,2000,this);
				}
			}try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
				
	}
			if(bola.getPosicionY()<5||bola.getPosicionY() > this.getHeight()-bola.getDimension())
				bola.setSentidoY(bola.getSentidoY() * -1);
			
			bola.setPosicionX(bola.getPosicionX() + (bola.getIncrementoX()*bola.getSentidoX()));
			bola.setPosicionY(bola.getPosicionY() + (bola.getIncrementoY()*bola.getSentidoY()));
		    externo.fillOval(bola.getPosicionX(),bola.getPosicionY(),bola.getDimension(),bola.getDimension());
			g.drawImage(imagen, 0, 0, 2000, 2000, this);

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
		
}
 

	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
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

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

}
