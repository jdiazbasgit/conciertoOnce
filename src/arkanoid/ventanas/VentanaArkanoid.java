package arkanoid.ventanas;

import java.awt.Frame;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;
import arkanoid.eventos.EventosMio;
import arkanoid.hilos.Bola;
import arkanoid.hilos.Pintor;
import arkanoid.hilos.Raqueta;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import lombok.Data;

@SuppressWarnings("serial")
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

			e.printStackTrace();
		}
		this.addWindowListener(new EventosMio(this));
		this.addMouseListener(new EventosMio(this));
	}

	@SuppressWarnings("unused")
	@Override
	public void paint(Graphics g) {
		if (isPrimeraVez()) {
			
			setImagen(createImage(2000, 2000));
			setExterno(getImagen().getGraphics());
			TonteriasDeBloques tonterias = new TonteriasDeBloques(this);
			Raqueta raqueta = new Raqueta(ancho, alto, ancho, alto);
			tonterias.cargaBloques();
			Pintor pintor = new Pintor(this);
			pintor.start();
			setPrimeraVez(false);
			
		}
		getExterno().clearRect(0, 0, 2000, 2000);
		for (Bloque bloque : cuadrados) {
			getExterno().setColor(bloque.getColor());
			getExterno().fillRect(bloque.getPosicionX(), bloque.getPosicionY(), bloque.getAncho(), bloque.getAlto());
			getExterno().setColor(Color.GREEN);
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
