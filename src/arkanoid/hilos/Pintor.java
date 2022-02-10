package arkanoid.hilos;

import arkanoid.ventanas.VentanaArkanoid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Pintor extends Thread {

	private VentanaArkanoid ventanaArkanoid;

	@Override
	public void run() {
		while (true) {
			getVentanaArkanoid().repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
