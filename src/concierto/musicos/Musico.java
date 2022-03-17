package concierto.musicos;

import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public abstract  class Musico implements MusicoInterface {

	private Set<Instrumento> instrumentosInterface;

	private InstrumentoInterface instrumentoInterface;
	
	public Musico() {
		// TODO Auto-generated constructor stub
	}

	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}
	
	public Musico(Set<Instrumento> instrumentosInterface) {
		super();
		this.setInstrumentosInterface(instrumentosInterface);
	}

	public abstract  void tocar() throws SinSonidoException ;

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

	public Set<Instrumento> getInstrumentosInterface() {
		return instrumentosInterface;
	}

	public void setInstrumentosInterface(Set<Instrumento> instrumentosInterface) {
		this.instrumentosInterface = instrumentosInterface;
	}

	

	

}
