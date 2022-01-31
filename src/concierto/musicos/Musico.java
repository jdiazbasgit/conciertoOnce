package concierto.musicos;

import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public abstract class Musico implements MusicoInterface {

	private Set<InstrumentoInterface> instrumentosInterface;

	private InstrumentoInterface instrumentoInterface;

	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}
	
	public Musico(Set<InstrumentoInterface> instrumentosInterface) {
		super();
		this.setInstrumentosInterface(instrumentosInterface);
	}

	public abstract void tocar() throws SinSonidoException ;

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

	public Set<InstrumentoInterface> getInstrumentosInterface() {
		return instrumentosInterface;
	}

	public void setInstrumentosInterface(Set<InstrumentoInterface> instrumentosInterface) {
		this.instrumentosInterface = instrumentosInterface;
	}

	

}
