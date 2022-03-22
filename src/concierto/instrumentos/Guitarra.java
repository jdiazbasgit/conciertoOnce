package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.beans.InstrumentoBeanPapa;

@Component
@Qualifier("tocameAMi")
public class Guitarra extends Instrumento {

	public Guitarra(InstrumentoBeanPapa instrumentoBeanPapa) {
		super(instrumentoBeanPapa);
		// TODO Auto-generated constructor stub
	}

	public Guitarra() {
		
		;
	}

	@Autowired
	@Qualifier("instrumentoBeanGuitarra")
	@Override
	public void setInstrumentoBeanPapa(InstrumentoBeanPapa instrumentoBeanPapa) {
		// TODO Auto-generated method stub
		super.setInstrumentoBeanPapa(instrumentoBeanPapa);
	}
}
© 2022 Gi
