package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {
		InstrumentoInterface[] instrumentos = {new Instrumento(new InstrumentoBean("pom,pom,pom")), 
				new Instrumento(new InstrumentoBean("tuuu, tuuu, tuuu")),
				new Instrumento(new InstrumentoBean("pi, pi, pi")),
				new Instrumento(new InstrumentoBean("pam, pam")),
				new Instrumento(new InstrumentoBean("pluf, pluf")),
				new Instrumento(new InstrumentoBean("plin, plin")),
				new Instrumento(new InstrumentoBean("tlan, tlan, tlan")),
				new Instrumento(new InstrumentoBean("pla, pla, pla")),
				new Instrumento(new InstrumentoBean("da, da, da")),
				new Instrumento(new InstrumentoBean("flun, flun")),
				new Instrumento(new InstrumentoBean("pa , pa"))};
		
		HombreOrquesta hombreOrquesta = new HombreOrquesta(instrumentos);
		
		hombreOrquesta.tocar();

	}

}
