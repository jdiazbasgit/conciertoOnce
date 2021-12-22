package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class Solista extends Musico {

	public Solista(InstrumentoInterface instrumentoInterface) {
		super(instrumentoInterface);
	
	}

	@Override
	public void tocar() {
	
	System.out.println(getInstrumentoInterface().sonar());

	}

}
