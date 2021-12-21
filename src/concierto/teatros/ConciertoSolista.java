package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoRicardo;
import concierto.musicos.Musico;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoRicardo;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");

		

		instrumentoBeanTambor.setMarca("nueva marca");
		
		
		instrumentoBeanTambor.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);

		
		Musico solista = new Musico(tambor);
		solista.setInstrumentoInterface(tambor);

		solista.tocar();
		InstrumentoInterface instrumentoRicardo= new InstrumentoRicardo("sonido de instrumentoRicardo");
		MusicoInterface musicoRicardo= new MusicoRicardo(instrumentoRicardo);
		musicoRicardo.tocar();
		

		

	}

}
