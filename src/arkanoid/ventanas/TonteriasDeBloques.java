package arkanoid.ventanas;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.util.HashSet;

public class TonteriasDeBloques {

	private VentanaArkanoid ventanaArkanoid;

	public TonteriasDeBloques(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}

	public void cargaBloques() {
		if (getVentanaArkanoid().getCuadrados() == null) {
			getVentanaArkanoid().setCuadrados(new HashSet<>());
			while (getVentanaArkanoid().getCuadrados().size() < getVentanaArkanoid().getNumeroBloques()) {

				int superior = 100;
				int inferior = getVentanaArkanoid().getHeight() - 200;
				getVentanaArkanoid().getCuadrados().add(dameBloque(inferior, superior));
				getVentanaArkanoid().getCuadrados().add(dameJugador(superior, getVentanaArkanoid().getHeight()));
			}
		}

	}

	private Bloque dameJugador(int inferior, int superior) {
		Jugador jugador = null;

		return jugador;

	}

	private Bloque dameBloque(int inferior, int superior) {
		Bloque bloque = null;

		boolean fin = false;
		while (!fin) {
			int aleatorioX = (int) (Math.random() * 10000);
			if (aleatorioX > 0 && aleatorioX < getVentanaArkanoid().getWidth() - getVentanaArkanoid().getAncho()) {
				int aleatorioY = (int) (Math.random() * 10000);
				if (aleatorioY > superior && aleatorioY < inferior - getVentanaArkanoid().getAlto()) {
					fin = true;

					for (Bloque b : getVentanaArkanoid().getCuadrados()) {
						RoundRectangle2D.Double r1 = new RoundRectangle2D.Double(aleatorioX, aleatorioY,
								getVentanaArkanoid().getAncho(), getVentanaArkanoid().getAlto(), 0, 0);
						if (r1.intersects(b.getPosicionX(), b.getPosicionY(), b.getAncho(), b.getAlto())) {
							fin = false;
							break;
						}
					}
					if (fin) {
						bloque = new Bloque(getVentanaArkanoid().getAncho(), getVentanaArkanoid().getAlto(), aleatorioX,
								aleatorioY, Color.PINK);

					}

				}
			}
		}

		return bloque;
	}

	public VentanaArkanoid getVentanaArkanoid() {
		return ventanaArkanoid;
	}

	public void setVentanaArkanoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}
}
