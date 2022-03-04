package empresa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empresa.beans.DatosPersonales;
import empresa.beans.Vehiculo;
import lombok.Data;

public class DatosPersonalesDao extends EmpresaDao {
	
	private DatosPersonales datosPersonales;

	public DatosPersonalesDao(DatosPersonales datosPersonales) {
		super();
		this.datosPersonales = datosPersonales;
	}
	
	public  List<DatosPersonales> dameDatosPersonales() {
		List<DatosPersonales> datosPersonales=new ArrayList<>();
		
		try {
			Connection conexion = dameConexion();
		    Statement instruccion= conexion.createStatement();
			ResultSet resultSet= instruccion.executeQuery("SELECT ID,ESTADO CIVIL,HIJOS");
			while(resultSet.next()) {
			
			}
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			return datosPersonales;
		}
	}
}
	
