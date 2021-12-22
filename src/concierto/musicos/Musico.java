package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public abstract class Musico implements MusicoInterface {

	private InstrumentoInterface instrumentoInterface;
	private InstrumentoInterface[] instrumentosInterface;

	public Musico(InstrumentoInterface[] instrumentosInterface) {
		super();
		this.instrumentosInterface = instrumentosInterface;
	}

	@Override

	public abstract void tocar();

	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

	public InstrumentoInterface[] getInstrumentosInterface() {
		return instrumentosInterface;
	}




}
