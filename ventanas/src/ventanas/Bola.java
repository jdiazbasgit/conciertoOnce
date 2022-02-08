package ventanas;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("unused")
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
public class Bola<getPosicionX> {
	private int posicionX, posicionY, sentidoX, sentidoY, incrementoX, incrementoY, dimension;

	public Bola(int posicionX, int posicionY, int sentidoX, int sentidoY, int incrementoX, int incrementoY,
			int dimension) {

		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.sentidoX = sentidoX;
		this.sentidoY = sentidoY;
		this.incrementoX = incrementoX;
		this.incrementoY = incrementoY;
		this.dimension = dimension;
	}

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

	

	private RectangularShape getVentanaBolas() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "unused", "rawtypes", "hiding" })
	private <getPosicionX> boolean miraChoque(Bola bola) {
		Rectangle2D.Double miRectangulo = new Rectangle2D.Double(this.getPosicionX(), this.getPosicionY(),
				this.getDimension(), this.getDimension());
		return miRectangulo.intersects((double) bola.getPosicionX(), (double) bola.getPosicionY(),
				(double) bola.getDimension(), (double) bola.getDimension());
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

	public void start() {

		
	}

}
