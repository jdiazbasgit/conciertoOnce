package arkanoid.ventanas;

import java.awt.Color;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

public class Jugador extends Bloque {
	private int posicionX = getPointerInfo().getLocation().x;

	public Jugador(int ancho, int alto, int posicionX, int posicionY, Color color) {
		super(ancho, alto, posicionX, posicionY, color);
		this.posicionX = posicionX;
	}

//	public Jugador(int ancho, int alto, int posicionX, int posicionY, Color color, PointerInfo pointerInfo) {
//		super(ancho, alto, posicionX, posicionY, color, pointerInfo);
//		// TODO Auto-generated constructor stub
//	}

}
