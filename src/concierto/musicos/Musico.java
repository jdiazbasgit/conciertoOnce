package concierto.musicos;

import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public abstract class Musico implements MusicoInterface {

	private Set<InstrumentoInterface> instrumetosInterface;

	private InstrumentoInterface instrumentoInterface;

	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}
	
	public Musico() {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}

	public abstract void tocar() throws SinSonidoException ;

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

	public Set<InstrumentoInterface> getInstrumentosInterface() {
		return instrumetosInterface;
	}

	public void setInstrumentosInterface(Set<InstrumentoInterface> instrumentosInterface) {
		this.instrumetosInterface = instrumentosInterface;
	}


}

