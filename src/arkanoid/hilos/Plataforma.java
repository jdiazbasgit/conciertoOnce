package arkanoid.hilos;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.RoundRectangle2D.Double;

import javax.swing.event.MouseInputAdapter;

import arkanoid.ventanas.VentanaArkanoid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import arkanoid.ventanas.Bloque;
import arkanoid.ventanas.TonteriasDeBloques;

//RoundRectangle2D
@Data
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)

public class Plataforma extends TonteriasDeBloques implements Runnable {

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

//	@Override
//	public void mouseMoved(MouseEvent e) {
//		// TODO Auto-generated method stub
//		super.mouseMoved(e);
//	}

	public Plataforma(VentanaArkanoid ventanaArkanoid) {
		super(ventanaArkanoid);
		
	}

	@Override
	public void cargaBloques() {
		
//		int superior  = getVentanaArkanoid().getHeight() - 200;
//		int inferior = getVentanaArkanoid().getHeight();
		//getVentanaArkanoid().getCuadrados().add(dameBloque(inferior, superior));
		Bloque plataforma = new Bloque(getAncho(), getAlto(), getPosicionX(), getAltoVentana() - getAlto() - 2, Color.YELLOW);
		RoundRectangle2D.Double r2 =  new RoundRectangle2D.Double(getPosicionX(), alto,
				getAltoVentana() - getAlto() - 2, getAncho(), 10, 10);
		getVentanaArkanoid().getCuadrados().add(dameBloque(getAltoVentana(), getAltoVentana()-200));
		
		
	}

}
