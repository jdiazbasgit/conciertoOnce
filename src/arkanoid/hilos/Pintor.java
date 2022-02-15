package arkanoid.hilos;

import arkanoid.ventanas.VentanaArkanoid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
public class Pintor extends Thread {
	
	private VentanaArkanoid ventanaArkanoid;
	
	
	@Override
	public void run() {
		while(true) {
			getVentanaArkanoid().repaint();
			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	

}
