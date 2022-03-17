package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import concierto.beans.InstrumentoBeanTambor;

@Component
public class Tompeta extends Instrumento {

	public Tompeta(InstrumentoBeanTambor instrumentoBean) {
		super(instrumentoBean);
		// TODO Auto-generated constructor stub
	}
	@Autowired
	@Override
	public void setInstrumentoBean(InstrumentoBeanTambor instrumentoBean) {
		// TODO Auto-generated method stub
		super.setInstrumentoBean(instrumentoBean);
	}

}
