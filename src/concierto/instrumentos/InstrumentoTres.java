package concierto.instrumentos;

import concierto.beans.InstrumentoBeanTres;

public class InstrumentoTres implements InstrumentoInterface {

	private InstrumentoBeanTres instrumentoBeanTres;

	public InstrumentoTres(InstrumentoBeanTres instrumentoBeanTres) {
		super();
		this.instrumentoBeanTres = instrumentoBeanTres;
	}

	@Override
	/**
	 * metodo que devuelve el sonido del instrumento
	 */
	public String sonar() {

		return getInstrumentoBeanTres().getSonido();
	}

	public InstrumentoBeanTres getInstrumentoBeanTres() {
		return instrumentoBeanTres;
	}

	public void setInstrumentoBean(InstrumentoBeanTres instrumentoBeanTres) {
		this.instrumentoBeanTres = instrumentoBeanTres;
	}

}
