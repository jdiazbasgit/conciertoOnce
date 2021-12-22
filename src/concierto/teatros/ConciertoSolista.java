package concierto.teatros;

import concierto.instrumentos.InstrumentoPedro;
import concierto.musicos.MusicoPedro;

public class ConciertoSolista {

	public static void main(String[] args) {

		MusicoPedro solistaPedro = new MusicoPedro(new InstrumentoPedro("wuon, wan, wuon"));

		solistaPedro.tocar();
	}

}
