package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;


import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public abstract  class Musico implements MusicoInterface {

	private Set<Instrumento> instrumentosInterface;

	private InstrumentoInterface instrumentoInterface;

	private Instrumento[] instrumentos;
	
	public Musico() {
	}

	public Musico(Instrumento[] instrumentos) {
		super();
		this.setInstrumentos(instrumentos);
	}

	public Musico(Instrumento instrumento) {
		super();
		this.instrumento = instrumento;
	}
	
	public Musico(Set<Instrumento> instrumentosInterface) {
		super();
		this.setInstrumentosInterface(instrumentosInterface);
	}
	
	

	public abstract  void tocar() throws SinSonidoException ;

	public Instrumento instrumento;


	

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public Instrumento[] getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(Instrumento[] instrumentos) {
		this.instrumentos = instrumentos;
	}

	public Set<Instrumento> getInstrumentosInterface() {
		return instrumentosInterface;
	}

	public void setInstrumentosInterface(Set<Instrumento> instrumentosInterface) {
		this.instrumentosInterface = instrumentosInterface;
	}

	

	

}
