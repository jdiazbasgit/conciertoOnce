package arkanoid.ventanas;

import java.awt.geom.Rectangle2D;
import java.util.HashSet;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
public class TonteriasDeBloques {
	
	private VentanaArkanoid ventanaArkanoid;
	
	public TonteriasDeBloques(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid= ventanaArkanoid;
	}
	
	@SuppressWarnings("unused")
	public void cargaBloques() {
		if (getVentanaArkanoid().getCuadrados() == null) {
			getVentanaArkanoid().setCuadrados(new HashSet<>());
			while (getVentanaArkanoid().getCuadrados().size() < getVentanaArkanoid().getNumeroBloques()) {
                 int anchoIzq= -190;
                 int anchoDer=-190;
				int superior = 80;
				int inferior = getVentanaArkanoid().getHeight() - 100;
				getVentanaArkanoid().getCuadrados().add(dameBloque(inferior, superior,anchoIzq,anchoDer));
			}
		}

	}

	private Bloque dameBloque(int inferior, int superior,int anchoIzq, int anchoDer) {
		Bloque bloque = null;

		boolean fin = false;
		while (!fin) {
			int aleatorioX = (int) (Math.random() * 10000);
			if (aleatorioX > 0 && aleatorioX < getVentanaArkanoid().getWidth() - getVentanaArkanoid().getAncho()) {
				int aleatorioY = (int) (Math.random() * 10000);
				if (aleatorioY > superior && aleatorioY < inferior - getVentanaArkanoid().getAlto()) {
					
					fin = true;

					for (Bloque b : getVentanaArkanoid().getCuadrados()) {
						Rectangle2D.Double r1 = new Rectangle2D.Double(aleatorioX, aleatorioY, getVentanaArkanoid().getAncho(), getVentanaArkanoid().getAlto());
						if (r1.intersects(b.getPosicionX(), b.getPosicionY(), b.getAncho(), b.getAlto())) {
							fin = false;
							break;
						}
					}
					if (fin) {
						
						bloque = new Bloque(getVentanaArkanoid().getAncho(), getVentanaArkanoid().getAlto(), aleatorioX, aleatorioY, getVentanaArkanoid().getGolpes(),Color.red);
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
