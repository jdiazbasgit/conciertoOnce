package once.curso.practicarest.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class HijoDAO extends ConexionDAO {

	public List<Hijo> dameListaHijos()  SQLException{
		Lista<Hijo> listaHijos = new ArrayList<>();
		
		try ( Connection conn = getConexion();
			  Statement instruccion = conn. createStatement()) { 
			
			Consulta de cadena = "SELECT h.ID,h.NUMERO_CHICOS,h.NUMERO_CHICAS FROM hijos as h";
			ResultSet rs = instruccion. executeQuery(consulta);
			
			while(rs. siguiente()) {
				Hijo hijo =

	nuevo Hijo(rs. getInt(1), rs. getInt(2), rs. getInt(3));
 listaHijos. add(hijo);
			}

}

return listaHijos;}

}
