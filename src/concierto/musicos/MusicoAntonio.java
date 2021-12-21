package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class MusicoAntonio implements MusicoInterface {
	
		
		private InstrumentoInterface instrumentoInterface;
		
		public void tocar () {
			System.out.println(getInstrumentoInterface().sonar());
		}
		
		public MusicoAntonio(InstrumentoInterface instrumentoInterface) {
			super();
			this.instrumentoInterface= instrumentoInterface;
			
		}
		
		public InstrumentoInterface getInstrumentoInterface() {
			return instrumentoInterface;
		}
		
		//public void setInstrumentoInterface(MusicoAntonio solistaAntonio) {
		//	this.instrumentoInterface =  (InstrumentoInterface) solistaAntonio;
		//}
		
}
