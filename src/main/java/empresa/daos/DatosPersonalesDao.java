package empresa.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empresa.beans.DatosPersonales;

public class DatosPersonalesDao extends ConexionDAO {
	


	public  List<DatosPersonales> dameDatosPersonales() throws SQLException {
		List<DatosPersonales> datosPersonales=new ArrayList<>();
		
			Connection conexion = getConexion();
		    Statement instruccion= conexion.createStatement();
			ResultSet resultSet= instruccion.executeQuery("SELECT ID,ESTADO CIVIL,HIJOS");
			while(resultSet.next()) {
				
			System.out.println(resultSet.getString(1)+ " - "+resultSet.getString(2)+" - "+resultSet.getDate(3));
			}
			
			return datosPersonales;
		}
	}

	
