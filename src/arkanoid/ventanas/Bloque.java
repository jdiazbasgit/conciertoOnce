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

	private int ancho;
	private int alto;
	private int posicionX;
	private int posicionY;
	private int golpes;
	private Color color;
	
}
