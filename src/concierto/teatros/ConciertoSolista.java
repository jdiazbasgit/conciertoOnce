package concierto.teatros;

import java.util.Iterator;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoSergio;
import concierto.musicos.Musico;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoSergio;

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
		

		InstrumentoInterface instrumentoSergio= new InstrumentoSergio("sonido de instrumento msergio");
		MusicoInterface musicoSergio= new MusicoSergio(instrumentoSergio);
		
		musicoSergio.tocar();

	}

}
