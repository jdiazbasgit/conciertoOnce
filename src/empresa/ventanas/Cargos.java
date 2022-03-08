package empresa.ventanas;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import empresa.beans.Cargo;
import empresa.daos.EmpresaDao;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cargos extends JFrame implements ActionListener {
	// private List<Cargos> cargos = new ArrayList<Cargos>();
	private String cargos[];
	private JTable tCargos;
	private JButton bAlta, botonRegistroDialog;
	private JLabel label;
	private JTextField descripcion;

	public Cargos() {
		setTitle("Cargos");
		EmpresaDao empresaDao = new EmpresaDao();
		setDescripcion(new JTextField());
		JPanel panel = new JPanel();
		this.add(panel);
//		setContentPane(new JPanel());
		setBAlta(new JButton("Alta"));
		setBotonRegistroDialog(new JButton("Registrar"));
		setLabel(new JLabel("Descripcion"));
		String[] columnNames = { "ID", "Descripcion" };
		Object[][] data = null;
		// tCargos.getRowCount() y tCargos.getColumnCount()

		// Add the scroll pane to this panel.
		// add(scrollPane);

		// panel.add(getBAlta());
		getBAlta().addActionListener(this);
		// JPanel panel2 = new JPanel();
//		this.add(panel);
//		this.add(panel2);
//		getBAlta().addActionListener(this);

		// agregar los dos paneles
//		panel2.add(getBAlta(), BorderLayout.SOUTH);
//		panel2.setLayout(new BorderLayout(10, 10));
//		
//		JPanel panelContenedor = new JPanel();
//		panelContenedor.setLayout(new BorderLayout(10, 10));
//		panelContenedor.add(panel, BorderLayout.NORTH);
//		panelContenedor.add(panel2, BorderLayout.SOUTH);

		// panel.setLayout(new BorderLayout(20,20));
		// panel.setLayout(new GridLayout(2,3,40,40));

//		getContentPane().setLayout(new GridBagLayout());
//		GridBagConstraints getTCargos = new GridBagConstraints(1, 1, 3, 2, 9, 0, GridBagConstraints.WEST,
//				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
//		getContentPane().add(getTCargos(), getTCargos);
		Connection conexion = null;
		try {

			conexion = empresaDao.dameConexion();

			PreparedStatement pst = conexion.prepareStatement("select id,descripcion from cargos");
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
			setTCargos(new JTable(data, columnNames));
			getTCargos().setPreferredScrollableViewportSize(new Dimension(500, 250));
			getTCargos().setFillsViewportHeight(true);

			JScrollPane scrollPane = new JScrollPane(getTCargos());
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

	public static void main(String[] args) {
		Cargos Cargos = new Cargos();
		Cargos.setSize(400, 350);
		Cargos.setVisible(true);
		Cargos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(getBotonRegistroDialog())) {
			grabaCargo();
			System.out.println("boton registro");
			JOptionPane.showMessageDialog(this, "Registro Realizado", "Registro", JOptionPane.INFORMATION_MESSAGE);

		}
		if (e.getSource().equals(getBAlta())) {

			System.out.println("boton");
			JDialog dialog = new JDialog(new JFrame(), "Registro Cargo", true);
			JPanel panel = new JPanel();

			dialog.add(panel);
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

	public Cargo grabaCargo() {
		Cargo cargo = new Cargo();
		// Cargo cargo = null;

		EmpresaDao empresaDao = new EmpresaDao();
		Connection conexion = null;

		try {
			conexion = empresaDao.dameConexion();
			PreparedStatement pst1 = conexion
					.prepareStatement("insert into cargos" + cargo.getDescripcion() + " VALUES (?) ");

			pst1.setString(1, getDescripcion().getText());
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


}

