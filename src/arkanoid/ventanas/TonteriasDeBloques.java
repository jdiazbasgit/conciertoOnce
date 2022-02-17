package arkanoid.ventanas;

import java.awt.geom.Rectangle2D;
import java.util.HashSet;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
public class TonteriasDeBloques {
	
	private VentanaArkanoid ventanaArkanoid;
	@SuppressWarnings("unused")
	private Image ImagenBloque;
	
	public TonteriasDeBloques(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid= ventanaArkanoid;
	}
	
	public void cargaBloques() {
		if (getVentanaArkanoid().getCuadrados() == null) {
			getVentanaArkanoid().setCuadrados(new HashSet<>());
			while (getVentanaArkanoid().getCuadrados().size() < getVentanaArkanoid().getNumeroBloques()) {

				int superior = 100;
				int inferior = getVentanaArkanoid().getHeight() - 200;
				getVentanaArkanoid().getCuadrados().add(dameBloque(inferior, superior));
			}
		}

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

	

	private void setImagenBloque(Image image) {
		// TODO Auto-generated method stub
		
	}

	private void drawImage(Object imagenBloque2, int i, int j, TonteriasDeBloques tonteriasDeBloques) {
		// TODO Auto-generated method stub
		
	}

	private Object getImagenBloque() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getExterno() {
		// TODO Auto-generated method stub
		return null;
	}

	public VentanaArkanoid getVentanaArkanoid() {
		return ventanaArkanoid;
	}

	public void setVentanaArkanoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}
}
