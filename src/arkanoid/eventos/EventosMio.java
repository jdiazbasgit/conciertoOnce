package arkanoid.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

import arkanoid.hilos.Bola;
import arkanoid.ventanas.VentanaArkanoid;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventosMio extends GestorEventosAdapter {

	private VentanaArkanoid ventanaArkanoid;
	
	
	




	public EventosMio(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}



	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	

	public VentanaArkanoid getVentanaArkanoid() {
		return ventanaArkanoid;
	}



	public void setVentanaArkanoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		Bola bola= new Bola(e.getX(),getVentanaArkanoid().getHeight()-60,1,1,1,1,50,getVentanaArkanoid());
		getVentanaArkanoid().setBola(bola);
		bola.start();
				
	}

	
	
}
