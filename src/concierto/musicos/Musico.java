package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class Musico implements MusicoInterface {

	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}

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

}
