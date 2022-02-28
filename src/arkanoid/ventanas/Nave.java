package arkanoid.ventanas;

import java.awt.Image;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class Nave extends Thread  {

	private int ancho;
	private int alto;
	private VentanaArkanoid ventanaArkanoid;
	private int posicionX, posicionY, sentidoX, sentidoY, incrementoX, incrementoY;
	private Image image;
	
	public Nave(int ancho, int alto, VentanaArkanoid ventanaArkanoid, int posicionX, int posicionY, int sentidoX,
			int sentidoY, int incrementoX, int incrementoY, Image image) {
	super();
		this.ancho = ancho;
		this.alto = alto;
		this.ventanaArkanoid = ventanaArkanoid;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.sentidoX = sentidoX;
		this.sentidoY = sentidoY;
		this.incrementoX = incrementoX;
		this.incrementoY = incrementoY;
		this.image = image;
	}

	public int getDimension() {
		// TODO Auto-generated method stub
		return 0;
	}


	

	
	
























































































	


	

	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
