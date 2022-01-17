package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public abstract class Musico implements MusicoInterface {

	private InstrumentoInterface[] instrumentosInterface;
	
	private InstrumentoInterface instrumentoInterface;
	
	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}

	
	@Override
	public abstract void tocar() throws SinSonidoException;

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}


	public Musico(InstrumentoInterface[] instrumentosInterface) {
		super();
		this.setInstrumentosInterface(instrumentosInterface);
	}


	/**
	 * @return the instrumentosInterface
	 */
	public InstrumentoInterface[] getInstrumentosInterface() {
		return instrumentosInterface;
	}


	/**
	 * @param instrumentosInterface the instrumentosInterface to set
	 */
	public void setInstrumentosInterface(InstrumentoInterface[] instrumentosInterface) {
		this.instrumentosInterface = instrumentosInterface;
	}
	

	
	
	

	

}
