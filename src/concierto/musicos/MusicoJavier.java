package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoJavier implements MusicoInterface {
	
	private InstrumentoInterface instrumentoInterface;
	

	


	public MusicoJavier(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
	}


	@Override
	public void tocar() {
		
		System.out.println(getInstrumentoInterface().sonar());
	}


	/**
	 * @return the instrumentoInterface
	 */
	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}


	/**
	 * @param instrumentoInterface the instrumentoInterface to set
	 */
	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}

}
