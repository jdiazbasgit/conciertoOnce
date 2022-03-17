package concierto.instrumentos;

import concierto.beans.InstrumentoBeanGuitarra;
import concierto.beans.InstrumentoBeanTambor;
import concierto.beans.InstrumentoBeanTrompeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Guitarra extends Instrumento {


	public Guitarra(InstrumentoBeanTrompeta instrumentoBean) {
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
