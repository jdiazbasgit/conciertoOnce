package concierto.musicos;

import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public class Musico implements MusicoInterface {

	private InstrumentoInterface instrumentoInterface;
	
	@Override
	public void tocar() {
		System.out.println(getInstrumentoInterface().sonar());

	}

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

	@Override
	public void tocarGuitarra() {
		System.out.println(getInstrumentoInterface().sonar());
		
	}

	@Override
	public void tocarTromba() {
		System.out.println(getInstrumentoInterface().sonar());
		
	}

	
	
	

	

}
