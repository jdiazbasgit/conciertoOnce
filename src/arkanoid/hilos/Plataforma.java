package arkanoid.hilos;

import java.awt.geom.RoundRectangle2D;

import arkanoid.eventos.EventosMio;
import arkanoid.ventanas.VentanaArkanoid;
import lombok.Data;
import lombok.EqualsAndHashCode;

//RoundRectangle2D
@Data
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)

public class Plataforma extends EventosMio {

	private int posicionX;
	private int ancho;
	private int alto;
	private VentanaArkanoid ventanaArkanoid;
	private int altoVentana;

	@Override
	public void run() {
		new VentanaArkanoid();
		new RoundRectangle2D.Double(getPosicionX(), alto, getAltoVentana() - getAlto() - 2, getAncho(), 10, 10);
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
//		 getVentanaArkanoid().getCuadrados().add(dameBloque(inferior, superior));
//		Bloque plataforma = new Bloque(getAncho(), getAlto(), getPosicionX(), getAltoVentana() - getAlto() - 2,
//				Color.YELLOW);
//		RoundRectangle2D.Double r2 = new RoundRectangle2D.Double(getPosicionX(), alto, getAltoVentana() - getAlto() - 2,
//				getAncho(), 10, 10);
//		getVentanaArkanoid().getCuadrados().add(dameBloque(getAltoVentana(), getAltoVentana() - 200));

	}

}
