package concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.anotaciones.Traza;
import concierto.anotaciones.Vigilado;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;

@Component
public class Solista extends Musico {

	public Solista(Instrumento instrumentoInterface) {
		super(instrumentoInterface);
	}

	public Solista() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	@Qualifier("trompeta")
	@Override
	public void setInstrumentoInterface(Instrumento instrumentoInterface) {
		// TODO Auto-generated method stub
		super.setInstrumentoInterface(instrumentoInterface);
	}
	
	@Override
	//cambiar por @traza
	@Vigilado
	@Traza
	public void tocar() throws SinSonidoException {
		System.out.println(getInstrumentoInterface().sonar()+" - "+getInstrumentoInterface().getInstrumentoBeanPapa().hashCode());
	}

}
