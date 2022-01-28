package ventanaraton;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Optional;

@SuppressWarnings("serial")
public class VentanaRaton extends Frame {

	private int x;
	private int y;
	private Optional<Graphics> externo=Optional.empty();
	private boolean primeraVez = true;
	private Image imagen;
	

	public VentanaRaton() {
		setSize(1000, 800);
		this.addMouseListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addMouseMotionListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addWindowListener(new ElQuesabeLoQueHayQueHacerConLaVentana());
		
	}

	@Override
	public void paint(Graphics g) {
		if (isPrimeraVez()) {
			setImagen(createImage(1000, 1000));
			setExterno(Optional.ofNullable(getImagen().getGraphics()));
			setPrimeraVez(false);
		}
		getExterno().get().clearRect(0, 0, 1000, 1000);
		getExterno().get().drawString("(" + getX() + " , " + getY() + ")", getX() - 10, getY() - 10);
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

	
	public Optional<Graphics> getExterno() {
		return externo;
	}

	public void setExterno(Optional<Graphics> externo) {
		this.externo = externo;
	}

}
