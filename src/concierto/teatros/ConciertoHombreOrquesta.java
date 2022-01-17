package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) throws SinSonidoException {
		Instrumento[] instrumentos = {new Instrumento(new InstrumentoBean("pom,pom,pom")), 
				new Instrumento(new InstrumentoBean("tuuu, tuuu, tuuu")),
				new Instrumento(new InstrumentoBean("pi, pi, pi")),
				new Instrumento(new InstrumentoBean("pam, pam")),
				new Instrumento(new InstrumentoBean("pluf, pluf")),
				new Instrumento(new InstrumentoBean("plin, plin")),
				new Instrumento(new InstrumentoBean("nada")),
				new Instrumento(new InstrumentoBean("pla, pla, pla")),
				new Instrumento(new InstrumentoBean("da, da, da")),
				new Instrumento(new InstrumentoBean("flun, flun")),
				new Instrumento(new InstrumentoBean("pa , pa"))};
		
		HombreOrquesta hombreOrquesta = new HombreOrquesta(instrumentos);
		
		try {
			hombreOrquesta.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Señores el instrumento se ha roto y lo voy a arreglar");
			e.instrumentoRoto();
			for (Instrumento instrumento : instrumentos) {
				if (instrumento.getInstrumentoBean().getSonido().equals("nada")) {
					instrumento.getInstrumentoBean().setSonido("sonido arreglado");
				}
			}
			System.out.println("señores reanudamos el concierto");
			try {
				hombreOrquesta.tocar();
			} catch (Exception e1) {
				// TODO: handle exception
			}
			finally {
				System.out.println("Señores gracias por venir a este teatro y esperamos verle de nuevo");
			}
			
		}
		

	}

}
