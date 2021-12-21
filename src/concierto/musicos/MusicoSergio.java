package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoSergio implements MusicoInterface {

	
	private InstrumentoInterface instrumentoInterface;

	public MusicoSergio(InstrumentoInterface instrumentoInterface) {
		super();
		this.setInstrumentoInterface(instrumentoInterface);
	}

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

	@Override
	public void tocar() {
		
	System.out.println(getInstrumentoInterface().sonar());
	}
}
	
	
	


