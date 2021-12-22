package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {
		InstrumentoInterface[] instrumentos= {new Instrumento(new InstrumentoBean("pom, pom, pom")),
				new Instrumento(new InstrumentoBean("tuu, tuuu, tuuu")),
				new Instrumento(new InstrumentoBean("tklan, tklan, tklan"))
				};
		
		HombreOrquesta hombreOrquesta= new HombreOrquesta(instrumentos);
		hombreOrquesta.tocar();

	}

}
