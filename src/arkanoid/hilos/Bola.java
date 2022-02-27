package arkanoid.hilos;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import arkanoid.ventanas.Bloque;
import arkanoid.ventanas.VentanaArkanoid;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
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
				if (getPosicionX() < 0 || (getPosicionX() + getDimension()) > getVentanaArkanoid().getWidth()) {
					setSentidoX(getSentidoX() * -1);
				}
//				Añadido fin de partida cuando la bola cae por debajo.
				if (getPosicionY() + getDimension() > getVentanaArkanoid().getHeight()) {
					System.out.println("game over");
					currentThread().interrupt();
				}
				if (getPosicionY() < 0)
					setSentidoY(getSentidoY() * -1);

				getVentanaArkanoid().getCuadrados().forEach(c -> {
					if (miraChoque(c)) {
						RoundRectangle2D.Double miRectangulo = new RoundRectangle2D.Double.Double(this.getPosicionX(),
								this.getPosicionY(), this.getDimension(), this.getDimension(), 10, 10);
						if (miRectangulo.intersects(c.getPosicionX() + this.getDimension(), (c.getPosicionY()),
								c.getPosicionX() + c.getAncho() + this.getDimension(), (c.getPosicionY()))
								|| miRectangulo.intersects(c.getPosicionX() + this.getDimension(),
										c.getPosicionY() + c.getAlto(),
										c.getPosicionX() + c.getAncho() + this.getDimension(),
										c.getPosicionY() + c.getAlto())) {
							this.setSentidoY(this.getSentidoY() * -1);
						}

						if (miRectangulo.intersects(c.getPosicionX() - this.getDimension(), (c.getPosicionY()),
								(c.getPosicionX()), c.getPosicionY() + c.getAlto() + this.getDimension())
								|| miRectangulo.intersects(c.getPosicionX() + c.getAncho(),
										c.getPosicionY() - this.getDimension(), c.getPosicionX() + c.getAncho(),
										c.getPosicionY() + c.getAlto() + this.getDimension())) {
							this.setSentidoX(this.getSentidoX() * -1);
						}
						c.setGolpes(c.getGolpes() - 1);
						switch (c.getGolpes()) {
						case 2:
							c.setColor(Color.YELLOW);
							break;
						case 1:
							c.setColor(Color.GRAY);
							break;
						}
						if (c.getGolpes() == 0)
							getVentanaArkanoid().getCuadrados().remove(c);
					}
				});
				this.setPosicionX(this.getPosicionX() + this.getIncrementoX() * this.getSentidoX());
				this.setPosicionY(this.getPosicionY() + this.getIncrementoY() * this.getSentidoY());
				Thread.sleep(getVentanaArkanoid().getVelocidad());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}

	}

	private synchronized boolean miraChoque(Bloque bloque) {
		Rectangle2D.Double miRectangulo = new Rectangle2D.Double(this.getPosicionX(), this.getPosicionY(),
				this.getDimension(), this.getDimension());
		return miRectangulo.intersects(bloque.getPosicionX(), bloque.getPosicionY(), bloque.getAncho(),
				bloque.getAlto());
	}

}
