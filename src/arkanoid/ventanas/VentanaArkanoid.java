package arkanoid.ventanas;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

import arkanoid.eventos.EventosMio;
import arkanoid.hilos.Bola;
import arkanoid.hilos.Pintor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
@Data
public class VentanaArkanoid extends Frame {

	private Set<Bloque> cuadrados;
	private int ancho;
	private int alto;
	private int golpes;
	private int numeroBloques;
	private Graphics externo;
	private Image imagen;
	private boolean primeraVez = true;
	private Bola bola;
	private int velocidad;
	private int dimensionBola;

	VentanaArkanoid() {
		Properties properties = new Properties();
		try {
			properties.load(new InputStreamReader(new FileInputStream("arkanoid.properties")));
			setAlto(Integer.parseInt(properties.getProperty("alto")));
			setAncho(Integer.parseInt(properties.getProperty("ancho")));
			setNumeroBloques(Integer.parseInt(properties.getProperty("bloques")));
			setGolpes(Integer.parseInt(properties.getProperty("golpes")));
			setVelocidad(Integer.parseInt(properties.getProperty("velocidad")));
			setDimensionBola(Integer.parseInt(properties.getProperty("dimensionBola")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.addWindowListener(new EventosMio(this));
		this.addMouseListener(new EventosMio(this));
	}

	@Override
	public void paint(Graphics g) {
		if (isPrimeraVez()) {
			setImagen(createImage(2500, 2500));
			setExterno(getImagen().getGraphics());
			TonteriasDeBloques tonterias = new TonteriasDeBloques(this);
			tonterias.cargaBloques();
			Pintor pintor = new Pintor(this);
			pintor.start();
			setPrimeraVez(false);
		}
		getExterno().clearRect(0, 0, 2000, 2000);
		

		for (Bloque bloque : cuadrados) {
			getExterno().setColor(bloque.getColor());
			getExterno().fillRect(bloque.getPosicionX(), bloque.getPosicionY(), bloque.getAncho(), bloque.getAlto());
			getExterno().setColor(Color.BLACK);
			getExterno().drawRect(bloque.getPosicionX(), bloque.getPosicionY(), bloque.getAncho(), bloque.getAlto());
			getExterno().drawString(String.valueOf(bloque.getGolpes()), bloque.getPosicionX() + bloque.getAncho() / 2,
					bloque.getPosicionY() + bloque.getAlto() / 2);

		}
		if (getBola() != null)

			getExterno().fillOval(getBola().getPosicionX(), getBola().getPosicionY(), getBola().getDimension(),
					getBola().getDimension());
		g.drawImage(getImagen(), 0, 0, this);

	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

}
