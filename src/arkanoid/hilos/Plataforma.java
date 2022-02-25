package arkanoid.hilos;

import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.event.MouseInputAdapter;

import arkanoid.ventanas.VentanaArkanoid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

//RoundRectangle2D
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)

public class Plataforma extends MouseInputAdapter implements Runnable {

	private int posicionX;
	private int ancho;
	private int alto;
	private VentanaArkanoid ventanaArkanoid;
	private int altoVentana;

	@Override
	public void run() {
		VentanaArkanoid ventanaArkanoid = new VentanaArkanoid();
		RoundRectangle2D.Double plataforma = new RoundRectangle2D.Double(getPosicionX(), alto,
				getAltoVentana() - getAlto() - 2, getAncho(), 10, 10);
//		Pendiente de añadir el radio de los arcos de la plataforma. Hemos puesto 10 por rellenarlo, pero no sabemos cómo va.
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseMoved(e);
	}

}
