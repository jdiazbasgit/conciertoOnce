package ventanas.eventos;

import java.awt.event.MouseEvent;

import arkanoid.ventanas.VentanaArkanoid;


public class EventosArknoid extends ElQueSabeLoQueHayQueHacerConArkanoid {

	private VentanaArkanoid ventanaArkanoid;

	public EventosArknoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}

	public VentanaArkanoid getVentanaArkanoid() {
		return ventanaArkanoid;
	}

	public void setVentanaBolas(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Bloque bloque= new Bloque(e.getX(), e.getY(), dameSentido(), dameSentido(), dameIncremento(), dameIncremento(), 50,0, getVentanaArkanoid());
		getVentanaArkanoid().getBloque().add(bloque);
		bloque.start();
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

	public static void repaint() {
		// TODO Auto-generated method stub
		
	}

}