package empresa.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import empresa.beans.EmpleadoVehiculo;


public class EmpleadoVehiculoDAO  extends ConexionDAO {
	
	public String[] getColumnasEmpleadoVehiculo() {
		return new String[] {"NOMBRE","DNI","TELEFONO","MARCA","MODELO"};
	}	
	
	
	public  List<EmpleadoVehiculo> dameHijos() throws SQLException{
		Connection conn = null;
		List<EmpleadoVehiculo> lista_empleados_vehiculos = new ArrayList<EmpleadoVehiculo>();
		try {
		
		 
		    conn =  getConexion();
			Statement instruccion = conn.createStatement();
			
			String query = "SELECT e.NOMBRE,e.DNI,e.TELEFONO,v.MARCA,v.MODELO"
					+ " FROM empleados as e, vehiculos as v , empleados_has_vehiculos ev"
					+ " WHERE e.ID = ev.empleados_ID AND v.ID = ev.vehiculos_ID"
					+ " ORDER BY  e.NOMBRE,v.MARCA";
			
			
			ResultSet rs = instruccion.executeQuery(query);
			
			while(rs.next()) {
				EmpleadoVehiculo empleadoVehiculo = new EmpleadoVehiculo(rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
			    lista_empleados_vehiculos.add(empleadoVehiculo);
			}
			
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
			
		 return lista_empleados_vehiculos;
			
	}
	
	



}
