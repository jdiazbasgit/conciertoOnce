package concierto.musicos;

import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquesta extends Musico {

	public HombreOrquesta(Set<InstrumentoInterface> instrumentosInterface) {
		super(instrumentosInterface);
	}

	@Override
	public void tocar() throws SinSonidoException {

		for (InstrumentoInterface instrumento : getInstrumentosInterface()) {
			System.out.println(instrumento.sonar());
		}
	}

}
