

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConciertoSolista {
	
	ApplicationContext habitacion= new ClassPathXmlApplicationContext("spring.xml");
	Solista solista= (Solista) habitacion.getBean("solista");
	try {
		solista.tocar();
	} catch (SinSonidoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
