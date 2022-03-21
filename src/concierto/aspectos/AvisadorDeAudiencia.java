package concierto.aspectos;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
		
	}
	
	
	
	@AfterReturning("sujetador()")
	public void encenderMoviles() {
		
	}

	@AfterThrowing("sujetador()")
	public void instrumentoRoto() {
		System.out.println("el instrumento se ha roto, todo el mundo a casa");
	}
}
