package arkanoid.hilos;

import arkanoid.ventanas.VentanaArkanoid;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Pintor extends Thread {
	
	private VentanaArkanoid ventanaArkanoid;
	
	
	@Override
	public void run() {
		while(true) {
			getVentanaArkanoid().repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	

}
