package concierto.teatros;

import concierto.beans.InstrumentoBean;

import concierto.instrumentos.InstrumentoInterface;

import concierto.instrumentos.InstrumentoRicardo;

import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoRicardo;


import concierto.musicos.MusicoJuan;
import concierto.instrumentos.InstrumentoJavier;
import concierto.musicos.MusicoInterface;
import concierto.musicos.MusicoJacinto;
import concierto.musicos.MusicoJavier;
import concierto.musicos.MusicoProfe;



public class ConciertoSolista {

	public static void main(String[] args) {


		InstrumentoBean instrumentoBeanTambor = new InstrumentoBean();
		instrumentoBeanTambor.setSonido("pom, pom ,pom en bean");

		

		instrumentoBeanTambor.setMarca("nueva marca");
		
		
		instrumentoBeanTambor.setPrecio(500);
		InstrumentoInterface tambor = new Instrumento(instrumentoBeanTambor);


		
		Musico solista = new Musico(tambor);

		
		InstrumentoBean instrumentoBeanJuan = new InstrumentoBean();
		instrumentoBeanJuan.setSonido("Juan, Juan, Juan");
		InstrumentoInterface juan = new Instrumento(instrumentoBeanJuan);
		

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
		MusicoJuan musicoJuan = new MusicoJuan(juan);
		musicoJuan.setInstrumentoInterface(juan);


		solista.tocar();

		InstrumentoInterface instrumentoRicardo= new InstrumentoRicardo("sonido de instrumentoRicardo");
		MusicoInterface musicoRicardo= new MusicoRicardo(instrumentoRicardo);
		musicoRicardo.tocar();

		musicoJuan.tocar();
		jacinto.tocar();

	
		
		InstrumentoInterface instrumentoJavier = new InstrumentoJavier("sonido de instrumento Javier");
		MusicoInterface musicoJavier = new MusicoJavier(instrumentoJavier);
		musicoJavier.tocar();
		
		//hola de nuevo otra vez va la tercera
		InstrumentoInterface instrumentoProfe= new InstrumentoProfe("sonido de instrumento profe");
		MusicoInterface musicoProfe= new MusicoProfe(instrumentoProfe);
		musicoProfe.tocar();

		
	
	}

}
