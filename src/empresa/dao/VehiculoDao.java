package empresa.dao;

import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.SQLException;
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
	
	public  List<Vehiculo> dameVehiculos() {
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		try {
			Connection conexion = dameConexion();
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			return vehiculos;
		}
	}
	

	
	
}
