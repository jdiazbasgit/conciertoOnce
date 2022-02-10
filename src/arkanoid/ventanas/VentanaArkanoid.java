package arkanoid.ventanas;

import java.awt.Frame;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import arkanoid.eventos.EventosMio;
import arkanoid.hilos.Bola;
import arkanoid.hilos.Pintor;
import java.awt.Graphics;
import java.awt.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

@Data
@AllArgsConstructor
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

	

	VentanaArkanoid() {
		Properties properties = new Properties();
		try {
			properties.load(new InputStreamReader(new FileInputStream("arkanoid.properties")));
			setAlto(Integer.parseInt(properties.getProperty("alto")));
			setAncho(Integer.parseInt(properties.getProperty("ancho")));
			setNumeroBloques(Integer.parseInt(properties.getProperty("bloques")));
			setGolpes(Integer.parseInt(properties.getProperty("golpes")));
			setVelocidad(Integer.parseInt(properties.getProperty("velocidad")));
			System.out.println(getAlto());
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
			setImagen(createImage(2000, 2000));
			setExterno(getImagen().getGraphics());
			cargaBloques();
			Pintor pintor = new Pintor(this);
			pintor.start();
			setPrimeraVez(false);
		}
		getExterno().clearRect(0,0,2000,2000);
		for (Bloque bloque : cuadrados) {
			this.getExterno().setColor(bloque.getColor());
			//getExterno().drawRect(bloque.getPosicionX(), bloque.getPosicionY(), bloque.getAncho(), bloque.getAlto());
			getExterno().fillRect(bloque.getPosicionX(), bloque.getPosicionY(), bloque.getAncho(), bloque.getAlto());
		    this.getExterno().setColor(Color.BLACK);
		    this.getExterno().drawString("carlos",bloque.getPosicionX()+(bloque.getAncho()/2),bloque.getPosicionY()+(bloque.getAlto()/2));
			getExterno().drawRect(bloque.getPosicionX(), bloque.getPosicionY(), bloque.getAncho(), bloque.getAlto());
		    this.getExterno().setColor(Color.BLUE);
			
			
			
			
		}
		if (getBola() != null)
			getExterno().fillOval(getBola().getPosicionX(), getBola().getPosicionY(), getBola().getDimension(),
					getBola().getDimension());
		g.drawImage(getImagen(),0,0,this);
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	

	public Set<Bloque> getCuadrados() {
		return cuadrados;
	}

	public void setCuadrados(Set<Bloque> cuadrados) {
		this.cuadrados = cuadrados;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getGolpes() {
		return golpes;
	}

	public void setGolpes(int golpes) {
		this.golpes = golpes;
	}

	public int getNumeroBloques() {
		return numeroBloques;
	}

	public void setNumeroBloques(int numeroBloques) {
		this.numeroBloques = numeroBloques;
	}

	public Graphics getExterno() {
		return externo;
	}

	public void setExterno(Graphics externo) {
		this.externo = externo;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public boolean isPrimeraVez() {
		return primeraVez;
	}

	public void setPrimeraVez(boolean primeraVez) {
		this.primeraVez = primeraVez;
	}

	public Bola getBola() {
		return bola;
	}

	public void setBola(Bola bola) {
		this.bola = bola;
	}

	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void cargaBloques() {
		if (getCuadrados() == null) {
			setCuadrados(new HashSet<>());
			while (getCuadrados().size() < getNumeroBloques()) {
				int superior = 100;
				int inferior = this.getHeight() - 200;
				getCuadrados().add(dameBloque(inferior, superior));
			}
		}

	}

	private Bloque dameBloque(int inferior, int superior) {
		Bloque bloque = null;

		boolean fin = false;
		while (!fin) {
			int aleatorioX = (int) (Math.random() * 10000);
			if (aleatorioX > 0 && aleatorioX < this.getWidth() - getAncho()) {
				int aleatorioY = (int) (Math.random() * 10000);
				if (aleatorioY > superior && aleatorioY < inferior - getAlto()) {
					fin = true;

					for (Bloque b : cuadrados) {
						Rectangle2D.Double r1 = new Rectangle2D.Double(aleatorioX, aleatorioY, getAncho(), getAlto());
						if (r1.intersects(b.getPosicionX(), b.getPosicionY(), b.getAncho(), b.getAlto())) {
							fin = false;
							break;
						}
					}
					if (fin) {
						bloque = new Bloque(getAncho(), getAlto(), aleatorioX, aleatorioY,getGolpes(),Color.PINK);

					}

				}
			}
		}

		return bloque;
	}

}
