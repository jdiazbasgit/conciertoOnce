package once.curso.practicaSpringmvc.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
@Component

public class Hijos {
	
	@Value("2")
	private int chicos;
	@Value("4")
	private int chicas;
	
	

}
