package once.curso.practicaspringmvc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Persona {

	@Value("nombreSpring")
	private String nombre;
	@Value("apellido1Spring")
	private String apellido1;
	@Value("apellido2Spring")
	private String apellido2;
	@Value("dniSpring")
	private String dni;
	
	@Autowired
	private Hijos hijos;
	
}
