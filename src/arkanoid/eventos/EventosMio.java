package arkanoid.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

import arkanoid.hilos.Bola;
import arkanoid.ventanas.VentanaArkanoid;

public class EventosMio extends GestorEventosAdapter {

	private VentanaArkanoid ventanaArkanoid;

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("propiedad:" + getVentanaArkanoid());
		System.exit(0);
	}

	public EventosMio(VentanaArkanoid ventanaArkanoid) {
		System.out.println("constructor:" + ventanaArkanoid);
		this.ventanaArkanoid = ventanaArkanoid;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		Bola bola = new Bola(e.getX(), getVentanaArkanoid().getHeight() - 60, 1, 1, 1, 1,
				getVentanaArkanoid().getDimensionBola(), getVentanaArkanoid());
		getVentanaArkanoid().setBola(bola);
		bola.start();
//		Jugador jugador = new Jugador(, 0, 0, 0, null)

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	public VentanaArkanoid getVentanaArkanoid() {
		return ventanaArkanoid;
	}

	public void setVentanaArkanoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}

}
