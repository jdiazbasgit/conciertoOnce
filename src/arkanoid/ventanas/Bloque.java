package arkanoid.ventanas;

import java.awt.Color;
import java.awt.PointerInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Data
@Setter
@Getter
@AllArgsConstructor
public class Bloque {

	private int ancho;
	private int alto;
	private int posicionX;
	private int posicionY;
	private int golpes;
	private Color color;
	private PointerInfo pointerInfo;

	public Bloque(int ancho, int alto, int posicionX, int posicionY, Color color) {
		this.ancho = ancho;
		this.alto = alto;
		this.posicionX = pointerInfo.getLocation().x;
		this.posicionY = posicionY;
		this.color = color;
	}

}
