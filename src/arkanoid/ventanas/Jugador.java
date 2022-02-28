package arkanoid.ventanas;

import java.awt.Color;
import java.awt.PointerInfo;

import arkanoid.ventanas.Bloque;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data


public class Jugador extends Bloque {
	
	//private PointerInfo pointerInfo;
	
	public Jugador(int ancho, int alto, int posicionX, int posicionY, Color color) {
		super(ancho, alto, posicionX, posicionY, color);
		//getPointerInfo().getLocation().getX();
		//System.out.println(getPointerInfo().getLocation().getX());
		
		
	}

}
