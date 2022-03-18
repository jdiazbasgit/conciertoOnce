package concierto.instrumentos;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import concierto.beans.InstrumentoBeanPapa;
import concierto.beans.InstrumentoBeanTambor;
import concierto.excepciones.SinSonidoException;
import lombok.Data;

/**
 * @author fjdia Calase del instrumento
 */
@Data
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Instrumento implements InstrumentoInterface, Comparable<Instrumento> {

	private InstrumentoBeanPapa instrumentoBeanPapa;

	public Instrumento(InstrumentoBeanPapa instrumentoBeanPapa) {
		super();
		this.instrumentoBeanPapa = instrumentoBeanPapa;
	}

	public Instrumento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * metodo que devuelve el sonido del instrumento
	 * 
	 * @throws SinSonidoException
	 */

	public String sonar() throws SinSonidoException {
		if (getInstrumentoBeanPapa().getSonido().equals("nada")) {
			throw new SinSonidoException();
		}
		return getInstrumentoBeanPapa().getSonido();

	}

	/*
	 * @Override public int hashCode() {
	 * 
	 * return this.getInstrumentoBean().getSonido().hashCode()+1; }
	 */

	/*
	 * @Override public boolean equals(Object obj) { Instrumento
	 * instrumento=(Instrumento) obj; return
	 * this.getInstrumentoBean().getSonido().equals(instrumento.getInstrumentoBean()
	 * .getSonido());
	 * 
	 * }
	 */

	@Override
	public int compareTo(Instrumento o) {
		// TODO Auto-generated method stub
		return this.getInstrumentoBeanPapa().getSonido().compareTo(o.getInstrumentoBeanPapa().getSonido());
	}

}
