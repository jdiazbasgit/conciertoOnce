package arkanoid.eventos;

import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;

import arkanoid.hilos.Bola;
import arkanoid.ventanas.VentanaArkanoid;
import lombok.Data;

@Data
public class EventosMio extends GestorEventosAdapter implements MouseMotionListener {

	//private PointerInfo pointerInfo;
	private PointerInfo pointerInfo;
	private VentanaArkanoid ventanaArkanoid;
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("propiedad:"+getVentanaArkanoid());
		System.exit(0);
	}

	public EventosMio(VentanaArkanoid ventanaArkanoid) {
		System.out.println("constructor:"+ventanaArkanoid);
		this.ventanaArkanoid = ventanaArkanoid;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		

		//fdsgfdgdf
		
		
		Bola bola=new Bola(e.getX(),getVentanaArkanoid().getHeight()-60,1,1,1,1,getVentanaArkanoid().getDimensionBola(),getVentanaArkanoid());
		getVentanaArkanoid().setBola(bola);
		bola.start();
		//this.pointerInfo = getPointerInfo().getLocation().x;
		System.out.println(getPointerInfo().getLocation().x);
				
	}

	public VentanaArkanoid getVentanaArkanoid() {
		return ventanaArkanoid;
	}

	public void setVentanaArkanoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.pointerInfo = getPointerInfo();
		System.out.println(pointerInfo);
		
		
	}

	
	
}
