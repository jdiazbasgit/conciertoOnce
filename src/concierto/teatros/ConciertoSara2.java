
public class ConciertoSara2 {

}
package concierto.teatros;


import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoSara1;
import concierto.musicos.Musico;

public class ConciertoSolista {

	public static void main(String[] args, InstrumentoInterface flauta) {

		InstrumentoSara instrumentoBeanTambor = new InstrumentoSara();
		instrumentoBeanTambor.setSonido("pom, pom ,pom");
	
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);
		

		Musico solista = new Musico();
		solista.setInstrumentoInterface(tambor);

		InstrumentoSara instrumentoBeanTrompeta = new InstrumentoSara();
		instrumentoBeanTrompeta.setSonido("tuuuu, tuuuu, tuuuu");
		
		InstrumentoInterface trompeta = new Instrumento(instrumentoBeanTrompeta);
	

		Musico solista1 = new Musico();
		solista1.setInstrumentoInterface(trompeta);

		InstrumentoSara instrumentoBeanGuitarra = new InstrumentoSara();
		instrumentoBeanGuitarra.setSonido("tlan, tlan, tlan");
		
		InstrumentoInterface guitarra = new Instrumento(instrumentoBeanGuitarra);
	

		Musico solista2 = new Musico();
		solista2.setInstrumentoInterface(guitarra);


		Musico solista3 = new Musico();
		solista3.setInstrumentoInterface(flauta);

		InstrumentoSara instrumentoBeanflauta = new InstrumentoSara();
		instrumentoBeanflauta.setSonido("flu, flu, flu");
		
	
		
		solista.tocar();
		solista1.tocar();
		solista2.tocar();
		solista3.tocar();

	}

}