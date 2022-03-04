package empresa.ventanas;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import empresa.beans.Cargo;
import empresa.daos.EmpresaDAO;
import lombok.Data;

@SuppressWarnings("serial")
@Data
public class EstadosCiviles extends JPanel implements ActionListener, ChangeListener {
	private JTable tEstadosCiviles;
	private JButton bAlta;
	private JLabel label = new JLabel("Descripcion");
	private JButton botonRegistroDialog = new JButton("Registrar");
	private Choice descripcion = new Choice();

	public EstadosCiviles() {
		EmpresaDAO empresaDao = new EmpresaDAO();
		setDescripcion(new Choice());
		JPanel panel = new JPanel();
		this.add(panel);
//		setContentPane(new JPanel());
		setBAlta(new JButton("Alta"));
		setBotonRegistroDialog(new JButton("Registrar"));
		setLabel(new JLabel("Descripcion"));
		String[] columnNames = { "ID", "Descripcion" };
		Object[][] data = null;

		getBAlta().addActionListener(this);
		panel.add(getBAlta());
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 8));

		Connection conexion = null;
		try {

			conexion = empresaDao.getConexion();

			PreparedStatement pst = conexion.prepareStatement("select id,descripcion from estado_civil");
			ResultSet rs = pst.executeQuery();

			Statement statement = conexion.createStatement();
			ResultSet rsCount = statement.executeQuery("select count(1) from cargos");
			rsCount.next();
			int filas = rsCount.getInt(1);
			data = new Object[filas][2];
			while (rs.next()) {

				System.err.println(rs.getString(1) + " - " + rs.getString(2));
				int id = rs.getInt(1);
				String descripcion = rs.getString(2);
				data[rs.getRow() - 1][0] = id;
				data[rs.getRow() - 1][1] = descripcion;

			}
			setTEstadosCiviles(new JTable(data, columnNames));
			getTEstadosCiviles().setPreferredScrollableViewportSize(new Dimension(500, 250));
			getTEstadosCiviles().setFillsViewportHeight(true);

			JScrollPane scrollPane = new JScrollPane(getTEstadosCiviles());
			panel.setLayout(new BorderLayout(10, 10));
			panel.add(scrollPane, BorderLayout.NORTH);
			panel.add(getBAlta(), BorderLayout.SOUTH);

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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(getBotonRegistroDialog())) {
			grabaEstadoCivil();
			System.out.println("boton registro");
			JOptionPane.showMessageDialog(this, "Registro Realizado", "Registro", JOptionPane.INFORMATION_MESSAGE);

		}
		if (e.getSource().equals(getBAlta())) {

			System.out.println("boton");
			JDialog dialog = new JDialog(new JFrame(), "Registro Cargo", true);
			JPanel panel = new JPanel();

			dialog.add(panel);
			EmpresaDAO empresaDao = new EmpresaDAO();
			Connection conexion = null;
			try {

				conexion = empresaDao.getConexion();

				PreparedStatement pst = conexion.prepareStatement("select descripcion from estado_civil");
				ResultSet rs = pst.executeQuery();
				getDescripcion().removeAll();
				getDescripcion().add("Selecciona estado...");
				
				while (rs.next()) {
					getDescripcion().add(rs.getString(1));

					//System.err.println(rs.getString(1) + " - " + rs.getString(2));

				}

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				try {
					conexion.close();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}

			panel.setLayout(new GridBagLayout());
			GridBagConstraints gbLabel = new GridBagConstraints(0, 0, 1, 1, 1, 0, GridBagConstraints.CENTER, 0,
					new Insets(0, 0, 0, 0), 0, 0);
			panel.add(getLabel(), gbLabel);
			GridBagConstraints gbTexto = new GridBagConstraints(0, 1, 5, 1, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
			panel.add(getDescripcion(), gbTexto);
			GridBagConstraints gbBoton = new GridBagConstraints(0, 2, 3, 2, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0);
			panel.add(getBotonRegistroDialog(), gbBoton);

			// botonRegistroDialog.setHorizontalAlignment(JButton.CENTER);
			getBotonRegistroDialog().setPreferredSize(new Dimension(5, 10));

			dialog.setSize(250, 250);
			dialog.setVisible(true);

		}

	}

	public Cargo grabaEstadoCivil() {
		Cargo cargo = new Cargo();
		// Cargo cargo = null;

		EmpresaDAO empresaDao = new EmpresaDAO();
		Connection conexion = null;

		try {
			conexion = empresaDao.getConexion();
			PreparedStatement pst1 = conexion
					.prepareStatement("insert into cargos" + cargo.getDescripcion() + " VALUES (?) ");

			pst1.setString(1, getDescripcion().getSelectedItem());
			pst1.executeQuery();
			conexion.close();

		} catch (SQLException e1) {
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
		return cargo;

	}

	

	@Override
	public void stateChanged(ChangeEvent e) {

	}

}
