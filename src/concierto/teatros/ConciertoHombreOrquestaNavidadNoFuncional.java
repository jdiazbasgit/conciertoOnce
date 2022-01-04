package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquestaNavidadNoFuncional {
	
	public static void main(String[] args) {
		InstrumentoInterface[] instrumentos= {new Instrumento(new InstrumentoBean("clin, clin, clin")),
				new Instrumento(new InstrumentoBean("plis, plas, plus")),
				new Instrumento(new InstrumentoBean("la, la, la")),
				new Instrumento(new InstrumentoBean("clon, clon, clon")),
				new Instrumento(new InstrumentoBean("fiu, fiu, fiu")),
				new Instrumento(new InstrumentoBean("ras, ras, ras")),
				new Instrumento(new InstrumentoBean("pom, pom, pom")),
				new Instrumento(new InstrumentoBean("guan, guan, guan")),
				new Instrumento(new InstrumentoBean("tralalalala")),
				new Instrumento(new InstrumentoBean("lolololo"))
				};
		
		HombreOrquesta hombreOrquestaNavidadNoFuncional= new HombreOrquesta(instrumentos);
		hombreOrquestaNavidadNoFuncional.tocar();

	}

}
