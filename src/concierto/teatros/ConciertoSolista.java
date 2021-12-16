package concierto.teatros;

import java.util.Iterator;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		instrumentoBeanTambor.setMarca("nueva marca");
		instrumentoBeanTambor.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);
		// tambor.setInstrumentoBean(instrumentoBean);

		Musico solista = new Musico();
		solista.setInstrumentoInterface(tambor);

		InstrumentoBean instrumentoBeanTrompeta = new InstrumentoBean();
		instrumentoBeanTrompeta.setSonido("tuuuu, tuuuu, tuuuu en bean");
		instrumentoBeanTrompeta.setMarca("nueva marca");
		instrumentoBeanTrompeta.setPrecio(500);
		InstrumentoInterface trompeta = new Instrumento(instrumentoBeanTrompeta);
		// tambor.setInstrumentoBean(instrumentoBean);

		Musico solista1 = new Musico();
		solista1.setInstrumentoInterface(trompeta);

		InstrumentoBean instrumentoBeanGuitarra = new InstrumentoBean();
		instrumentoBeanGuitarra.setSonido("tlan, tlan, tlan en bean");
		instrumentoBeanGuitarra.setMarca("nueva marca");
		instrumentoBeanGuitarra.setPrecio(500);
		InstrumentoInterface guitarra = new Instrumento(instrumentoBeanGuitarra);
		// tambor.setInstrumentoBean(instrumentoBean);

		Musico solista2 = new Musico();
		solista2.setInstrumentoInterface(guitarra);
		
		solista.tocar();
		solista1.tocar();
		solista2.tocar();

	}

}
