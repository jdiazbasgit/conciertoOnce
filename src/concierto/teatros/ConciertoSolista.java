package concierto.teatros;

import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoMar;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoMar;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoInterface tamborMar = new InstrumentoMar("Mar => pom, pom ,pom");		

		MusicoInterface solistaMar = new MusicoMar(tamborMar);

		solistaMar.tocar();			

	}

}
