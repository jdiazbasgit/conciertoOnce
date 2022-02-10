package arkanoid.hilos;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

import arkanoid.ventanas.Bloque;
import arkanoid.ventanas.VentanaArkanoid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Bola extends Thread {

	private int posicionX, posicionY, sentidoX, sentidoY, incrementoX, incrementoY, dimension;
	private VentanaArkanoid ventanaArkanoid;

	@Override
	public void run() {

		while (this.getVentanaArkanoid().getCuadrados().size()>0) {

			try {
				if (getPosicionX() < 0 || (getPosicionX() + getDimension()) > getVentanaArkanoid().getWidth()) {
					setSentidoX(getSentidoX() * -1);
				}
				if (getPosicionY() < 0 || (getPosicionY() + getDimension()) > getVentanaArkanoid().getHeight()) {
					setSentidoY(getSentidoY() * -1);
				}
				getVentanaArkanoid().getCuadrados().forEach(c->{
					if(miraChoque(c)) {  //Cuando choca una bola con un bloque
						
						//Pillamos una linea
						Rectangle2D.Double miRectangulo = new Rectangle2D.Double(this.getPosicionX(), this.getPosicionY(),
								this.getDimension(), this.getDimension());
						
						if(miRectangulo.intersectsLine((int)(c.getPosicionX()),(int)(c.getPosicionY()), 
								(int)(c.getPosicionX()+c.getAncho()),(int) (c.getPosicionY()))
								
							|| miRectangulo.intersectsLine((int)(c.getPosicionX()),(int)(c.getPosicionY()+c.getAlto())    
							,(int)(c.getPosicionX()+c.getAncho()) ,(int)(c.getPosicionY()+c.getAlto()))) {
							
							this.setSentidoY(getSentidoY()*-1);
						}
						
						
						if(miRectangulo.intersectsLine((int)(c.getPosicionX()),(int)(c.getPosicionY()), 
								(int)(c.getPosicionX()),(int) (c.getPosicionY()+c.getAlto()))
								
							|| miRectangulo.intersectsLine((int)(c.getPosicionX()+ c.getAncho()),(int)(c.getPosicionY()+c.getAlto())    
							,(int)(c.getPosicionX()+c.getAncho()) ,(int)(c.getPosicionY()+c.getAlto()))) {
							
							this.setSentidoX(getSentidoX()*-1);
						}
						
						
						
						
						
						
						//this.setSentidoX(getSentidoX()*-1);
						//this.setSentidoY(getSentidoY()*-1);
						
						c.setGolpes(c.getGolpes()-1);
						
						if(c.getGolpes()==2) 
							c.setColor(Color.GREEN);
						if(c.getGolpes()==1) 
							c.setColor(Color.RED);
						
						
						if(c.getGolpes()==0) {
							getVentanaArkanoid().getCuadrados().remove(c);
						}
						//getVentanaArkanoid().getCuadrados().remove(c);
						
					}
				});
				this.setPosicionX(this.getPosicionX()+this.getIncrementoX()*this.getSentidoX());;
				this.setPosicionY(this.getPosicionY()+this.getIncrementoY()*this.getSentidoY());;
			Thread.sleep(getVentanaArkanoid().getVelocidad());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}

	}

	
	private synchronized boolean miraChoque(Bloque bloque) {
		Rectangle2D.Double miRectangulo = new Rectangle2D.Double(this.getPosicionX(), this.getPosicionY(),
				this.getDimension(), this.getDimension());
		return miRectangulo.intersects((double) bloque.getPosicionX(), (double) bloque.getPosicionY(),
				(double) bloque.getAncho(), (double) bloque.getAlto());
	}
	
	
	public Bola(int posicionX, int posicionY, int sentidoX, int sentidoY, int incrementoX, int incrementoY,
			int dimension, VentanaArkanoid ventanaArkanoid) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.sentidoX = sentidoX;
		this.sentidoY = sentidoY;
		this.incrementoX = incrementoX;
		this.incrementoY = incrementoY;
		this.dimension = dimension;
		this.ventanaArkanoid = ventanaArkanoid;
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

	public VentanaArkanoid getVentanaArkanoid() {
		return ventanaArkanoid;
	}

	public void setVentanaArkanoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}
	
	

}
