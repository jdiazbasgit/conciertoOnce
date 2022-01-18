package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;

public class Solista extends Musico {

	public Solista(Instrumento instrumento) {
		super(instrumento);

	}

	@Override
	public void tocar()  throws SinSonidoException {

		System.out.println(getInstrumento().sonar());

	}

}
