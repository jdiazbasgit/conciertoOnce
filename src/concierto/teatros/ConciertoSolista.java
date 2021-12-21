package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoArk4no;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.Musico;
import concierto.musicos.MusicoArk4no;
import concierto.musicos.MusicoInterface;

public class ConciertoSolista {

	public static void main(String[] args) {


		InstrumentoInterface instrumentoArk4no = new InstrumentoArk4no("bombo, caja, bombo, caja");
		MusicoInterface musicoArk4no = new MusicoArk4no (instrumentoArk4no);
		System.out.println("bat bi hiru lau!!!");
		musicoArk4no.tocar();
		

		

	}

}
