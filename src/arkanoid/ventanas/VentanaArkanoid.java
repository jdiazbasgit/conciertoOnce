package arkanoid.ventanas;

import java.awt.Frame;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;
import java.awt.Graphics;
import java.awt.Image;
import lombok.Data;

@Data
public class VentanaArkanoid extends Frame {

	private Set<Bloque> cuadrados;
	int ancho;
	int alto;
	int golpes;
	int numeroBloques;
	private Graphics externo;
	private Image imagen;
	private boolean primeraVez=true;
	
	VentanaArkanoid(){
		Properties properties= new Properties();
		try {
			properties.load(new InputStreamReader(new FileInputStream("arkanoid.properties")));
			setAlto(Integer.parseInt(properties.getProperty("alto")));
			setAncho(Integer.parseInt(properties.getProperty("ancho")));
			setNumeroBloques(Integer.parseInt(properties.getProperty("bloques")));
			setGolpes(Integer.parseInt(properties.getProperty("golpes")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void paint(Graphics g) {
		if(isPrimeraVez()) {
			setImagen(createImage(2000, 2000));
			setExterno(getImagen().getGraphics());
			setPrimeraVez(false);
		}
		
		
	}
	
	
	
	
}
