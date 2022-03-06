package empresa.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empresa.beans.TipoCarnet;

public class TipoCarnetDao extends ConexionDAO {

	

	public List<TipoCarnet> dameTipoCarnet() throws SQLException {
		List<TipoCarnet> tipoCarnet = new ArrayList<TipoCarnet>();
		Connection conexion = getConexion();
		Statement instruccion = conexion.createStatement();
		ResultSet resultSet = instruccion.executeQuery("SELECT ID,DEFINICION");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + " - " + resultSet.getString(2));
		}

		return tipoCarnet;
	}
}
