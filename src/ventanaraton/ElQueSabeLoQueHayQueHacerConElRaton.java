package ventanaraton;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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
		if (getVentanaRaton().getExterno() != null)
			getVentanaRaton().getExterno().setColor(Color.RED);
			notificaraVentanaRaton(e);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if (getVentanaRaton().getExterno() != null)
			getVentanaRaton().getExterno().setColor(Color.BLACK);
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

}
