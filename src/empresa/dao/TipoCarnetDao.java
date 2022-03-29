package empresa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empresa.beans.TipoCarnet;

public class TipoCarnetDao extends EmpresaDao {

	

	public List<TipoCarnet> dameTipoCarnet() throws SQLException {
		List<TipoCarnet> tipoCarnet = new ArrayList<TipoCarnet>();
		Connection conexion = dameConexion();
		Statement instruccion = conexion.createStatement();
		ResultSet resultSet = instruccion.executeQuery("SELECT ID,descripcion from tipo_carnet" );
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + " - " + resultSet.getString(2));
			TipoCarnet carnet= new TipoCarnet();
			carnet.setId(resultSet.getInt(1));
			carnet.setDescripcion(resultSet.getString(2));
		    tipoCarnet.add(carnet);
		}

		return tipoCarnet;
	}


}
