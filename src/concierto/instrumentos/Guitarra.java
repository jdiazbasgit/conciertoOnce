package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import concierto.beans.InstrumentoBeanGuitarra;
import concierto.beans.InstrumentoBeanTambor;

@Component
public class Guitarra extends Instrumento {

	public Guitarra(InstrumentoBeanTambor instrumentoBean) {
		super(instrumentoBean);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	@Override
	public void setInstrumentoBean(InstrumentoBeanGuitarra instrumentoBean) {
		// TODO Auto-generated method stub
		super.setInstrumentoBean(instrumentoBean);
	}

}
