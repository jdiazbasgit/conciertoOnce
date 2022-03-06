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
public class DatosLaborales extends JPanel {
	//CAMBIAR VARIABLES
	private JTable tDatosLaborales;
	//private JButton bAlta;
	private JLabel label = new JLabel("Descripcion");
	private JButton botonRegistroDialog = new JButton("Registrar");
	private Choice descripcion = new Choice();
	

	public DatosLaborales() {
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

		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
