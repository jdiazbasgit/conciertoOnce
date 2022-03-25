package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Persona {
	@Value("nombreSpringHabitación")
	private String nombre;
	@Value("apellido1SpringHabitación")
	private String apellido1;
	@Value("apellido2SpringHabitación")
	private String napellido2;
	@Value("dniSpringHabitación")
	private String dni;
	
	@Autowired
	private Hijos hijos;
}
