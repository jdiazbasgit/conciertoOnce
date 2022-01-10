package concierto.musicos;


import java.util.List;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.Instrumento;


	public class HombreOrquestaNavidadFuncional extends Musico {

		

		
		
		public HombreOrquestaNavidadFuncional(InstrumentoInterface[] instrumentosInterface) {
			super(instrumentosInterface);
			
		}
		
		
		@Override
		public void tocar() {
			
			 List.of(getInstrumentosInterface()).stream().filter(i->i.sonar().length()>1)
			 .forEach(instrumento->{ System.out.println(instrumento.sonar()); });
			 
		}
			
			
		
		
	}
	

