package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoPedro;
import concierto.musicos.MusicoPedro;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {

		MusicoPedro solistaPedro = new MusicoPedro(new InstrumentoPedro("wuon, wan, wuon"));

		Solista solista = new Solista(new Instrumento(new InstrumentoBean("sonido")));

		solistaPedro.tocar();
		solista.tocar();
	}

}
