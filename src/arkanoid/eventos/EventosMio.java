package arkanoid.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

import arkanoid.hilos.Bola;
import arkanoid.ventanas.VentanaArkanoid;
<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
=======
>>>>>>> branch 'arkanoid/JuanVega' of https://github.com/jdiazbasgit/conciertoOnce.git

<<<<<<< HEAD
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
=======
>>>>>>> branch 'arkanoid/JuanVega' of https://github.com/jdiazbasgit/conciertoOnce.git
public class EventosMio extends GestorEventosAdapter {

	private VentanaArkanoid ventanaArkanoid;

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("propiedad:" + getVentanaArkanoid());
		System.exit(0);
	}

	public EventosMio(VentanaArkanoid ventanaArkanoid) {
		System.out.println("constructor:" + ventanaArkanoid);
		this.ventanaArkanoid = ventanaArkanoid;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
<<<<<<< HEAD
		Bola bola = new Bola(e.getX(), getVentanaArkanoid().getHeight() - 60, 1, 1, 1, 1, 50, getVentanaArkanoid());
=======

		// fdsgfdgdf

		Bola bola = new Bola(e.getX(), getVentanaArkanoid().getHeight() - 60, 1, 1, 1, 1,
				getVentanaArkanoid().getDimensionBola(), getVentanaArkanoid());
>>>>>>> branch 'arkanoid/JuanVega' of https://github.com/jdiazbasgit/conciertoOnce.git
		getVentanaArkanoid().setBola(bola);
		bola.start();

	}

<<<<<<< HEAD
=======
	public VentanaArkanoid getVentanaArkanoid() {
		return ventanaArkanoid;
	}

	public void setVentanaArkanoid(VentanaArkanoid ventanaArkanoid) {
		this.ventanaArkanoid = ventanaArkanoid;
	}

>>>>>>> branch 'arkanoid/JuanVega' of https://github.com/jdiazbasgit/conciertoOnce.git
}
