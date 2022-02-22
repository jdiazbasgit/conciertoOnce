package arkanoid.hilos;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

import arkanoid.ventanas.Bloque;
import arkanoid.ventanas.VentanaArkanoid;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=false)
public class Bola extends Thread {

	public Bola(int posicionX, int posicionY, int sentidoX, int sentidoY, int incrementoX, int incrementoY,
			int dimension, VentanaArkanoid ventanaArkanoid) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.sentidoX = sentidoX;
		this.sentidoY = sentidoY;
		this.incrementoX = incrementoX;
		this.incrementoY = incrementoY;
		this.dimension = dimension;
		this.ventanaArkanoid = ventanaArkanoid;
	}

	private int posicionX, posicionY, sentidoX, sentidoY, incrementoX, incrementoY, dimension;
	private VentanaArkanoid ventanaArkanoid;

	@Override
	public void run() {

		while (getVentanaArkanoid().getCuadrados().size() > 0) {

			try {
				if (getPosicionX() < 60 || (getPosicionX() + getDimension()) > getVentanaArkanoid().getWidth()) {
					setSentidoX(getSentidoX() * -1);
				}
				
				if (getPosicionX() >2435 || (getPosicionX() + getDimension()) > getVentanaArkanoid().getWidth()) {
					setSentidoX(getSentidoX() * -1);
				}
				
				
				if (getPosicionY() < 65 || (getPosicionY() + getDimension()) > getVentanaArkanoid().getHeight()) {
					setSentidoY(getSentidoY() * -1);
				}
				
				getVentanaArkanoid().getCuadrados().forEach(c -> {
					if (miraChoque(c)) {
						Rectangle2D.Double miRectangulo = new Rectangle2D.Double(this.getPosicionX(),
								this.getPosicionY(), this.getDimension(), this.getDimension());
						if (miRectangulo.intersectsLine((int) (c.getPosicionX()+this.getDimension()), (int) (c.getPosicionY()),
								(int) (c.getPosicionX() + c.getAncho()+this.getDimension()), (int) (c.getPosicionY()))
								|| miRectangulo.intersectsLine((int) (c.getPosicionX()+this.getDimension()),
										(int) (c.getPosicionY() + c.getAlto()), (int) (c.getPosicionX() + c.getAncho()+this.getDimension()),
										(int) (c.getPosicionY() + c.getAlto()))) {
							this.setSentidoY(this.getSentidoY() * -1);
						}

						if (miRectangulo.intersectsLine((int) (c.getPosicionX()), (int) (c.getPosicionY()),
								(int) (c.getPosicionX()), (int) (c.getPosicionY() + c.getAlto()))
								|| miRectangulo.intersectsLine((int) (c.getPosicionX() + c.getAncho()),
										(int) (c.getPosicionY()), (int) (c.getPosicionX() + c.getAncho()),
										(int) (c.getPosicionY() + c.getAlto()))) {
							this.setSentidoX(this.getSentidoX() * -1);
						}
						
						
						c.setGolpes(c.getGolpes()-1);
						if(c.getGolpes()==0)
							
						c.setGolpes(c.getGolpes());
						if(c.getGolpes()<3) 
							c.setColor(Color.GREEN);
						if(c.getGolpes()<2) 
							c.setColor(Color.CYAN);
						//if(c.getGolpes()<1) 
							//c.setColor(Color.YELLOW);
						
						if(c.getGolpes()<1) 
							getVentanaArkanoid().getCuadrados().remove(c);
						
						//getVentanaArkanoid().getCuadrados().remove(c);
					}
					
					
				
				});
				this.setPosicionX(this.getPosicionX() + this.getIncrementoX() * this.getSentidoX());
				this.setPosicionY(this.getPosicionY() + this.getIncrementoY() * this.getSentidoY());
				Thread.sleep(getVentanaArkanoid().getVelocidad());
			} catch (Exception e) {
			
			}
		}

	}

	private synchronized boolean miraChoque(Bloque bloque) {
		Rectangle2D.Double miRectangulo = new Rectangle2D.Double(this.getPosicionX(), this.getPosicionY(),
				this.getDimension(), this.getDimension());
		return miRectangulo.intersects((double) bloque.getPosicionX(), (double) bloque.getPosicionY(),
				(double) bloque.getAncho(), (double) bloque.getAlto());
	}

}
