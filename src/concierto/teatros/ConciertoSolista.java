package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoAlmu2;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;
import concierto.musicos.MusicoAlmu2;
import concierto.musicos.MusicoInterface;

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
		
		
		InstrumentoInterface instrumentoAlmu2 = new InstrumentoAlmu2("sonido instrumento almu");
		MusicoInterface musicoAlmu2 = new MusicoAlmu2 (instrumentoAlmu2);
		musicoAlmu2.tocar();

		

		
	}

}
