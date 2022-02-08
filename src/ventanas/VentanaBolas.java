package ventanas;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashSet;
import java.util.Set;

import ventanas.eventos.ElQuesabeLoQueHayQueHacerConLaVentana;
import ventanas.eventos.EventosRaton;
import ventanas.hilos.Bola;
import ventanas.hilos.Pintor;

@SuppressWarnings("serial")
public class VentanaBolas extends Frame {

	private int fin;

	private Image imagen;
	private Graphics externo;

	private boolean primeraVez = true;

	private Set<Bola> bolas;

	public VentanaBolas() {
		this.setSize(1000, 1000);
		this.addWindowListener(new ElQuesabeLoQueHayQueHacerConLaVentana());
		this.addMouseListener(new EventosRaton(this));

	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public Graphics getExterno() {
		return externo;
	}

	public void setExterno(Graphics externo) {
		this.externo = externo;
	}

	@Override
	public void paint(Graphics g) {

		if (isPrimeraVez()) {
			setImagen(this.createImage(2000, 2000));
			setExterno(getImagen().getGraphics());
			setPrimeraVez(false);
			new Pintor(this).start();
			setBolas(new HashSet<>());
		}
		getExterno().clearRect(0, 0, 2000, 2000);
		Image ovni = Toolkit.getDefaultToolkit().getImage("ovni.png");
		try {
			getBolas().stream().forEach(
					// b -> getExterno().drawImage(ovni,b.getPosicionX(),
					// b.getPosicionY(),b.getDimension(),b.getDimension(),this));
					b -> {
						getExterno().drawImage(ovni,b.getPosicionX(), b.getPosicionY(), b.getDimension(), b.getDimension(),this);
//						getExterno().drawString(String.valueOf(b.getImpactos()),
//								b.getPosicionX() + b.getDimension() / 2, b.getPosicionY() + b.getDimension() / 2);
					});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		g.drawImage(getImagen(), 0, 0, 2000, 2000, this);

	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public boolean isPrimeraVez() {
		return primeraVez;
	}

	public void setPrimeraVez(boolean primeraVez) {
		this.primeraVez = primeraVez;
	}

	public Set<Bola> getBolas() {
		return bolas;
	}

	public void setBolas(Set<Bola> bolas) {
		this.bolas = bolas;
	}

}
