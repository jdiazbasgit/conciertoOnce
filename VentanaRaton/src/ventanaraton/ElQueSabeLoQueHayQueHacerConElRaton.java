package ventanaraton;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ElQueSabeLoQueHayQueHacerConElRaton extends MouseAdapter  {
	
	
	private VentanaRaton ventanaRaton;

	public ElQueSabeLoQueHayQueHacerConElRaton(VentanaRaton ventanaRaton) {
		this.ventanaRaton=ventanaRaton;
		

	}
	
	
	private void notificaraVentanaRaton(MouseEvent e) {
		getVentanaRaton().setX(e.getX());
		getVentanaRaton().setY(e.getY());
		getVentanaRaton().repaint();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		getVentanaRaton().setColor(Color.RED);
		getVentanaRaton().setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
		notificaraVentanaRaton(e);
	    
	    }

		
	@Override
	public void mouseMoved(MouseEvent e) {
		getVentanaRaton().setColor(Color.BLACK);
		getVentanaRaton().setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		notificaraVentanaRaton(e);
		
	    }

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e);

	}

	public VentanaRaton getVentanaRaton() {
		return ventanaRaton;
	}

	public void setVentanaRaton(VentanaRaton ventanaRaton) {
		this.ventanaRaton = ventanaRaton;
	}

}
