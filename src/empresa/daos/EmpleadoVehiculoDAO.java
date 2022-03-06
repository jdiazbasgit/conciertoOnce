package empresa.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import empresa.beans.EmpleadoVehiculo;
import empresa.beans.Vehiculo;

public class EmpleadoVehiculoDAO extends ConexionDAO {
	private static final String QUERY_EMPLEADOS=
			   "SELECT DISTINCT e.ID, e.NOMBRE, e.DNI,e.TELEFONO "
		     + "FROM empleados e, empleados_has_vehiculos ev "
		     + "WHERE e.ID = ev.empleados_ID";
	private static final String QUERY_VEHICULOS=
				"SELECT v.ID, v.MARCA, v.MODELO, v.TIPO_CARNET_ID "
			  + "FROM empleados_has_vehiculos ev, vehiculos v "
			  + "WHERE ? = ev.empleados_ID "
			  + "AND v.ID = ev.vehiculos_ID";
	public static final String[] COLUMNAS_EMPLEADO={ "ID", "NOMBRE", "DNI", "TELEFONO"};
	public static final String[] COLUMNAS_VEHICULO={ "ID", "MARCA", "MODELO" };	
	 	
	public List<EmpleadoVehiculo> dameListaEmpleadoVehiculos() throws SQLException {

		List<EmpleadoVehiculo> listaEmpleados = new ArrayList<>();
		
		try (Connection conn = getConexion(); 
			 Statement instruccion = conn.createStatement();
			 PreparedStatement vehiculosByEmpleado = conn.prepareStatement(QUERY_VEHICULOS)) {			     
		
			ResultSet rsEmpleados = instruccion.executeQuery(QUERY_EMPLEADOS);
			int idEmpleado;
			while (rsEmpleados.next()) { 
				idEmpleado = rsEmpleados.getInt(1);
				listaEmpleados.add(
						new EmpleadoVehiculo(idEmpleado,
											 rsEmpleados.getString(2), 
											 rsEmpleados.getString(3),
											 rsEmpleados.getString(4), 
											 dameListaVehiculos(idEmpleado)) 
				);
			}
		}
		return listaEmpleados;
	}
	
	private List<Vehiculo> dameListaVehiculos(int idEmpleado) throws SQLException {
		
		List<Vehiculo> listaVehiculos=new ArrayList<>();				
		try (Connection conn = getConexion(); 
			 PreparedStatement vehiculosByEmpleado = conn.prepareStatement(QUERY_VEHICULOS)) {
			Vehiculo vehiculo;
			vehiculosByEmpleado.setInt(1, idEmpleado);
			ResultSet rsVehiculos=vehiculosByEmpleado.executeQuery();
		
			while (rsVehiculos.next()) { 
				vehiculo=new Vehiculo();
				vehiculo.setId(rsVehiculos.getInt(1));
				vehiculo.setMarca(rsVehiculos.getString(2));
				vehiculo.setModelo(rsVehiculos.getString(3));
				vehiculo.setTipoCarnet(rsVehiculos.getInt(4));
				listaVehiculos.add(vehiculo);
			}
		}
		return listaVehiculos;
	}
		
	public String[][] dameArrayEmpleados() throws SQLException {
		List<EmpleadoVehiculo> listaEmpleadoVehiculos = dameListaEmpleadoVehiculos();	
		String[][] arrayStringEmpleadoVehiculos = 
				new String[listaEmpleadoVehiculos.size()][COLUMNAS_EMPLEADO.length];
		int numeroFila=0;
		for (EmpleadoVehiculo empleadoVehiculo : listaEmpleadoVehiculos) {
			arrayStringEmpleadoVehiculos[numeroFila][0]=String.valueOf(empleadoVehiculo.getIdEmpleado());
			arrayStringEmpleadoVehiculos[numeroFila][1]=empleadoVehiculo.getNombre();
			arrayStringEmpleadoVehiculos[numeroFila][2]=empleadoVehiculo.getDni();
			arrayStringEmpleadoVehiculos[numeroFila][3]=empleadoVehiculo.getTelefono();
			numeroFila++;
		}
		return arrayStringEmpleadoVehiculos;
	}
	
	public String[][] dameArrayVehiculos(int idEmpleado) throws SQLException {
		List<Vehiculo> listaVehiculos = dameListaVehiculos(idEmpleado);
		String[][] arrayStringsVehiculo = new String[dameListaVehiculos(idEmpleado).size()][COLUMNAS_VEHICULO.length];
		int numeroFila=0;
		for (Vehiculo vehiculo : listaVehiculos) {
			arrayStringsVehiculo[numeroFila][0]=String.valueOf(vehiculo.getId());
			arrayStringsVehiculo[numeroFila][1]=String.valueOf(vehiculo.getMarca());
			arrayStringsVehiculo[numeroFila][2]=String.valueOf(vehiculo.getModelo());
			numeroFila++;
		}
		return arrayStringsVehiculo;
	}

}
