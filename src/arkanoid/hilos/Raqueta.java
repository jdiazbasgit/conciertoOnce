package arkanoid.hilos;

import arkanoid.ventanas.VentanaArkanoid;
import lombok.Data;

@Data
public class Raqueta extends Thread {

	private int ancho;
	private int alto;
	private int posicionY;
	private int posicionX;
	private VentanaArkanoid ventanaArkanoid;
	public Raqueta(int ancho, int alto, int posicionY, int posicionX) {
		super();

		this.ancho = ancho;
		this.alto = alto;
		this.posicionY = posicionY;
		this.posicionX = posicionX;

	}

	@Override
	public void run() {
		try {
			if (getPosicionX() < 0 || (getPosicionX() + getAncho()) > getVentanaArkanoid().getWidth()) {
				
			}
			if (getPosicionY() < 0 || (getPosicionY() + getAncho()) > getVentanaArkanoid().getHeight()) {
				
			}

		} catch (Exception e) {

		}

	}

}
