package arkanoid.hilos;

import arkanoid.ventanas.VentanaArkanoid;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Pintor extends Thread {
	
	private VentanaArkanoid ventanaArkanoid;
	
	
	
	public Pintor(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}



	public VentanaArkanoid getVentanaArkanoid() {
		return ventanaArkanoid;
	}


	public void setVentanaArkanoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}


	@Override
	public void run() {
		while(true) {
			getVentanaArkanoid().repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	

}
