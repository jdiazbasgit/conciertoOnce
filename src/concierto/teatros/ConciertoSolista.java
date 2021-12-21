package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoJacinto;
import concierto.musicos.MusicoJacinto;
import concierto.musicos.MusicoJavier;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean("pom, pom, pom", "nueva marca", 500);
		InstrumentoInterface tambor = new InstrumentoJacinto(instrumentoBeanTambor);
		MusicoJacinto jacinto = new MusicoJacinto(tambor);
		jacinto.setInstrumentoInterface(tambor);
		MusicoJavier solista = new MusicoJavier(tambor);
		solista.setInstrumentoInterface(tambor);

		jacinto.tocar();
		// prueba para sara

	} 

}
