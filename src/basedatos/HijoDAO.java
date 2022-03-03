package basedatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Hijo;





public class HijoDAO {
	 //List<Hijo> lista_hijos = new ArrayList<Hijo>();
	
	public  List<Hijo> dameHijos() throws SQLException{
		Connection conn = null;
		 List<Hijo> lista_hijos = new ArrayList<Hijo>();
		 
		    conn =  ConexionBD.getConexion();
			Statement instruccion = conn.createStatement();
			String query = "SELECT h.ID,h.NUMERO_CHICOS,h.NUMERO_CHICAS FROM hijos as h";
			ResultSet rs = instruccion.executeQuery(query);
			while(rs.next()) {
				Hijo hijo = new Hijo(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				lista_hijos.add(hijo);
			}
			
		 return lista_hijos;
			
	}
	


	public static void main(String[] args) {
		Connection conn = null;
		 List<Hijo> lista_hijos = new ArrayList<Hijo>();
			
		
		try {
			
			System.out.println("INSERCCION DE NUMERO DE HIJOS EN LA BASE DE DATOS ");
			conn =  ConexionBD.getConexion();
			String query = "INSERT INTO hijos (NUMERO_CHICOS,NUMERO_CHICAS) values(?,?) ";
			
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, 14);
			preparedStatement.setInt(2, 12);
	    
			preparedStatement.execute();
			conn.close();
			
			/*
			 * ResultSet rs = consulta.executeQuery(query);
			 * System.out.println("LISTADO DE LA TABLA HIJOS"); while(rs.next()) {
			 * //HijosBean hijos = new HijosBean(); HijoBean hijos = new
			 * HijoBean(rs.getInt(1),rs.getInt(2),rs.getInt(3)); lista_hijos.add(hijos);
			 * 
			 * 
			 * System.out.println("ID: "+
			 * rs.getInt(1)+" Num. chicos: "+rs.getInt(2)+" Num. chicas: "+rs.getInt(3)); }
			 * 
			 * System.out.println(" LISTADO DE LA LISTA ");
			 * 
			 * for(HijoBean e: lista_hijos) { System.out.println(e.toString()); }
			 */
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		


	}

}
