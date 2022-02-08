package ventanas.eventos;

import java.awt.event.MouseAdapter;

import ventanas.VentanaBolas;

public class ElQueSabeLoQueHayQueHacerConElRaton extends MouseAdapter {

	private VentanaBolas ventanaBolas;

	public ElQueSabeLoQueHayQueHacerConElRaton() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElQueSabeLoQueHayQueHacerConElRaton(VentanaBolas ventanaBolas) {
		this.setVentanaBolas(ventanaBolas);
	}

	public VentanaBolas getVentanaBolas() {
		return ventanaBolas;
	}

	public void setVentanaBolas(VentanaBolas ventanaBolas) {
		this.ventanaBolas = ventanaBolas;
	}

}
