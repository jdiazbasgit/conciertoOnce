package concierto.teatro;


import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {
	 InstrumentoInterface[] instrumentos= {
			 new Instrumento(new InstrumentoBean("pom,pom,pom")),
			 new Instrumento(new InstrumentoBean("tuuu,tuuu,tuuu")),
			 new Instrumento(new InstrumentoBean("nada")) };
	 
	 
	 HombreOrquesta hombreOrquesta= new HombreOrquesta(instrumentos);
	 try {
			hombreOrquesta.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Se�ores el instrumento se ha roto y lo voy a arreglar");
			e.instrumentoRoto();
			for (InstrumentoInterface instrumento : instrumentos) {
				if(instrumento.getInstrumentoBean().getSonido().equals("nada"))
					instrumento.getInstrumentoBean().setSonido("la,la,la");
			}
			System.out.println("se�ores reanudamos el concierto");
			try {
				hombreOrquesta.tocar();
			} catch (SinSonidoException e1) {
				e.getStackTrace();
			}
			
		}
		finally {
			System.out.println("se�ores gracias por venir a este teatro y esparamos veros de nuevo");
		}
	}





	}


