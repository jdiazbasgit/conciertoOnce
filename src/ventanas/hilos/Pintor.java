package ventanas.hilos;

import ventanas.VentanaBolas;

public class Pintor extends Thread {
	
	private VentanaBolas ventanaBolas;
	public Pintor(VentanaBolas ventanaBolas) {
		this.ventanaBolas=ventanaBolas;
	}
	
	@Override
	public void run() {
		while(true) {
			ventanaBolas.repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	public VentanaBolas getVentanaBolas() {
		return ventanaBolas;
	}
	public void setVentanaBolas(VentanaBolas ventanaBolas) {
		this.ventanaBolas = ventanaBolas;
	}

}
