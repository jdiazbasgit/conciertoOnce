package ventanaraton;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

@SuppressWarnings("serial")
public class VentanaRaton extends Frame {
	
	private int x;
	private int y;
	private Color color;
	
	public VentanaRaton () {
		setSize (1000,800);
		this.addMouseListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addMouseMotionListener (new ElQueSabeLoQueHayQueHacerConElRaton(this));
		setColor(Color.BLACK);
	}
	

	@Override
	public void paint(Graphics g) {
		Image imagen= createImage(1000,1000);
		Graphics externo=imagen.getGraphics();
		externo.setColor(getColor());
		externo.clearRect(0,0,1000,1000);
		externo.drawString("(" + getX() +"," + getY() + ")",getX()-10, getY()-10);
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


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}

	
}
