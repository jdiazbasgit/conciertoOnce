package empresa.ventanas;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import empresa.beans.Cargo;
import empresa.daos.EmpresaDao;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cargos extends JFrame implements ActionListener, ChangeListener {
	//private List<Cargos> cargos = new ArrayList<Cargos>();
	private String cargos[];
	private JTable tCargos;
	private JButton bAlta, botonRegistroDialog;
	private JLabel label;
	private Choice descripcion; 


	public Cargos() {
		setTitle("Cargos");
		EmpresaDao empresaDao = new EmpresaDao();
		setDescripcion(new Choice());
		JPanel panel = new JPanel();
		this.add(panel);
//		setContentPane(new JPanel());
		setBAlta(new JButton("Alta"));
		setBotonRegistroDialog(new JButton("Registrar"));
		setLabel(new JLabel("Descripcion"));

		setDescripcion(new Choice());

		String[] columnNames = { "ID", "Descripcion" };

		Object[][] data = new Object[tCargos.getRowCount()][tCargos.getColumnCount()];

		setTCargos(new JTable(data, columnNames));
		getTCargos().setPreferredScrollableViewportSize(new Dimension(500, 250));
		getTCargos().setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(getTCargos());

		// Add the scroll pane to this panel.
		// add(scrollPane);

		// panel.add(getBAlta());
		getBAlta().addActionListener(this);
		panel.setLayout(new BorderLayout(10, 10));
		panel.add(scrollPane, BorderLayout.NORTH);
		panel.add(getBAlta(), BorderLayout.SOUTH);
		// panel.setLayout(new BorderLayout(20,20));
		// panel.setLayout(new GridLayout(2,3,40,40));

//		getContentPane().setLayout(new GridBagLayout());
//		GridBagConstraints getTCargos = new GridBagConstraints(1, 1, 3, 2, 9, 0, GridBagConstraints.WEST,
//				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
//		getContentPane().add(getTCargos(), getTCargos);
		try {
			empresaDao.dameConexion();
			PreparedStatement pst = empresaDao.dameConexion().prepareStatement("select id,descripcion from cargos");
			ResultSet rs = pst.executeQuery();
			int i = 0;
			while (rs.next()) {
				System.err.println(rs.getString(1) + " - " + rs.getString(2));
				 int id = rs.getInt(1);
			     String descripcion = rs.getString(2);
			     data[i][0] = id;
			     data[i][1] = descripcion;
			     
			     i++;
			     

			}
			empresaDao.dameConexion().close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
			System.out.println("boton registro");
			JOptionPane.showMessageDialog(this, "Registro Realizado", "Registro", JOptionPane.INFORMATION_MESSAGE);
			grabaCargo();


		}
		if (e.getSource().equals(getBAlta())) {

			EmpresaDao empresaDao = new EmpresaDao();
			try {
				empresaDao.dameConexion();
				PreparedStatement pst = empresaDao.dameConexion().prepareStatement("select descripcion from cargos");
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					System.err.println(rs.getString(1));
					getDescripcion().add(rs.getString(1));

				}
				empresaDao.dameConexion().close();
				

			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		
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
	
	public  Cargo grabaCargo() {
		Cargo cargo = new Cargo();
		//Cargo cargo = null;
		
		EmpresaDao empresaDao = new EmpresaDao();
		try {
			empresaDao.dameConexion();
			PreparedStatement pst1 = empresaDao.dameConexion().prepareStatement("insert into cargos" + cargo.getDescripcion_Cargos() + " VALUES (?) ");
			
			pst1.setString(1, getDescripcion().getSelectedItem());
			
			ResultSet rs=pst1.executeQuery();
			getDescripcion().removeAll();
			while (rs.next()) {
				System.err.println(rs.getString(1));
				getDescripcion().add(rs.getString(1));
				
			}
			empresaDao.dameConexion().close();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return cargo;
		
	}

//	private void printDebugData(JTable table) {
//		int numRows = table.getRowCount();
//		int numCols = table.getColumnCount();
//		javax.swing.table.TableModel model = table.getModel();
//
//		System.out.println("Value of data: ");
//		for (int i = 0; i < numRows; i++) {
//			System.out.print("    row " + i + ":");
//			for (int j = 0; j < numCols; j++) {
//				System.out.print("  " + model.getValueAt(i, j));
//			}
//			System.out.println();
//		}
//		System.out.println("--------------------------");
//	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// aqui seria la select que trae los datos de la descripcion del cargo
	}

}
//public class TableDemo extends JPanel { 
//    static final Logger logger = Logger.getLogger(TableDemo.class.getName()); 
// 
//    private OscarTableModel oscarModel; 
// 
//    private JPanel controlPanel; 
//    private Stacker dataPanel; 
//    private JTable oscarTable; 
//    private JCheckBox winnersCheckbox; 
//    private JTextField filterField; 
//    private Box statusBarLeft; 
//    private JLabel actionStatus; 
//    private JLabel tableStatus; 
// 
//    private Color[] rowColors; 
//    private String statusLabelString; 
//    private String searchLabelString; 
// 
//    private boolean showOnlyWinners = false; 
//    private String filterString = null; 
// 
//    private TableRowSorter sorter; 
//    private RowFilter<OscarTableModel, Integer> winnerFilter; 
//    private RowFilter<OscarTableModel, Integer> searchFilter; 
// 
//    // Resource bundle for internationalized and accessible text 
//    private ResourceBundle bundle = null; 
// 
//    public TableDemo() { 
//        initModel(); 
//        initComponents(); 
//        initSortingFiltering(); 
//    } 
// 
//    protected void initModel() { 
//        oscarModel = new OscarTableModel(); 
//    } 
// 
//    protected void initComponents() { 
//        setLayout(new BorderLayout()); 
// 
//        controlPanel = createControlPanel(); 
//        add(controlPanel, BorderLayout.NORTH); 
// 
//        //<snip>Create JTable 
//        oscarTable = new JTable(oscarModel); 
//        //</snip> 
// 
//        //</snip>Set JTable display properties 
//        oscarTable.setColumnModel(createColumnModel()); 
//        oscarTable.setAutoCreateRowSorter(true); 
//        oscarTable.setRowHeight(26); 
//        oscarTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN); 
//        oscarTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
//        oscarTable.setIntercellSpacing(new Dimension(0, 0)); 
//        //</snip> 
// 
//        //<snip>Initialize preferred size for table's viewable area 
//        Dimension viewSize = new Dimension(); 
//        viewSize.width = oscarTable.getColumnModel().getTotalColumnWidth(); 
//        viewSize.height = 10 * oscarTable.getRowHeight(); 
//        oscarTable.setPreferredScrollableViewportSize(viewSize); 
//        //</snip> 
// 
//        //<snip>Customize height and alignment of table header 
//        JTableHeader header = oscarTable.getTableHeader(); 
//        header.setPreferredSize(new Dimension(30, 26)); 
//        TableCellRenderer headerRenderer = header.getDefaultRenderer(); 
//        if (headerRenderer instanceof JLabel) { 
//            ((JLabel) headerRenderer).setHorizontalAlignment(JLabel.CENTER); 
//        } 
//        //</snip> 
// 
//        JScrollPane scrollpane = new JScrollPane(oscarTable); 
//        dataPanel = new Stacker(scrollpane); 
//        add(dataPanel, BorderLayout.CENTER); 
// 
//        add(createStatusBar(), BorderLayout.SOUTH); 
// 
//    } 
// 



