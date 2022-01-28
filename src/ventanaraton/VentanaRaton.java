package ventanaraton;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

@SuppressWarnings("serial")
public class VentanaRaton extends Frame {

	private int x;
	private int y;
	private Graphics externo;
	/*private Color color;
	private Font font;*/

	public VentanaRaton() {
		setSize(1000, 800);
		this.addMouseListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addMouseMotionListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addWindowListener(new ElQueSabeLoQueHayQueHacerConLaVentana());
		/*setColor(Color.BLACK);
		setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));*/

	}

	@Override
	public void paint(Graphics g) {
		
		Image imagen = createImage(1000, 1000);
		setExterno(imagen.getGraphics()); 
		/*externo.setFont(getFont());
		externo.setColor(getColor());*/
		externo.clearRect(0, 0, 1000, 1000);
		externo.drawString("(" + getX() + "," + getY() + ")", getX() - 10, getY() - 10);
		g.drawImage(imagen, 0, 0, this);

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

	/*public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}*/

}
