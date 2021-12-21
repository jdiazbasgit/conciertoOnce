package concierto.musicos;

import  concierto.instrumentos.InstrumentoAlmu;

public class MusicoAlmu implements MusicoInterface {
	
	private InstrumentoInterface instrumentoInterface;
	public void tocarTrompeta() {
		
		System.out.println(getInstrumentoInterface().sonar());
	}
	public MusicoAlmu(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
		
	}
	
