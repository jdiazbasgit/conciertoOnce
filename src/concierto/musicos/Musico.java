package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public abstract class Musico implements MusicoInterface {

	

	private InstrumentoInterface instrumentoInterface;
	
	private InstrumentoInterface[] instrumentosInterface;

	
	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}
	
	@Override
	public abstract void tocar() ;

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
