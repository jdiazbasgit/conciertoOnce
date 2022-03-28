package once.curso.practicaspringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import once.curso.practicaspringmvc.beans.Hijos;
import once.curso.practicaspringmvc.beans.Persona;

@RestController
@Data
public class HomeRestController {

	@Autowired
	private Persona persona;
	

	// @RequestMapping(value="/persona",method = RequestMethod.POST)
	@PostMapping("/persona")
	public Persona getPersona(@RequestBody Persona persona) {
		System.out.println(getPersona().getHijos());
		/*
		 * persona.setNombre("pepe"); persona.setApellido1("fernandez");
		 * persona.setApellido2("garcia"); persona.setDni("3455545h");
		 * 
		 * Hijos hijos= new Hijos(); hijos.setChicas(5); hijos.setChicos(2);
		 * persona.setHijos(hijos);
		 */
		persona.setNombre(persona.getNombre() + "-------------");
		return persona;
		
	}

}
