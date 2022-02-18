package arkanoid.hilos;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

import arkanoid.ventanas.Bloque;
import arkanoid.ventanas.VentanaArkanoid;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
public class Bola extends Thread {

<<<<<<< HEAD
	private int posicionX;
	private int posicionY;
	private int sentidoX;
	private int sentidoY;
	private int incrementoX;
	private int incrementoY;
	private int dimension;
=======
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
>>>>>>> branch 'arkanoid/JuanVega' of https://github.com/jdiazbasgit/conciertoOnce.git
	private VentanaArkanoid ventanaArkanoid;

	@Override
	public void run() {

		while (getVentanaArkanoid().getCuadrados().size() > 0) {

			try {
				if (getPosicionX() < 0 || (getPosicionX() + getDimension()) > getVentanaArkanoid().getWidth()) {
					setSentidoX(getSentidoX() * -1);
				}
				if (getPosicionY() < 0 || (getPosicionY() + getDimension()) > getVentanaArkanoid().getHeight()) {
					setSentidoY(getSentidoY() * -1);
				}
				getVentanaArkanoid().getCuadrados().forEach(c -> {
					if (miraChoque(c)) {
<<<<<<< HEAD
						getVentanaArkanoid().getCuadrados().remove(c);
						this.setSentidoX(getSentidoX() * -1);
						this.setSentidoY(getSentidoY() * -1);

=======
						Rectangle2D.Double miRectangulo = new Rectangle2D.Double(this.getPosicionX(),
								this.getPosicionY(), this.getDimension(), this.getDimension());
						if (miRectangulo.intersectsLine((int) (c.getPosicionX()), (int) (c.getPosicionY()),
								(int) (c.getPosicionX() + c.getAncho()), (int) (c.getPosicionY()))
								|| miRectangulo.intersectsLine((int) (c.getPosicionX()),
										(int) (c.getPosicionY() + c.getAlto()), (int) (c.getPosicionX() + c.getAncho()),
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
>>>>>>> branch 'arkanoid/JuanVega' of https://github.com/jdiazbasgit/conciertoOnce.git
					}
				});
				this.setPosicionX(this.getPosicionX() + this.getIncrementoX() * this.getSentidoX());
<<<<<<< HEAD
				;
				this.setPosicionY(this.getPosicionY() + this.getIncrementoY() * this.getSentidoY());
				;
				Thread.sleep(1);
=======
				this.setPosicionY(this.getPosicionY() + this.getIncrementoY() * this.getSentidoY());
				Thread.sleep(getVentanaArkanoid().getVelocidad());
>>>>>>> branch 'arkanoid/JuanVega' of https://github.com/jdiazbasgit/conciertoOnce.git
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
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
