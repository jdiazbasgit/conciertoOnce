package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoPedro;
import concierto.musicos.MusicoPedro;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) throws SinSonidoException {

		MusicoPedro solistaPedro = new MusicoPedro(new InstrumentoPedro("nada"));

		Solista solista = new Solista(new Instrumento(new InstrumentoBean("tololoon")));

		solistaPedro.tocar();
		try {
			solista.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Señores el instrumento se ha roto y se ha acabado el concierto");
		}
	}

}
