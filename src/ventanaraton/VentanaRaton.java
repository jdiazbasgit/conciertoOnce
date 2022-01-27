package ventanaraton;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class VentanaRaton extends Frame {

	private int x;
	private int y;
	private Graphics externo;
	@SuppressWarnings("unused")
	private Font font;
	@SuppressWarnings("unused")
	private Color color;
	
	private boolean primeraVez = true;
	private Image imagen;

	public VentanaRaton() {
		setSize(1000, 800);
		this.addMouseListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addMouseMotionListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addWindowListener(new ElQuesabeLoQueHayQueHacerConLaVentana());
		setColor(Color.BLACK);
		setFont(new Font("HELVETICA",Font.ITALIC,10));
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void paint(Graphics g) {
		if (isPrimeraVez()) {
			setImagen(createImage(1000, 1000));
			setExterno(getImagen().getGraphics());
			setPrimeraVez(false);
			externo.setFont(getFont());
		}
		externo.clearRect(0, 0, 1000, 1000);
		//externo.setColor(getColor());
		externo.drawString("(" + getX() + " , " + getY() + ")", getX() - 10, getY() - 10);
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

}
