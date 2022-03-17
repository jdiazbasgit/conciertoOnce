package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;


import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public abstract  class Musico implements MusicoInterface {

	private Set<Instrumento> instrumentos;

	private Instrumento instrumento;

	public Musico() {
	}


	public Musico(Instrumento instrumento) {
		super();
		this.instrumento = instrumento;
	}
	
	public Musico(Set<Instrumento> instrumentos) {
		super();
		this.setInstrumentos(instrumentos);
	}
	
	

	public Set<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(Set<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public abstract  void tocar() throws SinSonidoException ;


}

	

