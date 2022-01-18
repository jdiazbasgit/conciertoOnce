package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;

public class MusicoPedro implements MusicoInterface {

	private Instrumento instrumento;

	@Override
	public void tocar() throws SinSonidoException {
		System.out.println(getInstrumento().sonar());

	}

	public MusicoPedro(Instrumento instrumento) {
		super();
		this.instrumento = instrumento;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumentoInterface(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

}
