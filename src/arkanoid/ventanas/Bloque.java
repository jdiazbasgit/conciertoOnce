package arkanoid.ventanas;

import java.awt.Color;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Data
@Setter
@Getter
@AllArgsConstructor
public class Bloque {

	public Bloque(int ancho, int alto, int posicionX, int posicionY, Color color) {
		// TODO Auto-generated constructor stub
	}
	private int ancho;
	private int alto;
	private int posicionX;
	private int posicionY;
	private int golpes;
	private Color color;
	
}
