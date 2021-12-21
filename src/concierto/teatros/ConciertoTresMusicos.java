package concierto.teatros;

import java.util.Iterator;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;

public class ConciertoTresMusicos {

	public static void main(String[] args) {
		

		
		InstrumentoBean instrumentoBeanTambor= new InstrumentoBean("Bombo, caja, bombo, caja","KORG",599);

		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);
				
		Musico musicoPercusionista= new Musico(tambor);
		musicoPercusionista.setInstrumentoInterface(tambor);
		
		
		
		InstrumentoBean instrumentoBean1= new InstrumentoBean("quinta, quinta, quinta","FENDER",500);

		InstrumentoInterface guitarra = new Instrumento(instrumentoBean1);
				
		Musico musicoGuitarrista= new Musico(guitarra);
		musicoGuitarrista.setInstrumentoInterface(guitarra);
		
	
		
		InstrumentoBean instrumentoBean2= new InstrumentoBean("turututran", "Aires",500);

		InstrumentoInterface trompeta = new Instrumento(instrumentoBean2);
				
		Musico musicoTrompetista= new Musico(trompeta);
		musicoTrompetista.setInstrumentoInterface(trompeta);
		
		System.out.println("bat bi hiru lau!!!");
		musicoPercusionista.tocar();
		musicoGuitarrista.tocar();
		musicoTrompetista.tocar();

	}

}
