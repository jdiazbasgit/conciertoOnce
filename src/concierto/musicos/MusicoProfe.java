package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoProfe implements MusicoInterface {

	private InstrumentoInterface instrumentoInterface;
	
	public MusicoProfe(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}
	
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
