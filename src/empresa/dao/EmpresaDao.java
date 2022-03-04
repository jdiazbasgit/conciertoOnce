package empresa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;


public class EmpresaDao {
	
	public Connection dameConexion() throws SQLException {
		DriverManager.registerDriver(new Driver());
		Connection conexion= DriverManager.getConnection("jdbc:mysql://192.168.10.16:3306/curso", "curso", "Cursocurso1;");
		return conexion;
		
		
	}

}

