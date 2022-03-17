package ejemploMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.SinSonidoException;
import concierto.musicos.Solista;

public class ConciertoSolista {

	private static ApplicationContext habitacion;

	public static void main(String[] args) {
		
		habitacion = new ClassPathXmlApplicationContext("spring.xml");
		Solista solista= (Solista) habitacion.getBean("solista");
		try {
			solista.tocar();
		} catch (SinSonidoException e) {
			e.printStackTrace();
		}
	}

}
