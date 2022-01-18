package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.HombreOrquestaNavidadFuncional;

public class ConciertoHombreOrquestaNavidadFuncional {

	public static void main(String[] args) {
		Instrumento[] instrumentos = { new Instrumento(new InstrumentoBean("clin, clin, clin")),
				new Instrumento(new InstrumentoBean("plis, plas, plus")),
				new Instrumento(new InstrumentoBean("la, la, la")),
				new Instrumento(new InstrumentoBean("clon, clon, clon")),
				new Instrumento(new InstrumentoBean("nada")),
				new Instrumento(new InstrumentoBean("ras, ras, ras")),
				new Instrumento(new InstrumentoBean("pom, pom, pom")),
				new Instrumento(new InstrumentoBean("guan, guan, guan")),
				new Instrumento(new InstrumentoBean("tralalalala")), new Instrumento(new InstrumentoBean("lolololo")) };
		HombreOrquestaNavidadFuncional hombreOrquestaNavidadFuncional = new HombreOrquestaNavidadFuncional(
				instrumentos);
		try {
			hombreOrquestaNavidadFuncional.tocar();

		} catch (SinSonidoException e) {
			System.out.println("Señores el instrumento se ha roto y lo voy a arreglar");
			e.instrumentoRoto();
			for (Instrumento instrumento : instrumentos) {
				if (instrumento.getInstrumentoBean().getSonido().equals("nada"))
					instrumento.getInstrumentoBean().setSonido("pin, pin,  pion");
			}
			System.out.println("señores reanudamos el concierto");
			try {
				hombreOrquestaNavidadFuncional.tocar();
			} catch (SinSonidoException e1) {
			} finally {
				System.out.println("señores gracias por venir a este teatro y esparamos vers de nuevo");
			}
		}
	}
}
