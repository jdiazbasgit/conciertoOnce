package concierto.musicos;

import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public class MusicoPedro MusicoInterface {

	private InstrumentoInterface instrumentoInterface;
	
	@Override
	public void tocar() {
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
