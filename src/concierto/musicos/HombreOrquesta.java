package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquesta extends Musico implements MusicoInterface {

	public HombreOrquesta(Instrumento[] instrumentos) {
		super(instrumentos);

	}

	@Override
	public void tocar() throws SinSonidoException {
		for (InstrumentoInterface instrumento : getInstrumentos()) {
			System.out.println(instrumento.sonar());
		
		/*List.of(getInstrumentoInterface()).stream().forEach(instrumento->
		{System.out.println(instrumento.sonar());
		
		});*/

	}

}
}
