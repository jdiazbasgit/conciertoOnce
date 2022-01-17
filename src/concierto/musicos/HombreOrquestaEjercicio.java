package concierto.musicos;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquestaEjercicio extends Musico {

	

	public HombreOrquestaEjercicio(InstrumentoInterface[] instrumentosInterface) {
		super(instrumentosInterface);
		
	}

	@Override
	public void tocar() throws SinSonidoException {

		for(int i=0;i<getInstrumentosInterface().length;i++) {
			if(getInstrumentosInterface()[i].sonar().length() >10){
		}
			System.out.println(getInstrumentosInterface()[i].sonar());
	}

	}

	@Override
	public void tocar1() throws SinSonidoException {
		// TODO Auto-generated method stub
		
	}}
