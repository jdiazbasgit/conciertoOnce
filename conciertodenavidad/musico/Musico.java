/**
 * 
 */
package conciertodenavidad.musico;

import conciertodenavidad.instrumentos.InstrumentoInterfaz;

/**
 * @author malmamor
 *
 */
public class Musico implements MusicoInterfaz {

	private InstrumentoInterfaz instrumento;	
	
	public Musico() {
		super();
	}

	public Musico(InstrumentoInterfaz instrumento) {
		super();
		this.instrumento = instrumento;
	}

	public InstrumentoInterfaz getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(InstrumentoInterfaz instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public String tocarInstrumento() {
		return instrumento.sonar();
	}

}
