package concierto.instrumentos;

import concierto.beans.InstrumentoBeanTrompeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Tambor extends Instrumento {


	public Tambor(InstrumentoBeanTrompeta instrumentoBean) {
		super(instrumentoBean);
	}
	
	@Autowired
	@Override
	public void setInstrumentoBean(InstrumentoBeanTrompeta instrumentoBean) {
		// TODO Auto-generated method stub
		super.setInstrumentoBean(instrumentoBean);
	}
	

}
