package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	private static Connection conexion=null;
	private static String ip="localhost";
    String url = "jdbc:mysql://"+ip+":3306/curso";
    String driver = "com.mysql.jdbc.Driver";
    String usuario = "usuario";
    String password = "password";
	private ConexionBD(){
		
	 
	    try{
	 Class.forName(driver);
	 conexion= DriverManager.getConnection(url, usuario, password);
	    }
	    catch(ClassNotFoundException | SQLException e){
	 e.printStackTrace();
	    }
	}
	
	public Connection getConexion() {
		if (conexion == null){
			 new ConexionBD();
		}
			 
	return conexion;
	}
}
