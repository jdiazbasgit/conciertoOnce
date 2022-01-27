package ventanaraton;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

@SuppressWarnings({ "serial" })
public class VentanaRaton extends Frame {

	private int x;
	private int y;
	private Color color;
	@SuppressWarnings("unused")
	private Font font;

	public VentanaRaton() {
		setSize(1000, 800);
		this.addMouseListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addMouseMotionListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		this.addWindowListener(new ElQueSabeLoQueHayQueHacerConElRaton(this));
		setColor(Color.BLACK);
		setFont(new Font("SAN_SERIF", Font.BOLD,20));
		
    
	}

	

	private void addWindowListener(ElQueSabeLoQueHayQueHacerConElRaton elQueSabeLoQueHayQueHacerConElRaton) {
		// TODO Auto-generated method stub

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void paint(Graphics g) {
		Image image = createImage(1000, 1000);
		Graphics externo = image.getGraphics();
		externo.clearRect(0, 0, 1000, 1000);
		externo.setColor(getColor());
		externo.setFont(getFont());
	    externo.drawString("(" + getX() + "," + getY() + ")", getX() - 10, getY() - 10);
		g.drawImage(image, 0, 0, this);

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



	public void setFont(String sansSerif, int bold, int i) {
		// TODO Auto-generated method stub
		
	}



	
	



}
