package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquestaEjercicio {

		public static void main(String[] args) {
		 InstrumentoInterface[] instrumentos= {
				 new Instrumento(new InstrumentoBean("tim,tim,tim")),
				 new Instrumento(new InstrumentoBean("tan,tan,tan")),
				 new Instrumento(new InstrumentoBean("chin,chin,chin")), 
		         new Instrumento(new InstrumentoBean("flu,flu,flu")),
		         new Instrumento(new InstrumentoBean("cha,cha,cha")),
		         new Instrumento(new InstrumentoBean("tsh,tsh,tsh")),
		         new Instrumento(new InstrumentoBean("cloc,cloc,cloc")),
				 new Instrumento(new InstrumentoBean("tilin,tilin,tilin")),
				 new Instrumento(new InstrumentoBean("la,la,la")),
				 new Instrumento(new InstrumentoBean("da,de,di,do,du"))};
		 HombreOrquesta hombreOrquesta= new HombreOrquesta(instrumentos);
		 hombreOrquesta.tocar();

		}

	}