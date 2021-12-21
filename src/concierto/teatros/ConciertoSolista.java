package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.MusicoJavier;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		instrumentoBeanTambor.setMarca("nueva marca");
		instrumentoBeanTambor.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);
		

		MusicoJavier solista = new MusicoJavier(tambor);
		solista.setInstrumentoInterface(tambor);

		solista.tocar();
		//hola

		

	}

}
