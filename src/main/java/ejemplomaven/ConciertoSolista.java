package ejemplomaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.SinSonidoException;
import concierto.musicos.Solista;

public class ConciertoSolista {

	private static final String SPRING_CONF_XML_FILE="spring.xml";
	public static void main(String[] args) {
	
		//try (ConfigurableApplicationContext habitacion=new ClassPathXmlApplicationContext(SPRING_CONF_XML_FILE)){
		try {
			ApplicationContext habitacion=new ClassPathXmlApplicationContext(SPRING_CONF_XML_FILE);
			Solista solista= habitacion.getBean(Solista.class);		
			solista.tocar();
		} catch (SinSonidoException e) {
			e.printStackTrace();
		}
	}

}
