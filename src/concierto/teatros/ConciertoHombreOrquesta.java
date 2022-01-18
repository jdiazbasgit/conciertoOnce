package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {
		Instrumento[] instrumentos= {new Instrumento(new InstrumentoBean("tklan, tklan, tklan")),
				new Instrumento(new InstrumentoBean("nada")),
				new Instrumento(new InstrumentoBean("pom, pom, pom"))
				};
		
		HombreOrquesta hombreOrquesta= new HombreOrquesta(instrumentos);
		try {
			hombreOrquesta.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Se�ores el instrumento se ha roto y lo voy a arreglar");
			e.instrumentoRoto();
			for (Instrumento instrumento : instrumentos) {
				if(instrumento.getInstrumentoBean().getSonido().equals("nada"))
					instrumento.getInstrumentoBean().setSonido("pin, pin,  pion");
		}
			System.out.println("se�ores reanudamos el concierto");
			try {
				hombreOrquesta.tocar();
			} catch (SinSonidoException e1) {
				
			}
			finally {
				System.out.println("se�ores gracias por venir a este teatro y esparamos vers de nuevo");
			}
	}

	}
}
