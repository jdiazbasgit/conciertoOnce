package concierto.musicos;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public class MusicoPedro implements MusicoInterface {

	private InstrumentoInterface instrumentoInterface;

	@Override
	public void tocar() throws SinSonidoException {
		System.out.println(getInstrumentoInterface().sonar());

	}

	public MusicoPedro(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

}
