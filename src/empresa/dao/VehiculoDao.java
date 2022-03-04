package empresa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empresa.beans.Vehiculo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class VehiculoDao extends EmpresaDao {
	
	private Vehiculo vehiculo;
	

	public VehiculoDao(Vehiculo vehiculo) {
		super();
		this.vehiculo = vehiculo;
	}
	
	@SuppressWarnings("finally")
	public  List<Vehiculo> dameVehiculos() {
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Vehiculo vehiculo = new Vehiculo();
	
		try {
			Connection conexion = dameConexion();
		    Statement instruccion= conexion.createStatement();
			ResultSet resultSet= instruccion.executeQuery("SELECT ID,MARCA,MODELO FROM VEHICULOS");
			while(resultSet.next()) {
				vehiculo.setId(resultSet.getInt(1));
				vehiculo.setMarca(resultSet.getString(2));
				vehiculo.setModelo(resultSet.getString(3));
				vehiculos.add(vehiculo);
			}
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			return vehiculos;
		}
	}

	

	
	
}
