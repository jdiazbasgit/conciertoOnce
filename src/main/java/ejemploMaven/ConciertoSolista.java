package ejemploMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.SinSonidoException;
import concierto.musicos.MusicoInterface;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		ApplicationContext habitacion= new ClassPathXmlApplicationContext("springAnotaciones.xml");
		MusicoInterface solista= (MusicoInterface) habitacion.getBean("solista");
		try {
			solista.tocar();
		} catch (SinSonidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
