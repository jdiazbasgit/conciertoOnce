package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.beans.InstrumentoBeanPapa;
import concierto.beans.InstrumentoBeanTambor;

@Component
public class Tambor extends Instrumento {

	
	public Tambor() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	@Qualifier("instrumentoBeanTambor")
	@Override
	public void setInstrumentoBeanPapa(InstrumentoBeanPapa instrumentoBeanPapa) {
		super.setInstrumentoBeanPapa(instrumentoBeanPapa);
	}

}