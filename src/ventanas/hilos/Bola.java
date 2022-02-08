package ventanas.hilos;

import ventanas.VentanaBolas;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class Bola extends Thread {
	
	private int posicionX,posicionY,sentidoX,sentidoY,incrementoX,incrementoY,dimension;
	private VentanaBolas ventanaBolas;
	private int impactos;

	

	public Bola(int posicionX, int posicionY, int sentidoX, int sentidoY, int incrementoX, int incrementoY,
			int dimension, VentanaBolas ventanaBolas, int impactos) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.sentidoX = sentidoX;
		this.sentidoY = sentidoY;
		this.incrementoX = incrementoX;
		this.incrementoY = incrementoY;
		this.dimension = dimension;
		this.ventanaBolas=ventanaBolas;
		this.impactos=impactos;
	}

	public int getImpactos() {
		return impactos;
	}




	public void setImpactos(int impactos) {
		this.impactos = impactos;
	}




	public VentanaBolas getVentanaBolas() {
		return ventanaBolas;
	}




	public void setVentanaBolas(VentanaBolas ventanaBolas) {
		this.ventanaBolas = ventanaBolas;
	}



	
	
	@Override
	public void run() {
		while(true) {
			
			if(getPosicionX()<0 || (getPosicionX()+getDimension())>getVentanaBolas().getWidth())
			{
				setSentidoX(getSentidoX()*-1);
			}
			if(getPosicionY()<0 || (getPosicionY()+getDimension())>getVentanaBolas().getHeight())
			{
				setSentidoY(getSentidoY()*-1);
			}
			getVentanaBolas().getBolas().stream().filter(b->! this.equals(b)).forEach(b->{
				if(miraChoque(b)) {
					setSentidoX(getSentidoX()*-1);
					setSentidoY(getSentidoY()*-1);
					b.setSentidoX(getSentidoX()*-1);
					b.setSentidoY(getSentidoY()*-1);
					this.setImpactos(getImpactos()+1);
					b.setImpactos(b.getImpactos()+1);
				}
			});
			setPosicionX(getPosicionX()+(getIncrementoX()*getSentidoX()));
			setPosicionY(getPosicionY()+(getIncrementoY()*getSentidoY()));
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	private boolean miraChoque(Bola bola) {
		Rectangle2D.Double miRectangulo=new Rectangle2D.Double(this.getPosicionX(),this.getPosicionY(),this.getDimension(),this.getDimension());
		return miRectangulo.intersects((double)bola.getPosicionX(),(double)bola.getPosicionY(),(double)bola.getDimension(),(double)bola.getDimension());
	}


	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public int getSentidoX() {
		return sentidoX;
	}

	public void setSentidoX(int sentidoX) {
		this.sentidoX = sentidoX;
	}

	public int getSentidoY() {
		return sentidoY;
	}

	public void setSentidoY(int sentidoY) {
		this.sentidoY = sentidoY;
	}

	public int getIncrementoX() {
		return incrementoX;
	}

	public void setIncrementoX(int incrementoX) {
		this.incrementoX = incrementoX;
	}

	public int getIncrementoY() {
		return incrementoY;
	}

	public void setIncrementoY(int incrementoY) {
		this.incrementoY = incrementoY;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

}
