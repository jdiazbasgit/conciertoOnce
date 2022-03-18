package ejemploMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.SinSonidoException;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		ApplicationContext habitacion= new ClassPathXmlApplicationContext("springAnotaciones.xml");
		Solista solista= (Solista) habitacion.getBean("solista");
		//Solista solista1= (Solista) habitacion.getBean("solista1");
		HombreOrquesta hombreOrquesta= (HombreOrquesta) habitacion.getBean("hombreOrquesta");
		try {
			solista.getInstrumentoInterface().getInstrumentoBeanPapa().setSonido("sonido cambiado a la trompeta");
			solista.tocar();
			
			//solista1.tocar();
			
			System.out.println("toca el hombre orquesta");
			
			hombreOrquesta.tocar();
		} catch (SinSonidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
