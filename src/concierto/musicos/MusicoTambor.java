package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoTambor implements MusicoInterface {

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
		
		
	}

	@Override
	public void tocarTromba() {
		
		
	}

	
	
	

	

}
