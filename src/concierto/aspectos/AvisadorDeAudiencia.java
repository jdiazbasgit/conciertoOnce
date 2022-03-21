package concierto.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class AvisadorDeAudiencia {

	
	@Pointcut("execution( @concierto.anotaciones.Vigilado * *.*(..))")
	public void sujetador() {
		
	}
	
	@Before("sujetador()")
	public void apagarMoviles() {
		System.out.println("SE�ORES APAGUEN LOS MOVILES QUE VA A EMPEZAR EL CONCIERTO");
	}
	
	
	
	@After("sujetador()")
	public void encenderMoviles() {
		System.out.println("SE�ORES EL CONCIERTO HA TERMINADO, PUIEDEN ENCENDER LOS MOVILES");
	}
}
