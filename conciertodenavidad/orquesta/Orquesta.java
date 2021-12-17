package conciertodenavidad.orquesta;

import conciertodenavidad.instrumentos.InstrumentoInterfaz;
import conciertodenavidad.musico.Musico;
import conciertodenavidad.excepciones.*;

public class Orquesta implements OrquestaInterfaz {

	private Musico[] musicos;
	private InstrumentoInterfaz[] instrumentos;


	public Orquesta() {
		super();
	}

	public Orquesta(Musico[] musicos, InstrumentoInterfaz[] instrumentos) {
		super();
		this.musicos = musicos;
		this.instrumentos = instrumentos;
	}

	public Musico[] getMusicos() {
		return musicos;
	}

	public void setMusicos(Musico[] musicos) {
		this.musicos = musicos;
	}

	public InstrumentoInterfaz[] getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(InstrumentoInterfaz[] instrumentos) {
		this.instrumentos = instrumentos;
	}

	@Override
	public void darConcierto() throws OrquestaException{
		if (instrumentos == null || instrumentos.length < 1) 
			throw new OrquestaException("No hay instrumentos para tocar");

		if (musicos == null || musicos.length < 1) 
			throw new OrquestaException("No hay músicos para dar el concierto");
		
		for (int i=0; i < instrumentos.length && i < musicos.length; i++) {
			musicos[i].setInstrumento(instrumentos[i]);
			System.out.println(musicos[i].tocarInstrumento());
		}

	}

}
