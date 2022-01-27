package ventanaraton;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Optional;
import java.awt.Font;

public class ElQueSabeLoQueHayQueHacerConElRaton implements MouseListener, MouseMotionListener {

	private VentanaRaton ventanaRaton;

	public ElQueSabeLoQueHayQueHacerConElRaton(VentanaRaton ventanaRaton) {
		this.ventanaRaton = ventanaRaton;
	}

	private void notificaraVentanaRaton(MouseEvent e) {
		getVentanaRaton().setX(e.getX());
		getVentanaRaton().setY(e.getY());
		getVentanaRaton().repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		if (getVentanaRaton().getExterno() != null) {
			getVentanaRaton().getExterno().setColor(Color.RED);
			getVentanaRaton().setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
		}
		notificaraVentanaRaton(e);

	}

	@Override
	public void mouseMoved(MouseEvent e) {

		if (getVentanaRaton().getExterno() != null) {
			getVentanaRaton().getExterno().setColor(Color.BLACK);
			getVentanaRaton().setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		}
		notificaraVentanaRaton(e);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public VentanaRaton getVentanaRaton() {
		return ventanaRaton;
	}

	public void setVentanaRaton(VentanaRaton ventanaRaton) {
		this.ventanaRaton = ventanaRaton;
	}

	/*public Optional<ventanaRaton> externo(String nombre){
		if (getVentanaRaton().getExterno().isPresent()-> System.out.println()) {
			
		}
	}*/

}
