package ventanas.hilos;

import java.awt.geom.Rectangle2D;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ventanas.VentanaBolas;

@Setter
@Getter
@AllArgsConstructor
public class Bola extends Thread {

	private int posicionX, posicionY, sentidoX, sentidoY, incrementoX, incrementoY, dimension, impactos;
	private VentanaBolas ventanaBolas;

	@Override
	public void run() {
		boolean fin = false;
		try {
			while (!fin) {

				if (getPosicionX() < 0 || (getPosicionX() + getDimension()) > getVentanaBolas().getWidth()) {
					setSentidoX(getSentidoX() * -1);
				}
				if (getPosicionY() < 0 || (getPosicionY() + getDimension()) > getVentanaBolas().getHeight()) {
					setSentidoY(getSentidoY() * -1);
				}
				getVentanaBolas().getBolas().stream().filter(b -> !this.equals(b)).forEach(b -> {
					if (miraChoque(b)) {
						setSentidoX(getSentidoX() * -1);
						setSentidoY(getSentidoY() * -1);
						b.setSentidoX(getSentidoX() * -1);
						b.setSentidoY(getSentidoY() * -1);
						setImpactos(getImpactos() + 1);
						b.setImpactos(b.getImpactos() + 1);
					}
				});
				setPosicionX(getPosicionX() + (getIncrementoX() * getSentidoX()));
				setPosicionY(getPosicionY() + (getIncrementoY() * getSentidoY()));
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*if (getImpactos() > 1000) {
					// getVentanaBolas().getBolas().remove(this);
					fin = true;
				}*/
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		} finally {
			getVentanaBolas().getBolas().remove(this);
		}

	}

	private boolean miraChoque(Bola bola) {
		Rectangle2D.Double miRectangulo = new Rectangle2D.Double(this.getPosicionX(), this.getPosicionY(),
				this.getDimension(), this.getDimension());
		return miRectangulo.intersects((double) bola.getPosicionX(), (double) bola.getPosicionY(),
				(double) bola.getDimension(), (double) bola.getDimension());
	}

}
