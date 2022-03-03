package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.Data;

@Data

public class EmpresaDao{

	public void conexion() {
		Connection conexion = null;
		try {
			// 1.- registramos driver
			DriverManager.registerDriver(new Driver());
			// 2.- Conectamos
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/curso", "root", "1234");
			// 3.- Instruccion
			Statement instruccion = conexion.createStatement();
			// 4.- Ejecuto
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
