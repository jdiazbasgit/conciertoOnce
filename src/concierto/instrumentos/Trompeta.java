package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import concierto.beans.InstrumentoBeanPapa;

//@Component
@Qualifier("getTrompeta")
@Scope("prototype")
public class Trompeta extends Instrumento {
	
	public Trompeta() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	@Qualifier("instrumentoBeanTrompeta")
	@Override
	public void setInstrumentoBeanPapa(InstrumentoBeanPapa instrumentoBeanPapa) {
		// TODO Auto-generated method stub
		super.setInstrumentoBeanPapa(instrumentoBeanPapa);
	}

}
