package concierto.teatro;


import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
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
		 try {
				hombreOrquesta.tocar();
			} catch (SinSonidoException e) {
				System.out.println("Señores el instrumento se ha roto y lo voy a arreglar");
				e.instrumentoRoto();
				for (InstrumentoInterface instrumento : instrumentos) {
					if(instrumento.getInstrumentoBean1().getSonido().equals("nada"))
						instrumento.getInstrumentoBean2().setSonido("pin, pin,  pion");
				}
				System.out.println("señores reanudamos el concierto");
				try {
					hombreOrquesta.tocar();
				} catch (SinSonidoException e1) {
					
				}
				
			}
			finally {
				System.out.println("señores gracias por venir a este teatro y esparamos veros de nuevo");
			}
		}

	}
