package concierto.teatros;
import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.musicos.Musico;

public class ConciertoSolista {

	public static void main(String[] args) {

		Musico solista = new Musico(new Instrumento(new InstrumentoBean("bat bi hiru lau!!!")));
		solista.tocar();

	}

}
