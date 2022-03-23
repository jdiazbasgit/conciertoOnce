package ejemplomaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import concierto.configuracion.Configuracion;
import concierto.excepciones.SinSonidoException;
import concierto.musicos.MusicoInterface;

public class ConciertoSolista {

	public static void main(String[] args) {

		// ApplicationContext habitacion= new
		// ClassPathXmlApplicationContext("springAnotaciones.xml");
		ApplicationContext habitacion = new AnnotationConfigApplicationContext(Configuracion.class);
		MusicoInterface solista = (MusicoInterface) habitacion.getBean("solista");
		MusicoInterface hombreOrquesta = (MusicoInterface) habitacion.getBean("hombreOrquesta");
		try {
			solista.tocar();
			hombreOrquesta.tocar();
		} catch (SinSonidoException e) {
			// e.printStackTrace();
		}
	}

}
