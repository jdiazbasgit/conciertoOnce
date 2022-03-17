package concierto.musicos;

import java.util.Set;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;

public abstract class Musico implements MusicoInterface {
	
	private Set<Instrumento> instrumentosInterface;

	private Instrumento instrumentoInterface;
	
	public Musico() {
	}
	
	
	public Musico(Instrumento instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}
	
	public Musico(Set<Instrumento> instrumentosInterface) {
		super();
		this.setInstrumentosInterface(instrumentosInterface);
	}
	
	
	
	public abstract  void tocar() throws SinSonidoException ;


	public Set<Instrumento> getInstrumentosInterface() {
		return instrumentosInterface;
	}


	public void setInstrumentosInterface(Set<Instrumento> instrumentosInterface) {
		this.instrumentosInterface = instrumentosInterface;
	}

	public Instrumento getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(Instrumento instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}



}
