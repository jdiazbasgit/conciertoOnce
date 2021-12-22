package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoAlmu2 implements MusicoInterface {

	private InstrumentoInterface instrumentoInterface;
	
	@Override
	public void tocar() {
		System.out.println(getInstrumentoInterface().sonar());

	}

	public MusicoAlmu2(InstrumentoInterface instrumentoInterface) {
		super();
		this.setInstrumentoInterface(instrumentoInterface);
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
