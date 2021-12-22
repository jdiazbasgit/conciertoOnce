package concierto.teatros;

import concierto.beans.InstrumentoBean;
import concierto.instrumentos.Instrumento;

import concierto.instrumentos.InstrumentoArk4no;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoJacinto;
import concierto.instrumentos.InstrumentoJavier;
import concierto.instrumentos.InstrumentoProfe;
import concierto.musicos.MusicoArk4no;

import concierto.instrumentos.InstrumentoAlmu2;
import concierto.instrumentos.InstrumentoAntonio;
import concierto.instrumentos.InstrumentoArk4no;
import concierto.instrumentos.InstrumentoHortensia;
import concierto.instrumentos.InstrumentoInterface;
import concierto.instrumentos.InstrumentoJacinto;
import concierto.instrumentos.InstrumentoJavier;
import concierto.instrumentos.InstrumentoMar;
import concierto.instrumentos.InstrumentoMiguelAngel;
import concierto.instrumentos.InstrumentoPedro;
import concierto.instrumentos.InstrumentoProfe;
import concierto.instrumentos.InstrumentoRicardo;
import concierto.instrumentos.InstrumentoSara;
import concierto.instrumentos.InstrumentoSergio;
import concierto.musicos.Musico;
import concierto.musicos.MusicoAlmu2;
import concierto.musicos.MusicoAntonio;
import concierto.musicos.MusicoArk4no;
import concierto.musicos.MusicoCarlos;
import concierto.musicos.MusicoHortensia;

import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoJacinto;
import concierto.musicos.MusicoJavier;
import concierto.musicos.MusicoJuan;

import concierto.musicos.MusicoMar;
import concierto.musicos.MusicoMiguelAngel;
import concierto.musicos.MusicoPedro;

import concierto.musicos.MusicoProfe;
import concierto.musicos.MusicoRicardo;
import concierto.musicos.MusicoSara;
import concierto.musicos.MusicoSergio;

public class ConciertoSolista {

	public static void main(String[] args) {
		InstrumentoInterface tamborMar = new InstrumentoMar("Mar => pom, pom ,pom");
		MusicoInterface solistaMar = new MusicoMar(tamborMar);
		solistaMar.tocar();
		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean("pom, pom ,pom en bean");
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);

		// mi musico

		InstrumentoBean instrumentoBeanAntonio = new InstrumentoBean("Soy el instrumento que toca Antonio");
		InstrumentoInterface antonio = new InstrumentoAntonio(instrumentoBeanAntonio);

		MusicoAntonio solistaAntonio = new MusicoAntonio(antonio);

		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");

		instrumentoBeanTambor.setMarca("nueva marca");

		instrumentoBeanTambor.setPrecio(500);

		Musico solista = new Musico(tambor);

		InstrumentoBean instrumentoBeanJuan = new InstrumentoBean("Juan, Juan, Juan");
		InstrumentoInterface juan = new Instrumento(instrumentoBeanJuan);

		InstrumentoBean instrumentoBeanCarlos = new InstrumentoBean();
		instrumentoBeanCarlos.setSonido("pom, pom ,pom en bean de carlos");
		instrumentoBeanCarlos.setMarca("nueva marca de carlos");
		instrumentoBeanCarlos.setPrecio(3000);
		InstrumentoInterface intrumentocarlos = new Instrumento(instrumentoBeanCarlos);

		MusicoCarlos carlos = new MusicoCarlos(intrumentocarlos);

		InstrumentoInterface instrumentoArk4no = new InstrumentoArk4no("bombo, caja, bombo, caja");
		MusicoInterface musicoArk4no = new MusicoArk4no(instrumentoArk4no);
		System.out.println("bat bi hiru lau!!!");
		musicoArk4no.tocar();

		MusicoJacinto jacinto = new MusicoJacinto(tambor);
		jacinto.setInstrumentoInterface(tambor);

		solista.setInstrumentoInterface(tambor);

		InstrumentoInterface hang = new InstrumentoPedro("wuon, wan, wuon");
		MusicoInterface solistaPedro = new MusicoPedro(hang);

		solista.tocar();
		solistaPedro.tocar();

		carlos.setInstrumentoInterface(intrumentocarlos);

		solista.tocar();

		solistaAntonio.tocar();

		carlos.tocar();

		InstrumentoInterface instrumentoAlmu2 = new InstrumentoAlmu2("sonido instrumento almu");
		MusicoInterface musicoAlmu2 = new MusicoAlmu2(instrumentoAlmu2);
		musicoAlmu2.tocar();

		jacinto.tocar();

		// prueba para sara

		InstrumentoInterface instrumentoSara = new InstrumentoSara("sonido de instrumento de Sara");
		MusicoInterface musicoSara = new MusicoSara(instrumentoSara);
		musicoSara.tocar();

		InstrumentoInterface instrumentoHortensia = new InstrumentoHortensia("sonido de instrumento Hortensia");
		MusicoInterface musicoHortensia = new MusicoHortensia(instrumentoHortensia);

		musicoHortensia.tocar();
		InstrumentoInterface instrumentoMiguelAngel = new InstrumentoMiguelAngel("Sonido de instrumento Miguel Angel");
		MusicoInterface musicoMiguelAngel = new MusicoMiguelAngel(instrumentoMiguelAngel);

		musicoMiguelAngel.tocar();

		MusicoJuan musicoJuan = new MusicoJuan(juan);
		musicoJuan.setInstrumentoInterface(juan);

		InstrumentoInterface instrumentoSergio = new InstrumentoSergio("sonido de instrumento msergio");
		MusicoInterface musicoSergio = new MusicoSergio(instrumentoSergio);

		musicoSergio.tocar();
		solista.tocar();
		InstrumentoInterface instrumentoRicardo = new InstrumentoRicardo("sonido de instrumentoRicardo");
		MusicoInterface musicoRicardo = new MusicoRicardo(instrumentoRicardo);
		musicoRicardo.tocar();
		musicoJuan.tocar();
		jacinto.tocar();
		InstrumentoInterface instrumentoJavier = new InstrumentoJavier("sonido de instrumento Javier");
		MusicoInterface musicoJavier = new MusicoJavier(instrumentoJavier);
		musicoJavier.tocar();
		// hola de nuevo otra vez va la tercera
		InstrumentoInterface instrumentoProfe = new InstrumentoProfe("sonido de instrumento profe");
		MusicoInterface musicoProfe = new MusicoProfe(instrumentoProfe);
		musicoProfe.tocar();

	}

}
