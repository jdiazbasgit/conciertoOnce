package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoArk4no implements MusicoInterface {
	
	private InstrumentoInterface instrumentoInterface;


	public void tocar() {
		System.out.println(getInstrumentoInterface().sonar()); 
	
	}


	public MusicoArk4no(InstrumentoInterface instrumentoInterface) {
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
