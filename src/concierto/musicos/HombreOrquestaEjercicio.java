package concierto.musicos;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquestaEjercicio extends Musico {

	

	public HombreOrquestaEjercicio(InstrumentoInterface[] instrumentosInterface) {
		super(instrumentosInterface);
		
	}

	@Override
	public void tocar() {

		for(int i=0;i<getInstrumentosInterface().length;i++) {
			if(getInstrumentosInterface()[i].sonar().length() >10){
		}
			System.out.println(getInstrumentosInterface()[i].sonar());
	}

	}}
