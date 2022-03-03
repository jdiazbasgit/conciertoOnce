package empresa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

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
		//JTable tablavehiculos = new Jtable(Vehiculo[1][3],String[3]);
		//Lista<Vehiculos>listaVehiculos = new
		try {
			Connection conexion = dameConexion();
			
			
			
			Statement instruccion= conexion.createStatement();
			ResultSet resultSet= instruccion.executeQuery("SELECT ID,MARCA,MODELO FROM VEHICULOS");
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+ " - "+resultSet.getString(2)+" - "+resultSet.getString(3));
			}
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			return vehiculos;
		}
	}
	
	//public void grabarVehiculo() {
	

	
	
}
