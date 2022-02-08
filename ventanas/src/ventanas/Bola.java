package ventanas;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("unused")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class Bola extends Thread {
	private int posicionX, posicionY, sentidoX, sentidoY, incrementoX, incrementoY, dimension;
	private VentanaBolas ventanaBolas;

	public void run() {
		while (true) {

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
				}
			});

			setPosicionX(getPosicionX() + (getIncrementoX() * getSentidoX()));
			setPosicionY(getPosicionY() + (getIncrementoY() * getSentidoY()));
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	@SuppressWarnings({ })
	private <getPosicionX> boolean miraChoque(Bola bola) {
		Rectangle2D.Double miRectangulo = new Rectangle2D.Double(this.getPosicionX(), this.getPosicionY(),
				this.getDimension(), this.getDimension());
		return miRectangulo.intersects((double) bola.getPosicionX(), (double) bola.getPosicionY(),
				(double) bola.getDimension(), (double) bola.getDimension());
	}

}
