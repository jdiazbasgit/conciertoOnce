package empresa.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import empresa.beans.Empresa;

@Compornte
public class EmpresaDAO extends ConexionDAO {

	public String[] getColumnasEmpresa() {
		return new String[] { "ID", "NOMBRE", "CIF" };
	}

	@Bean
	public List<Empresa> dameListaEmpresas() throws SQLException {

		List<Empresa> listaEmpresas = new ArrayList<>();
		try (Connection conn = getConexion(); Statement instruccion = conn.createStatement()) {

			String query = "SELECT e.ID, e.NOMBRE , e.CIF  FROM empresas as e";
			ResultSet rs = instruccion.executeQuery(query);
			while (rs.next())
				listaEmpresas.add(new Empresa(rs.getInt(1), rs.getString(2), rs.getString(3)));

		}
		return listaEmpresas;

	}
	
	@Bean
	public String[][] dameArrayEmpresas() throws SQLException {

		List<Empresa> listaEmpresas = this.dameListaEmpresas();
		String[][] arrayEmpresas = new String[listaEmpresas.size()][this.getColumnasEmpresa().length];
		int numeroFila=0;
		for (Empresa empresa : listaEmpresas) {
			arrayEmpresas[numeroFila][0]=String.valueOf(empresa.getId());
			arrayEmpresas[numeroFila][1]=empresa.getNombre();
			arrayEmpresas[numeroFila][2]=empresa.getCif();
			numeroFila++;
		}
		return arrayEmpresas;

	}

	public void grabaEmpresas(Empresa empresa) throws SQLException {

		String query = "INSERT INTO empresas (NOMBRE,CIF) values(?,?) ";
		try (Connection conn = getConexion(); PreparedStatement preparedStatement = conn.prepareStatement(query)) {

			preparedStatement.setString(1, empresa.getNombre());
			preparedStatement.setString(2, empresa.getCif());
			preparedStatement.execute();

		}
	}

}
