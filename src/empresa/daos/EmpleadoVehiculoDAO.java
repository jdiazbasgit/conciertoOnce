package empresa.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import empresa.beans.Empleado;
import empresa.beans.EmpleadoVehiculo;
import empresa.beans.Vehiculo;

public class EmpleadoVehiculoDAO extends ConexionDAO {

	public String[] getColumnasEmpleadoVehiculo() {
		return new String[] { "NOMBRE", "DNI", "TELEFONO", "MARCA", "MODELO" };
	}

	public List<EmpleadoVehiculo> dameListaEmpleadoVehiculos() throws SQLException {
		Map<Empleado,List<Vehiculo>> resultado = new HashMap<>();
		List<EmpleadoVehiculo> listaEmpleadosVehiculos = new ArrayList<>();
		try (Connection conn = getConexion(); Statement instruccion = conn.createStatement()) {

			String query = "SELECT e.ID,e.NOMBRE,e.DNI,e.TELEFONO,v.MARCA,v.MODELO"
					     + " FROM empleados as e, vehiculos as v , empleados_has_vehiculos ev"
					     + " WHERE e.ID = ev.empleados_ID AND v.ID = ev.vehiculos_ID" + " ORDER BY  e.NOMBRE,v.MARCA";

			ResultSet rs = instruccion.executeQuery(query);

			while (rs.next()) { 
				int idempleado=rs.getInt(1);
				listaEmpleadosVehiculos.add(
						
						new EmpleadoVehiculo(idempleado,rs.getString(2), rs.getString(3),
											 rs.getString(4), new ArrayList<Vehiculo>()) 
				);
			}
		}

		return listaEmpleadosVehiculos;
	}
	
	public String[][] dameArrayEmpleadoVehiculos() throws SQLException {
		List<EmpleadoVehiculo> listaEmpleadoVehiculos = this.dameListaEmpleadoVehiculos();	
		String[][] arrayStringEmpleadoVehiculos = 
				new String[listaEmpleadoVehiculos.size()][this.getColumnasEmpleadoVehiculo().length];
		int numeroFila=0;
		for (EmpleadoVehiculo empleadoVehiculo : listaEmpleadoVehiculos) {
			arrayStringEmpleadoVehiculos[numeroFila][0]=String.valueOf(empleadoVehiculo.getId());
			arrayStringEmpleadoVehiculos[numeroFila][1]=empleadoVehiculo.getNombre();
			arrayStringEmpleadoVehiculos[numeroFila][2]=empleadoVehiculo.getDni();
			arrayStringEmpleadoVehiculos[numeroFila][3]=empleadoVehiculo.getTelefono();
			//arrayStringEmpleadoVehiculos[numeroFila][3]=empleadoVehiculo.getMarca();
			//arrayStringEmpleadoVehiculos[numeroFila][4]=empleadoVehiculo.getModelo();
			numeroFila++;
		}
		return arrayStringEmpleadoVehiculos;
	}

}
