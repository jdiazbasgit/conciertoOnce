package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class EjemploDatos {
/*apertura de rama*/
	public EjemploDatos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Connection conexion=null;
		try {
			//1.- registramos driver
			DriverManager.registerDriver(new Driver());
			//2.- Conectamos
			conexion= DriverManager.getConnection("jdbc:mysql://192.168.10.16:3306/curso", "curso", "Cursocurso1;");
			//3.- Instruccion
			Statement instruccion= conexion.createStatement();
			//4.- Ejecuto
			ResultSet resultSet= instruccion.executeQuery("SELECT NOMBRE,DNI,FECHA_NACIMIENTO FROM EMPLEADOS where dni like '5%' ");
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+ " - "+resultSet.getString(2)+" - "+resultSet.getDate(3));
			}
			
			PreparedStatement pst = conexion.prepareStatement("SELECT NOMBRE,DNI FROM EMPLEADOS WHERE DNI LIKE ? or DNI like ?");
			pst.setString(1, "6%");
			pst.setString(2, "5%");
			ResultSet rs=pst.executeQuery();
			while (rs.next()) {
				System.err.println(rs.getString(1)+ " - "+rs.getString(2));
				
			}
			
			PreparedStatement pst1= conexion.prepareStatement("INSERT INTO CARGOS (DESCRIPCION) VALUES (?)");
			pst1.setString(1, "cargo del que mas cobra 2");
			
			System.out.println(pst1.execute());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
