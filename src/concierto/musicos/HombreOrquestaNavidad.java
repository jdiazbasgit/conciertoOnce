package concierto.musicos;

import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquestaNavidad extends Musico implements MusicoInterface {

	private static InstrumentoInterface[] instrumentoInterface;

	public HombreOrquestaNavidad(Instrumento instrumento) {
		super(instrumentoInterface);
		
	}

	@Override
	public void tocar() {
		
		
	}
	
	
}
