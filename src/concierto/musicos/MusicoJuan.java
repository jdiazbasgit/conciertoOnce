package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoJuan implements MusicoInterface {
	
	private InstrumentoInterface instrumentoInterface;

	public MusicoJuan(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}

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
