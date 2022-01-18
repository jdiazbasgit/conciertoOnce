package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;

public abstract class Musico implements MusicoInterface {

	private Instrumento[] instrumentos;

	public Musico(Instrumento[] instrumentos) {
		super();
		this.setInstrumentos(instrumentos);
	}

	public Musico(Instrumento instrumento) {
		super();
		this.instrumento = instrumento;
	}

	protected Instrumento instrumento;

	public abstract void tocar() throws SinSonidoException;

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public Instrumento[] getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(Instrumento[] instrumentos) {
		this.instrumentos = instrumentos;
	}

}
