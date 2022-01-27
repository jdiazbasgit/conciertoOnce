package ventanaraton;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Font;

@SuppressWarnings("serial")
public class VentanaRaton extends Frame {

	private int x;
	private int y;
	private Graphics externo;

	private boolean primeraVez = true;
	private Image imagen;

	public VentanaRaton() {
		setSize(1000, 800);
		this.addMouseListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addMouseMotionListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addWindowListener(new ElQuesabeLoQueHayQueHacerConLaVentana());
		Font fuente = new Font("Agency FB", Font.BOLD, 40);
		setFont(fuente);

	}

	@Override
	public void paint(Graphics g) {
		if (isPrimeraVez()) {
			setImagen(createImage(1000, 1000));
			setExterno(getImagen().getGraphics());
			setPrimeraVez(false);
		}

		getExterno().clearRect(0, 0, 1000, 1000);
		// externo.setColor(getColor());
		getExterno().setFont(getFont());
		getExterno().drawString("(" + getX() + " , " + getY() + ")", getX() - 10, getY() - 10);
		g.drawImage(getImagen(), 0, 0, this);

	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Graphics getExterno() {
		return externo;
	}

	public void setExterno(Graphics externo) {
		this.externo = externo;
	}

	public boolean isPrimeraVez() {
		return primeraVez;
	}

	public void setPrimeraVez(boolean primeraVez) {
		this.primeraVez = primeraVez;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the fuente
	 */

}
