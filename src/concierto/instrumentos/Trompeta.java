package concierto.instrumentos;

import concierto.beans.InstrumentoBeanTrompeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Trompeta extends Instrumento {


	public Trompeta(InstrumentoBeanTrompeta instrumentoBean) {
		super(instrumentoBean);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	@Override

	public void setInstrumentoBean(InstrumentoBeanTrompeta instrumentoBean) {
		// TODO Auto-generated method stub
		super.setInstrumentoBean(instrumentoBean);
	}
	

}
