package concierto.musicos;

import concierto.instrumentos.Instrumento;

public class Musico implements MusicoInterface {

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	private Instrumento instrumento;

	@Override
	public void tocar() {
		System.out.println(getInstrumento().sonar());
	}

}
