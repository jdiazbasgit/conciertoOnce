package concierto.teatros;
import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {
		InstrumentoInterface[] instrumentos= {
				new Instrumento(new InstrumentoBean("sonido1")),
				new Instrumento(new InstrumentoBean("sonido2")),
				new Instrumento(new InstrumentoBean("sonido3")),
				new Instrumento(new InstrumentoBean("sonido4")),
				new Instrumento(new InstrumentoBean("sonido5")),
				new Instrumento(new InstrumentoBean("sonido6")),
				new Instrumento(new InstrumentoBean("sonido7")),
				new Instrumento(new InstrumentoBean("sonido8")),
				new Instrumento(new InstrumentoBean("sonido9")),
				new Instrumento(new InstrumentoBean("sonido10")),				
				};
		
		HombreOrquesta hombreOrquesta= new HombreOrquesta(instrumentos);
		hombreOrquesta.tocar();
	}

}
