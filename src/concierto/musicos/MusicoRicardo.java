package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoRicardo implements MusicoInterface {
	private InstrumentoInterface instrumentoInterface;


	public void tocar() {
		System.out.println(getInstrumentoInterface().sonar());
		




	}


	public MusicoRicardo(InstrumentoInterface instrumentoInterface) {
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

