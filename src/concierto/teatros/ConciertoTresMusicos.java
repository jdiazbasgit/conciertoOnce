package concierto.teatros;

import java.util.Iterator;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;

public class ConciertoTresMusicos {

	public static void main(String[] args) {
		

		
		InstrumentoBean instrumentoBean= new InstrumentoBean("Bombo, caja, bombo, caja","Yamaha", 300);
		InstrumentoInterface tambor = new Instrumento(instrumentoBean);
		Musico musicoPercusionista= new Musico();
		musicoPercusionista.setInstrumentoInterface(tambor);
		
		//musicoPercusionista.tocar();

		InstrumentoBean instrumentoBean1= new InstrumentoBean("quinta, quinta, quinta","Fender",500);
		InstrumentoInterface guitarra = new Instrumento(instrumentoBean1);
		Musico musicoGuitarrista= new Musico();
		musicoGuitarrista.setInstrumentoInterface(guitarra);
		
		//musicoGuitarrista.tocar();
		
		InstrumentoBean instrumentoBean2= new InstrumentoBean("turututran","Bach", 250);
		InstrumentoInterface trompeta = new Instrumento(instrumentoBean2);
				
		Musico musicoTrompetista= new Musico();
		musicoTrompetista.setInstrumentoInterface(trompeta);
		
		InstrumentoBean instrumentoBean3 = new InstrumentoBean("lalalilo", "BethovenTradeMark", 30);
		InstrumentoInterface violin = new Instrumento(instrumentoBean3);
		Musico musicoViolinista = new Musico();
		
		musicoViolinista.setInstrumentoInterface(violin);
		
		System.out.println("Empieza el violinista");
		
		
		musicoViolinista.tocar();
		
		
		
		System.out.println("El concierto va a comenzar... bat bi hiru lau");
	
		musicoPercusionista.tocar();
		musicoPercusionista.tocar();
		musicoGuitarrista.tocar();
		musicoGuitarrista.tocar();
		musicoTrompetista.tocar();
		musicoTrompetista.tocar();

	}

}
