package concierto.instrumentos;

import concierto.beans.InstrumentoBeanDos;

public class InstrumentoDos implements InstrumentoInterface {

	private InstrumentoBeanDos instrumentoBeanDos;

	public InstrumentoDos(InstrumentoBeanDos instrumentoBeanDos) {
		super();
		this.instrumentoBeanDos = instrumentoBeanDos;
	}

	@Override
	/**
	 * metodo que devuelve el sonido del instrumento
	 */
	public String sonar() {

		return getInstrumentoBeanDos().getSonido();
	}

	public InstrumentoBeanDos getInstrumentoBeanDos() {
		return instrumentoBeanDos;
	}

	public void setInstrumentoBean(InstrumentoBeanDos instrumentoBeanDos) {
		this.instrumentoBeanDos = instrumentoBeanDos;
	}

}
