package once.curso.practicaspringmvc.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import empresa.beans.Empresa;
import empresa.beans.Hijo;
import empresa.beans.Vehiculo;
import empresa.daos.EmpresaDAO;
import empresa.daos.HijoDAO;
import empresa.daos.VehiculoDao;
import lombok.Getter;
import lombok.Setter;

@RestController
@Getter
@Setter
public class HomeRestController {

	@Autowired
	private VehiculoDao vehiculoDao;

	@Autowired
	private HijoDAO hijoDAO;
	@Autowired
	private EmpresaDAO empresaDAO;

	
	@GetMapping("/vehiculos")
	public List<Vehiculo> getVehiculosDAO() throws SQLException {
		return vehiculoDao.dameVehiculos();
	}

	@GetMapping("/hijos")
	public List<Hijo> getHijosDAO() throws SQLException {
		return hijoDAO.dameListaHijos();

	}

	@GetMapping("/empresa")
	public List<Empresa> getEmpresasDAO() throws SQLException {
		return empresaDAO.dameEmpresas();

	}

}
