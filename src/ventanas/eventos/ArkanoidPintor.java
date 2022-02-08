package ventanas.eventos;

import arkanoid.ventanas.VentanaArkanoid;

public class ArkanoidPintor extends Thread {
	
	private VentanaArkanoid ventanaArkanoid;
	public ArkanoidPintor(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid=ventanaArkanoid;
	}
	
	@Override
	public void run() {
		while(true) {
			EventosArknoid.repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	public EventosArknoid getEventosarkanoid() {
		return getEventosarkanoid();
	}
	public void setVentanaArkanoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}

}