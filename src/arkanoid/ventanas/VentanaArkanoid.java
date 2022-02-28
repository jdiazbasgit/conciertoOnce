package arkanoid.ventanas;

import java.awt.Frame;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.atomic.AtomicInteger;

import arkanoid.eventos.EventosMio;
import arkanoid.eventos.GestorEventosAdapter;
import arkanoid.hilos.Bola;
import arkanoid.hilos.Pintor;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import lombok.Data;
import java.awt.geom.Rectangle2D;
import java.awt.Toolkit;

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
	private Image imagenFondo;
	private Jugador jugador;

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
		this.addMouseMotionListener(new EventosMio(this));
	}

	@Override
	public void paint(Graphics g) {
		if (isPrimeraVez()) {
			setImagen(createImage(2000, 2000));
			setExterno(getImagen().getGraphics());
			TonteriasDeBloques tonterias= new TonteriasDeBloques(this);
			tonterias.cargaBloques();
			Pintor pintor = new Pintor(this);
			pintor.start();
			setPrimeraVez(false);
			setImagenFondo(Toolkit.getDefaultToolkit().getImage("paisaje.jpg"));
		}
		getExterno().clearRect(0,0,2000,2000);
		getExterno().drawImage(getImagenFondo(),0,0,this.getWidth(),this.getHeight(),this);
		for (Bloque bloque : cuadrados) {
			getExterno().setColor(bloque.getColor());
			getExterno().fillRect(bloque.getPosicionX(), bloque.getPosicionY(), bloque.getAncho(), bloque.getAlto());
			getExterno().setColor(Color.BLACK);
			getExterno().drawRect(bloque.getPosicionX(), bloque.getPosicionY(), bloque.getAncho(), bloque.getAlto());
			//getExterno().drawString(String.valueOf(bloque.getGolpes()),bloque.getPosicionX()+bloque.getAncho()/2, bloque.getPosicionY()+bloque.getAlto()/2);
		}
//		getExterno().fillRect(jugador.getPosicionX(), jugador.getPosicionY(), jugador.getAncho(), jugador.getAlto());
//		getExterno().setColor(Color.BLACK);
//		getExterno().drawRect(jugador.getPosicionX(), jugador.getPosicionY(), jugador.getAncho(), jugador.getAlto());
		
		if (getBola() != null)
			getExterno().fillOval(getBola().getPosicionX(), getBola().getPosicionY(), getBola().getDimension(),
					getBola().getDimension());
		g.drawImage(getImagen(),0,0,this);
		
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}

	

}
