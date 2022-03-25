package once.curso.springsession.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beans.Hijos;
import beans.Persona;
import lombok.Data;

@RestController
@Data
public class HomeRestController {
	@Autowired
	private Persona persona;
	
	// enviar datos formato JSON
	@RequestMapping(value="/persona")
	public Persona getPersona() {
		
		  Persona persona= new Persona(); 
		  persona.setNombre("Pepe");
		  persona.setApellido1("Fernández"); 
		  persona.setApellido1("García");
		  persona.setDni("3455545h");
		  
		  Hijos hijos=new Hijos(); 
		  hijos.setChicas(5); 
		  hijos.setChicas(2);
		  persona.setHijos(hijos);
		  
		  return persona; 
		 
	}
	
/*
	// recibir datos formato JSON
	@RequestMapping(value="/persona", method=RequestMethod.POST)
	public Persona getPersona(@RequestBody Persona persona) {
	
		persona.setNombre(persona.getNombre()+"-------------------");
		return persona;
	}
*/

	/*
		// ahora los datos que pasamos como parámetro son los de la habitación
		@PostMapping("/persona")
		public Persona getPersona(Persona persona) {
		
			persona.setNombre(persona.getNombre()+"-------------------");
			return persona;
		}
		
	*/
}
