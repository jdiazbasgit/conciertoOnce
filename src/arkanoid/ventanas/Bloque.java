package arkanoid.ventanas;

import java.awt.Color;
import java.awt.Image;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


@AllArgsConstructor
public class Bloque {

	public Bloque(Image image) {
		
	}
	private int ancho;
	private int alto;
	private int posicionX;
	private int posicionY;
	private int golpes;
	private Color color;
	

}
