package concierto.aspectos;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MostrarTrazaAspecto {

	
	@Pointcut("execution( @concierto.anotaciones.Traza * *.*(..))")
	public void sujetador() {
		
	}
	
	@AfterThrowing("sujetador()")
	public void instrumentoRoto() {
		System.out.println("el instrumento se ha roto, todo el mundo a casa");
	}

}
