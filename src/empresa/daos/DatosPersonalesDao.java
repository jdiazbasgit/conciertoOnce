package empresa.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import empresa.anotaciones.Vigilado;
import empresa.beans.DatosPersonales;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

@Data
@Component
public class DatosPersonalesDao implements DatosPersonalsDaoInterface{

	private Connection conexion;

	@Vigilado
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
