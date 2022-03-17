package concierto.musicos;

<<<<<<< HEAD
import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;


public abstract class Musico implements MusicoInterface {

	private InstrumentoInterface[] instrumentosInterface;
	
	private InstrumentoInterface instrumentoInterface;
	
	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}
<<<<<<< HEAD
	public Musico(Set<Instrumento> instrumentosInterface) {
		super();
		this.setInstrumentosInterface(instrumentosInterface);
	}
	
	public Musico() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public abstract void tocar() throws SinSonidoException;

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
