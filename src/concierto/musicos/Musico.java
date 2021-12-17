package concierto.musicos;

import concierto.instrumentos.Instrumento;

public class Musico implements MusicoInterface {
	
	private Instrumento instrumento; 
	




	public Instrumento getInstrumento() {
		return instrumento;
	}





	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}





	@Override
	public void tocar() {
	
		System.out.println(getInstrumento().sonar());

	}

}
