package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoJacinto implements MusicoInterface {

private InstrumentoInterface instrumentoInterface;
	
	@Override
	public void tocar() {
		System.out.println(getInstrumentoInterface().sonar());

	}

	
	
	public MusicoJacinto(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;
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
