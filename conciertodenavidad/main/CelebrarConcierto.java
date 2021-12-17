package conciertodenavidad.main;

import conciertodenavidad.instrumentos.InstrumentoInterfaz;
import conciertodenavidad.excepciones.OrquestaException;
import conciertodenavidad.instrumentos.Instrumento;
import conciertodenavidad.musico.Musico;
import conciertodenavidad.orquesta.Orquesta;

/**
 * @author malmamor
 *
 */
public class CelebrarConcierto {
	
	private CelebrarConcierto() {
	}

	public static void main(String[] args) {
		System.out.println("\n\t\tEmpieza el Concierto...\n");
		try {
			InstrumentoInterfaz guitarra = new Instrumento("Guitarra => ra, ra, raaaa...");
			InstrumentoInterfaz piano = new Instrumento("Piano => piano, pianooo...");
			InstrumentoInterfaz trompeta = new Instrumento("Trompeta => tararí, tararí...");
			InstrumentoInterfaz[] instrumentos = { guitarra, trompeta, piano };
			
			Musico[] musicos = { new Musico(), new Musico(), new Musico()};
			// musicos = {};
			// musicos = null;
			// instrumentos = null;
			// instrumentos = {};
			
			new Orquesta(musicos, instrumentos).darConcierto();
			
		} catch (OrquestaException e){
			System.out.println("\n\t***  Error => " + e.getMessage() + "  ***\n");
		}finally {		
			System.out.println("\n\t\tConcierto Finalizado");
		} 
	}
}
