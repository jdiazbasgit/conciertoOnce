package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public abstract class Musico implements MusicoInterface {

	private InstrumentoInterface[] instrumentosInterface;

	public Musico(InstrumentoInterface[] instrumentosInterface) {
		super();
		this.setInstrumentosInterface(instrumentosInterface);
	}

	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}

	protected InstrumentoInterface instrumentoInterface;

	@Override
	public abstract void tocar() throws SinSonidoException;

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

	public InstrumentoInterface[] getInstrumentosInterface() {
		return instrumentosInterface;
	}

	public void setInstrumentosInterface(InstrumentoInterface[] instrumentosInterface) {
		this.instrumentosInterface = instrumentosInterface;
	}

}
