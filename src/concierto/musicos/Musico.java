/**
 * 
 */
package concierto.musicos;

import concierto.instrumentos.Instrumento;

/**
 * @author rey
 *
 */
public class Musico implements MusicoInterface {
	
	private Instrumento instrumento;

	@Override
	public void tocar() {
		System.out.println(getInstrumento().sonar());
		

	}

	/**
	 * @return the instrumento
	 */
	public Instrumento getInstrumento() {
		return instrumento;
	}

	/**
	 * @param instrumento the instrumento to set
	 */
	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

}
