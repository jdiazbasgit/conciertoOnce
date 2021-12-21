package concierto.musicos;

import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;

public class MusicoAntonio implements MusicoInterface {
	

		private InstrumentoInterface instrumentoInterface;
		
		public void tocar () {
			System.out.println(getInstrumentoInterface().sonar()));
		}
		
		public MusicoAntonio(InstrumentoIntwerface instrumentoInterface) {
			super()
			this.instrumentoInterface= instrumentoInterface;
			
		}
		
		public InstrumentoInterface getInstrumentoInterface() {
			return instrumentoInterface;
		}
		
		public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
			this.instrumentoInterface = instrumentoInterface;
		}
		
}
