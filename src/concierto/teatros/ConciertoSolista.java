package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.excepciones.SinSonidoException;
import concierto.instrumentos.Instrumento;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {

		Solista solista = new Solista(new Instrumento(new InstrumentoBean("nada")));
//		Solista solista1 = new Solista(new Instrumento(new InstrumentoBean("blam blam")));
//		Solista solista2 = new Solista(new Instrumento(new InstrumentoBean("blum blum")));
//		Solista solista3 = new Solista(new Instrumento(new InstrumentoBean("fuaa")));
//		Solista solista4 = new Solista(new Instrumento(new InstrumentoBean("plim")));
//		Solista solista5 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
//		Solista solista6 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
//		Solista solista7 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
//		Solista solista8 = new Solista(new Instrumento(new InstrumentoBean("sonido")));
//		Solista solista9 = new Solista(new Instrumento(new InstrumentoBean("sonido")));

		try {
			solista.tocar();
		} catch (SinSonidoException e) {
			System.out.println("Se�ores el instrumento se ha roto y se ha acabado el concieto");
		}

	}

}
