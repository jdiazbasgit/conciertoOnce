package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;
import concierto.musicos.MusicoCarlos;

public class ConciertoSolista {

	public static void main(String[] args) {

		
		
		
		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");
		instrumentoBeanTambor.setMarca("nueva marca");
		instrumentoBeanTambor.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);
		
		
		InstrumentoBean instrumentoBeanCarlos = new InstrumentoBean();
		instrumentoBeanCarlos.setSonido("pom, pom ,pom en bean de carlos");
		instrumentoBeanCarlos.setMarca("nueva marca de carlos");
		instrumentoBeanCarlos.setPrecio(3000);
		InstrumentoInterface intrumentocarlos = new Instrumento(instrumentoBeanCarlos);
		

		Musico solista = new Musico(tambor);
		MusicoCarlos carlos = new MusicoCarlos(intrumentocarlos);
		
		solista.setInstrumentoInterface(tambor);
		carlos.setInstrumentoInterface(intrumentocarlos);

		solista.tocar();
		carlos.tocar();
		
		

		

	}

}
