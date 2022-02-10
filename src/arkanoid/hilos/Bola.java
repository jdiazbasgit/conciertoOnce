package arkanoid.hilos;

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

		while (true) {
			
			try {
				if (getPosicionX() < 0 || (getPosicionX() + getDimension()) > getVentanaArkanoid().getWidth()) {
					setSentidoX(getSentidoX() * -1);
				}
				if (getPosicionY() < 0 || (getPosicionY() + getDimension()) > getVentanaArkanoid().getHeight()) {
					setSentidoY(getSentidoY() * -1);
				}
				getVentanaArkanoid().getCuadrados().forEach(c->{
					if(miraChoque(c)) {
						getVentanaArkanoid().getCuadrados().remove(c);
						this.setSentidoX(getSentidoX()*-1);
						this.setSentidoY(getSentidoY()*-1);
						
					}
				});
				this.setPosicionX(this.getPosicionX()+this.getIncrementoX()*this.getSentidoX());;
				this.setPosicionY(this.getPosicionY()+this.getIncrementoY()*this.getSentidoY());;
			Thread.sleep(1);
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

}
