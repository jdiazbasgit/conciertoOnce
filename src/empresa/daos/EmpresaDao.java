package empresa.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.Data;

@Data

public class EmpresaDao {

	public Connection dameConexion()  throws SQLException {
		Connection conexion = null;

		try {
			// 1.- registramos driver
			DriverManager.registerDriver(new Driver());
			// 2.- Conectamos
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cursos", "root", "1234");
			// 3.- Instruccion
			// 4.- Ejecuto
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("No se ha podido conectar a la base de datos");
			
			
		}
		return conexion; 
	}

}
