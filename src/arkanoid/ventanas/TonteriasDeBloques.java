package arkanoid.ventanas;

import java.awt.geom.Rectangle2D;
import java.util.HashSet;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.awt.Color;

@Data
@Setter
@Getter
public class TonteriasDeBloques {
	
	private VentanaArkanoid ventanaArkanoid;
	
	public TonteriasDeBloques(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid= ventanaArkanoid;
	}
	
	public void cargaBloques() {
		if (getVentanaArkanoid().getCuadrados() == null) {
			getVentanaArkanoid().setCuadrados(new HashSet<>());
			while (getVentanaArkanoid().getCuadrados().size() < getVentanaArkanoid().getNumeroBloques()) {

				int superior = 300;
				int inferior = getVentanaArkanoid().getHeight() - 300;
				int lateral = getVentanaArkanoid().getAncho() - 75;
				
				
				
				getVentanaArkanoid().getCuadrados().add(dameBloque(inferior, superior, lateral));
			}
		}

	}

	private Bloque dameBloque(int inferior, int superior, int lateral) {
		Bloque bloque = null;

		boolean fin = false;
		while (!fin) {
			int aleatorioX = (int) (Math.random() * 10000);
			
			if (aleatorioX > lateral && aleatorioX < getVentanaArkanoid().getWidth() - getVentanaArkanoid().getAncho()) {
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
						bloque = new Bloque(getVentanaArkanoid().getAncho(), getVentanaArkanoid().getAlto(), aleatorioX, aleatorioY, getVentanaArkanoid().getGolpes(),Color.YELLOW);
						
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
