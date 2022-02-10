package arkanoid.ventanas;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.awt.Color;

@Data
@AllArgsConstructor
public class Bloque {

	private int ancho;
	private int alto;
	private int posicionX;
	private int posicionY;
	private int golpes;
	private Color color;
	
	
	public Bloque(int ancho, int alto, int posicionX, int posicionY, int golpes,Color color ) {
		this.ancho = ancho;
		this.alto = alto;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.golpes = golpes;
		this.color=color;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public int getGolpes() {
		return golpes;
	}
	public void setGolpes(int golpes) {
		this.golpes = golpes;
	}
	
	
}
