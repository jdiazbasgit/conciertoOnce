package empresa.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empresa.beans.DatosPersonales;
import lombok.Data;

@Data
public class DatosPersonalesDao implements DatosPersonalsDaoInterface{

	private Connection conexion;

	public List<DatosPersonales> dameDatosPersonales() throws SQLException {
		List<DatosPersonales> datosPersonales = new ArrayList<>();

		Connection conexion = getConexion();
		Statement instruccion = conexion.createStatement();
		ResultSet resultSet = instruccion.executeQuery("SELECT ID from datos_personales");
		while (resultSet.next()) {

			System.out.println(resultSet.getString(1) );
		}

		return datosPersonales;
	}
}
