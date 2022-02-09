package arkanoid.hilos;

import java.awt.geom.Rectangle2D;

import arkanoid.ventanas.VentanaArkanoid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Bola extends Thread {
	
	private int posicionX,posicionY,sentidoX,sentidoY,incrementoX,incrementoY,dimension,impactos;
	private VentanaArkanoid ventanaArkanoid;

	@Override
	public void run() {
		boolean fin=false;
		try {
			while(!fin) {
				
				if(getPosicionX()<0 || (getPosicionX()+getDimension())>getVentanaArkanoid().getWidth())
				{
					setSentidoX(getSentidoX()*-1);
				}
				if(getPosicionY()<0 || (getPosicionY()+getDimension())>getVentanaArkanoid().getHeight())
				{
					setSentidoY(getSentidoY()*-1);
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		finally {
		}
		
		
	}

	private boolean miraChoque(Bola bola) {
		return true;
	}

	

}
