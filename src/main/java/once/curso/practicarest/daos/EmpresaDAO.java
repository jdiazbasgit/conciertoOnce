package once.curso.practicarest.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import once.curso.practicarest.beans.Empresa;

public class EmpresaDAO extends ConexionDAO {
	
	public List<Empresa> dameListaEmpresas() throws SQLException {

		List<Empresa> listaEmpresas = new ArrayList<>();
		try (  Connection conn = getConexion(); 
				Statement instruccion = conn.createStatement()) {

			String query = "SELECT e.ID, e.NOMBRE , e.CIF  FROM empresas as e";
			ResultSet rs = instruccion.executeQuery(query);
			while (rs.next())
				listaEmpresas.add(new Empresa(rs.getInt(1), rs.getString(2), rs.getString(3)));

		}
		return listaEmpresas;

	}

}
