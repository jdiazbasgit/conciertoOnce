package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquestaNavidad extends Musico implements MusicoInterface {

	private static InstrumentoInterface[] instrumentoInterface;

	public HombreOrquestaNavidad(Instrumento instrumento, Instrumento instrumento2, Instrumento instrumento3,
			Instrumento instrumento4, Instrumento instrumento5, Instrumento instrumento6,
			Instrumento instrumento7, Instrumento instrumento8, Instrumento instrumento9,
			Instrumento instrumento10) {
		super(instrumentoInterface);
		
	}

	@Override
		public void tocar() throws SinSonidoException {
			for (InstrumentoInterface instrumento : getInstrumentosInterface()) {
				System.out.println(instrumento.sonar());
		
		
	}
		}
	
	
}
