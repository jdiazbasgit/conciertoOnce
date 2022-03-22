package concierto.musicos;

import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public abstract  class Musico implements MusicoInterface {

	private Set<Instrumento> instrumentosInterface;

	private Instrumento instrumentoInterface;

	public Musico(Instrumento instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}
	
	public Musico(Set<Instrumento> instrumentosInterface) {
		super();
		this.setInstrumentosInterface(instrumentosInterface);
	}
	
	public Musico() {
		// TODO Auto-generated constructor stub
	}

	public abstract  void tocar() throws SinSonidoException ;

	public Instrumento getInstrumentoInterface() {
		return instrumentoInterface;
	}

	

	public void setInstrumentosInterface(Set<Instrumento> instrumentosInterface) {
		this.instrumentosInterface = instrumentosInterface;
	}

	public Set<Instrumento> getInstrumentosInterface() {
		return instrumentosInterface;
	}

	public void setInstrumentoInterface(Instrumento instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

	

	

}
