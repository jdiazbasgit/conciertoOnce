package concierto.aspectos;

import org.aspectj.lang.annotation.After;
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
		
	}
	
	
	
	@After("sujetador()")
	public void encenderMoviles() {
		
	}
	
	
}
