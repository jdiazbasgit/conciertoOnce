package tags;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import empresa.beans.Empresa;

public class EmpresaDAO extends  ConexionDAO {
	
	public String[] getColumnasHijo() {
		return new String[] {"ID","NOMBRE","CIF"};
	}
	
	
	public  List<Empresa> dameEmpresas() throws SQLException{
		Connection conn = null;
		List<Empresa> listaEmpresas = new ArrayList<Empresa>();
		try { 
		    conn =getConexion();
			Statement instruccion = conn.createStatement();
			String query = "SELECT e.ID, e.NOMBRE , e.CIF  FROM empresas as e";
			ResultSet rs = instruccion.executeQuery(query);
			while(rs.next()) {
				Empresa empresa = new Empresa(rs.getInt(1), rs.getString(2), rs.getString(3));
				listaEmpresas.add(empresa);
			}
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		 return listaEmpresas;
			
	}
	
	
	
	public void grabaEmpresas(Empresa empresa) throws SQLException {
		Connection conn = null;
         try {
			
			conn = getConexion();
			String query = "INSERT INTO empresas (NOMBRE,CIF) values(?,?) ";
			
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			preparedStatement.setString(1,empresa.getNombre() );
			preparedStatement.setString(2,empresa.getCif() );
			preparedStatement.execute();
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	


}