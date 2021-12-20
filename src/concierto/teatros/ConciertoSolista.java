package concierto.teatros;


import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoMar;
import concierto.musicos.Musico;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoMar;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		instrumentoBeanTambor.setMarca("nueva marca");
		instrumentoBeanTambor.setPrecio(500);
		InstrumentoInterface tambor = new InstrumentoMar(instrumentoBeanTambor);
		

		MusicoInterface solista = new MusicoMar(tambor);

		solista.tocar();		

		

	}

}
