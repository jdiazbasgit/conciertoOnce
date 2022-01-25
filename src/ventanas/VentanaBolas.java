package ventanas;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

public class VentanaBolas extends Frame {
	
	public VentanaBolas() {
		this.setSize(1500,1000);
		
	}

	@Override
	public void paint(Graphics g) {
		
		Image imagen=this.createImage(1000,1000);
		Graphics externo=imagen.getGraphics();
		
		while(true) {
			externo.clearRect(0,0,1000,1000);
			if(posicion<0 || posicion>950)
				sentido=sentido*-1;
			
			posicion=posicion+(incremento*sentido);
			externo.fillOval(posicion,500,50,50);
			g.drawImage(imagen,0,0,1000,1000, this);
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	
	
	

}
