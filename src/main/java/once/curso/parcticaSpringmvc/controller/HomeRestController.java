package once.curso.parcticaSpringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import once.curso.practicaSpringmvc.beans.Hijos;
import once.curso.practicaSpringmvc.beans.Persona;

@RestController
public class HomeRestController {
	
	@Autowired
	private Persona persona;
	@RequestMapping(value="/persona",method=RequestMethod.POST)
	public Persona getPersona() {
		Persona persona = new Persona();
		
		persona.setNombre("pepe");
		persona.setApellido1("lopez");
		persona.setApellido2("garcia");
		persona.setDni("3242443");
		
		Hijos hijos = new Hijos();
		hijos.setChicos(6);
		hijos.setChicas(3);
		
		persona.setHijos(hijos);
	
		
		
		
		return persona;
		
		
	}

}
