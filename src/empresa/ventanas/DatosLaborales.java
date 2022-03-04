package empresa.ventanas;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import empresa.daos.EmpresaDAO;
import lombok.Data;
@Data
public class DatosLaborales extends JFrame {
	//CAMBIAR VARIABLES
	private JTable tDatosLaborales;
	//private JButton bAlta;
	private JLabel label = new JLabel("Descripcion");
	private JButton botonRegistroDialog = new JButton("Registrar");
	private Choice descripcion = new Choice();
	

	public DatosLaborales() {
		setTitle("Datos Laborales");
		EmpresaDAO empresaDao = new EmpresaDAO();
		setDescripcion(new Choice());
		JPanel panel = new JPanel();
		this.add(panel);
//		setContentPane(new JPanel());
		//setBAlta(new JButton("Alta"));
		setBotonRegistroDialog(new JButton("Registrar"));
		setLabel(new JLabel("Descripcion"));
		String[] columnNames = { "ID","Salario","Descripcion Cargo" };
		Object[][] data = null;
		//getBAlta().addActionListener(this);
		
		Connection conexion = null;
		try {

			conexion = empresaDao.getConexion();

			PreparedStatement pst = conexion.prepareStatement("select dl.id,dl.salario,c.descripcion from datos_laborales as dl, cargos as c where dl.cargos_id = c.id");
			ResultSet rs = pst.executeQuery();

			Statement statement = conexion.createStatement();
			ResultSet rsCount = statement.executeQuery("select count(1) from datos_laborales");
			rsCount.next();
			int filas = rsCount.getInt(1);
			data = new Object[filas][3];
			while (rs.next()) {

				System.err.println(rs.getString(1) + " - " + rs.getString(2) +" - " +rs.getString(3) );
				int id = rs.getInt(1);
				int salario = rs.getInt(2);
				String cargo = rs.getString(3);
				data[rs.getRow() - 1][0] = id;
				data[rs.getRow() - 1][1] = salario;
				data[rs.getRow() - 1][2] = cargo;

			}
			setTDatosLaborales(new JTable(data, columnNames));
			getTDatosLaborales().setPreferredScrollableViewportSize(new Dimension(500, 250));
			getTDatosLaborales().setFillsViewportHeight(true);

			JScrollPane scrollPane = new JScrollPane(getTDatosLaborales());
			panel.setLayout(new BorderLayout(10, 10));
			panel.add(scrollPane, BorderLayout.NORTH);
			//panel.add(getBAlta(), BorderLayout.SOUTH);

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource().equals(getBAlta())) {
//			System.out.println("boton");
//			JDialog dialog = new JDialog(new JFrame(), "Registro Cargo", true);
//			JPanel panel = new JPanel();
//			
//			
//			dialog.add(panel);
//			panel.setLayout(new GridBagLayout());
//			GridBagConstraints  gbLabel= new GridBagConstraints(0,0,1,1,1,0,GridBagConstraints.CENTER,0,new Insets(0,0,0,0),0,0);
//			panel.add(getLabel(),gbLabel);
//			GridBagConstraints  gbTexto= new GridBagConstraints(0,1,5,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0);
//			panel.add(getDescripcion(),gbTexto);
//			GridBagConstraints  gbBoton= new GridBagConstraints(0,2,5,2,0,1,GridBagConstraints.CENTER,GridBagConstraints.CENTER,new Insets(0,0,0,0),0,0);
//			panel.add(getBotonRegistroDialog(),gbBoton);
//			
//			//botonRegistroDialog.setHorizontalAlignment(JButton.CENTER);
//			getBotonRegistroDialog().setPreferredSize(new Dimension(5, 10));
//			
//
////			dialog.add(botonRegistroDialog);
//			dialog.setSize(250, 250);
//			dialog.setVisible(true);
//		}
//		if (e.getSource().equals(getBotonRegistroDialog())) {
//			//aqui sentencia sql insert into
//		}
//		
//	}
//	@Override
//	public void stateChanged(ChangeEvent e) {
//		//select dl.cargos_id from datos laborales as dl,cargos as c where dl.cargos_id=c.id
//		
//	}
	public static void main(String[] args) {
		DatosLaborales datosLaborales = new DatosLaborales();
		datosLaborales.setSize(1200, 800);
		datosLaborales.setVisible(true);
		datosLaborales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
//	public Cargo grabaCargo() {
//		Cargo cargo = new Cargo();
//		// Cargo cargo = null;
//
//		EmpresaDao empresaDao = new EmpresaDao();
//		Connection conexion = null;
//
//		try {
//			conexion = empresaDao.dameConexion();
//			PreparedStatement pst1 = conexion
//					.prepareStatement("insert into cargos" + cargo.getDescripcion_Cargos() + " VALUES (?) ");
//
//			pst1.setString(1, getDescripcion().getSelectedItem());
//			pst1.executeQuery();
//			conexion.close();
//
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} finally {
//			try {
//				conexion.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return cargo;
//
//	}
}
