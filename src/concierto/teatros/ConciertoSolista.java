package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.MusicoPedro;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {

		MusicoPedro solistaPedro = new MusicoPedro(new Instrumento(new InstrumentoBean("tololoon")));
		Solista solista = new Solista(new Instrumento ("nada"));

		try {
			solistaPedro.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Señores se ha roto el intrumento, lo voy a arreglar");
			solistaPedro.getInstrumento().getInstrumentoBean().setSonido("turutuuturutu4e");
			System.out.println("Señores continuamos el concierto");
			try {
				solistaPedro.tocar();
			} catch (SinSonidoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		try {
			solista.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Señores se ha roto el intrumento, lo voy a arreglar");
			solista.getInstrumento().getInstrumentoBean().setSonido("turutuuturutu4e");
			System.out.println("Señores continuamos el concierto");
			try {
				solista.tocar();
			} catch (SinSonidoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}
}
