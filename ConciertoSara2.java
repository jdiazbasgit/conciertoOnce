
public class ConciertoSara2 {

}
package concierto.teatros;


import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoSara1;
import concierto.musicos.Musico;

public class ConciertoSolista {

	public static void main(String[] args, InstrumentoInterface flauta) {

		InstrumentoSara1 instrumentoBeanTambor = new InstrumentoSara1();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
	
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);
		// tambor.setInstrumentoBean(instrumentoBean);

		Musico solista = new Musico();
		solista.setInstrumentoInterface(tambor);

		InstrumentoSara1 instrumentoBeanTrompeta = new InstrumentoSara1();
		instrumentoBeanTrompeta.setSonido("tuuuu, tuuuu, tuuuu en bean");
		
		InstrumentoInterface trompeta = new Instrumento(instrumentoBeanTrompeta);
		// tambor.setInstrumentoBean(instrumentoBean);

		Musico solista1 = new Musico();
		solista1.setInstrumentoInterface(trompeta);

		InstrumentoSara1 instrumentoBeanGuitarra = new InstrumentoSara1();
		instrumentoBeanGuitarra.setSonido("tlan, tlan, tlan en bean");
		
		InstrumentoInterface guitarra = new Instrumento(instrumentoBeanGuitarra);
		// tambor.setInstrumentoBean(instrumentoBean);

		Musico solista2 = new Musico();
		solista2.setInstrumentoInterface(guitarra);


		Musico solista3 = new Musico();
		solista3.setInstrumentoInterface(flauta);

		InstrumentoSara1 instrumentoBeanflauta = new InstrumentoSara1();
		instrumentoBeanflauta.setSonido("flu, flu, flu en bean");
		
	
		
		solista.tocar();
		solista1.tocar();
		solista2.tocar();
		solista3.tocar();

	}

}