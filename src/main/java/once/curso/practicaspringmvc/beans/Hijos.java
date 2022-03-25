package once.curso.practicaspringmvc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Hijos {

	@Value("55")
	private int chicos;
	
	@Value("66")
	private int chicas;
}
