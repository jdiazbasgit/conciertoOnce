package arkanoid.ventanas;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bloque {

	private int ancho;
	private int alto;
	private int posicionX;
	private int posicionY;
	private int golpes;
}
