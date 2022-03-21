package ejemploMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.SinSonidoException;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.MusicoInterface;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		ApplicationContext habitacion= new ClassPathXmlApplicationContext("springAnotaciones.xml");
		MusicoInterface solista= (MusicoInterface) habitacion.getBean("solista");
		//Solista solista1= (Solista) habitacion.getBean("solista1");
		MusicoInterface hombreOrquesta= (MusicoInterface) habitacion.getBean("hombreOrquesta");
		try {
			solista.tocar();
			
			
			hombreOrquesta.tocar();
		} catch (SinSonidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
