package concierto.musicos;

import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquestaEjercicioFuncional extends Musico {

	public HombreOrquestaEjercicioFuncional(Instrumento instrumento) {
		super(instrumento);
		
	}

	@Override
	public void tocar() {
		
		for(int i=0;i<getInstrumentosInterface().length;i++) {
			if(getInstrumentosInterface()[i].sonar().length() >10){
		}
			System.out.println(getInstrumentosInterface()[i].sonar());
		}}}

	