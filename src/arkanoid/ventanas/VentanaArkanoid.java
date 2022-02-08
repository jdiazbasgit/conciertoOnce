package arkanoid.ventanas;

import java.awt.Frame;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import ventanas.eventos.ElQueSabeLoQueHayQueHacerConArkanoid;
import ventanas.eventos.ElQueSabeLoQueHayQueHacerConElEvento ;
import lombok.Data;

@SuppressWarnings({ "serial", "unused" })
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

	@SuppressWarnings("unused")
	@Override
	public void paint(Graphics g) {
		if(isPrimeraVez()) {
			setImagen(createImage(2000, 2000));
			setExterno(getImagen().getGraphics());
			setPrimeraVez(false);
		}
		
		
	
	
	getExterno().clearRect(0,0,2000,2000);
	Image ovni=Toolkit.getDefaultToolkit().getImage("ovni.png");
	try {
		getBloque().stream().forEach(
				
				b ->{
					getExterno().drawOval(b.getPosicionX(), b.getPosicionY(),b.getAncho(),b.getAlto());
					getExterno().drawString(String.valueOf(b.getGolpes()),b.getPosicionX()+b.getPosicionY()/2,b.getAlto()+b.getAncho()/2);
				});
	} catch (Exception e) {
		
		//e.printStackTrace();
	}
	g.drawImage(getImagen(), 0, 0, 2000, 2000, this);
	
	
	
}

	public Collection<Bloque> getBloque() {
		// TODO Auto-generated method stub
		return null;
	}

	}
