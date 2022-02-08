package ventanaraton;

import java.awt.event.MouseEvent;

import ventanas.Bola;
import ventanas.VentanaBolas;

public class EventosRaton extends ElQueSabeLoQueHayQueHacerConElRaton {

	private VentanaBolas ventanaBolas;

	public EventosRaton(VentanaBolas ventanaBolas) {
		this.ventanaBolas = ventanaBolas;
	}

	public EventosRaton() {
		// TODO Auto-generated constructor stub
	}

	public VentanaBolas getVentanaBolas() {
		return ventanaBolas;
	}

	public void setVentanaBolas(VentanaBolas ventanaBolas) {
		this.ventanaBolas = ventanaBolas;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Bola bola = new Bola(e.getX(), e.getY(), dameSentido(), dameSentido(), dameIncremento(), dameIncremento(), 50,
				getVentanaBolas());
		getVentanaBolas().getBolas().add(bola);
		bola.start();
	}

	public int dameIncremento() {// 1 o2
		int aleatorio = (int) (Math.random() * 1000);
		int salida = 1;
		if (aleatorio % 2 == 0)
			salida = 2;
		return salida;
	}

	public int dameSentido() {// +1 o -1
		int aleatorio = (int) (Math.random() * 1000);
		int salida = 1;
		if (aleatorio % 2 == 0)
			salida = -1;
		return salida;
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

}
