package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoGuitarra implements MusicoInterface {

	private InstrumentoInterface instrumentoInterface;

	@Override
	public void tocarGuitarra() {
		System.out.println(getInstrumentoInterface().sonar());

	}

	private InstrumentoInterface getInstrumentoInterface() {

		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

	@Override
	public void tocar() {
		
		
	}

	@Override
	public void tocarTromba() {
		
		
	}

}
