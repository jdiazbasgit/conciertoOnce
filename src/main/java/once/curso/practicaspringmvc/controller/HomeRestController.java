package once.curso.practicaspringmvc.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import empresa.beans.Vehiculo;
import empresa.daos.VehiculoDao;

@RestController
//@Data
public class HomeRestController {

	@Autowired
	private VehiculoDao vehiculoDao;

	// @RequestMapping(value="/persona",method = RequestMethod.POST)
	@GetMapping("/")
	public List<Vehiculo> getVehiculoDao() throws SQLException {
		/*
		 * persona.setNombre("pepe"); persona.setApellido1("fernandez");
		 * persona.setApellido2("garcia"); persona.setDni("3455545h");
		 * 
		 * Hijos hijos= new Hijos(); hijos.setChicas(5); hijos.setChicos(2);
		 * persona.setHijos(hijos);
		 */

		return vehiculoDao.dameVehiculos();

	}

}
