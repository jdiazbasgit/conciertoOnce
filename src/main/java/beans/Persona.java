package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Persona {
	@Value("nombreSpringHabitaci�n")
	private String nombre;
	@Value("apellido1SpringHabitaci�n")
	private String apellido1;
	@Value("apellido2SpringHabitaci�n")
	private String napellido2;
	@Value("dniSpringHabitaci�n")
	private String dni;
	
	@Autowired
	private Hijos hijos;
}
