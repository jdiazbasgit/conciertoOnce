package once.curso.practicaspringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import once.curso.practicaspringmvc.beans.Persona;

@RestController
@Data
public class HomeRestController {

	@Autowired
	private Persona persona;
	
	// Recibe un objeto Persona petición POST
	@PostMapping("/persona")
	public Persona getPersona(@RequestBody Persona persona) {
		System.out.println("\t***********  " + persona);
		return persona;
	}

	
/*	
	// Crea objeto Persona y lo devuelve formato JSON
	@GetMapping(value="/persona")
	public Persona getPersona() {
		  Persona otraPersona= new Persona();
		  otraPersona.setNombre("pepe"); otraPersona.setApellido1("fernandez");
		  otraPersona.setApellido2("garcia"); otraPersona.setDni("3455545h");
		  
		  Hijos hijos= new Hijos(); hijos.setChicas(5); hijos.setChicos(2);
		  otraPersona.setHijos(hijos);
	
		return otraPersona;
	}
*/
	
/*	
	// devuelve objeto persona habitación Spring
	@GetMapping("/persona")
	public Persona getPersona() {
		
		return persona;
	}
*/
}
