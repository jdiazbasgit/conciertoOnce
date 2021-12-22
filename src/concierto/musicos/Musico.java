package concierto.musicos;


import concierto.instrumentos.InstrumentoInterface;

public abstract class Musico implements MusicoInterface {

	

	private InstrumentoInterface instrumentoInterface;
	private InstrumentoInterface[] instrumentosInterface;
	
	
	@Override

	public abstract void tocar();

	public Musico(InstrumentoInterface instrumentoInterface) {
		super();
		this.instrumentoInterface = instrumentoInterface;

	public void tocar() {
		System.out.println(getInstrumentoInterface().sonar());
	  
		

	}

	public InstrumentoInterface getInstrumentoInterface() {
		return instrumentoInterface;
	}

	public void setInstrumentoInterface(InstrumentoInterface instrumentoInterface) {
		this.instrumentoInterface = instrumentoInterface;
	}


	public InstrumentoInterface[] getInstrumentosInterface() {
		return instrumentosInterface;
	}



	
	
	

	


>>>>>>> branch 'concierto/sara' of https://github.com/jdiazbasgit/conciertoOnce.git
}
