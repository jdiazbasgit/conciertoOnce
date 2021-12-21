package concierto.teatros;
import concierto.beans.InstrumentoBean;
import concierto.musicos.MusicoJacinto;
import concierto.musicos.MusicoJavier;
import concierto.musicos.MusicoProfe;

public class ConciertoSolista {

	public static void main(String[] args) {

		InstrumentoInterface instrumentoArk4no = new InstrumentoArk4no("bombo, caja, bombo, caja");
		MusicoInterface musicoArk4no = new MusicoArk4no (instrumentoArk4no);
		System.out.println("bat bi hiru lau!!!");
		musicoArk4no.tocar();

		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean("pom, pom, pom", "nueva marca", 500);
		InstrumentoInterface tambor = new InstrumentoJacinto(instrumentoBeanTambor);
		MusicoJacinto jacinto = new MusicoJacinto(tambor);
		jacinto.setInstrumentoInterface(tambor);
		MusicoJavier solista = new MusicoJavier(tambor);
		solista.setInstrumentoInterface(tambor);

		jacinto.tocar();
		
		
		
		InstrumentoInterface instrumentoProfe= new InstrumentoProfe("sonido de instrumento profe");
		MusicoInterface musicoProfe= new MusicoProfe(instrumentoProfe);
		musicoProfe.tocar();

		
		

	}

}
