package concierto.musicos;


import java.util.List;

import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;



	public class HombreOrquestaNavidadFuncional extends Musico {

		

		
		
		public HombreOrquestaNavidadFuncional(Instrumento[] instrumentos) {
			super(instrumentos);
			
		}
		
		
		public void tocar(HombreOrquestaNavidadFuncional hombreOrquestaNavidadFuncional, Instrumento[] instrumentos) {
			
			 List.of(getInstrumentos()).stream().filter(i->{
				try {
					return i.sonar().length()>1;
				} catch (SinSonidoException e) {
					System.out.println("Se�ores el instrumento se ha roto y lo voy a arreglar");
					e.instrumentoRoto();
					
					for (Instrumento instrumento : instrumentos) {
						if(instrumento.getInstrumentoBean().getSonido().equals("nada"))
							instrumento.getInstrumentoBean().setSonido("pin, pin,  pion");
					}
					System.out.println("se�ores reanudamos el concierto");
					try {
						hombreOrquestaNavidadFuncional.tocar();
					} catch (SinSonidoException e1) {
			}
					finally {
						System.out.println("se�ores gracias por venir a este teatro y esparamos vers de nuevo");
					}
				}
				return false;
				
			})
			 .forEach(instrumento->{ try {
				System.out.println(instrumento.sonar());
			} catch (SinSonidoException e) {
				e.printStackTrace();
			} });
			 
		}


		@Override
		public void tocar() throws SinSonidoException {
			for (Instrumento instrumento: getInstrumentos()) {
				System.out.println(instrumento.sonar());
			}
			
			
			
		}
			
			
		
		
	}
	

