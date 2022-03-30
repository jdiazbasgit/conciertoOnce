package once.curso.basededatos.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import empresa.beans.TipoCarnet;
import empresa.dao.TipoCarnetDao;
import lombok.Data;

@Data
@RestController
public class HomeRestController {
	@Autowired(required = true)
	private TipoCarnetDao tipocarnetdao;
	
	@GetMapping("/TipodeCarnetDao")
	public List<TipoCarnet> getcarnetDao() throws SQLException {
		
		
		return tipocarnetdao.dameTipoCarnet();
		
	}

}