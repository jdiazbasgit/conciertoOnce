package empresa.ventanas;

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import empresa.daos.EmpresaDao;
import lombok.Data;

@Data

public class Cargos extends JFrame implements ActionListener, ChangeListener {

	private JTable tCargos;
	private JButton bAlta;
	private JLabel label = new JLabel("Descripcion");
	private JButton botonRegistroDialog = new JButton("Registrar");
	private Choice descripcion = new Choice();

	public Cargos() {

		JPanel panel = new JPanel();
		this.add(panel);
//		setContentPane(new JPanel());
		setBAlta(new JButton("Alta"));

		setDescripcion(new Choice());
		EmpresaDao empresaDao = new EmpresaDao();
		try {
			empresaDao.dameConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				empresaDao.dameConexion().close();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			try {
				empresaDao.dameConexion().close();
				System.out.println("se cerro la base de datos");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		String[] columnNames = { "ID", "Descripcion" };

		Object[][] data = { { "Kathy", "Smith" }, { "Jane", "White" }, { "Joe", "Brown" } };

		setTCargos(new JTable(data, columnNames));
		getTCargos().setPreferredScrollableViewportSize(new Dimension(500, 70));
		getTCargos().setFillsViewportHeight(true);

		panel.add(getBAlta());
		getBAlta().addActionListener(this);

		JScrollPane scrollPane = new JScrollPane(getTCargos());

		// Add the scroll pane to this panel.
		add(scrollPane);
		// panel.setLayout(new GridLayout(2,3,40,40));
		// panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 8));
//		getContentPane().setLayout(new GridBagLayout());
//		GridBagConstraints getTCargos = new GridBagConstraints(1, 1, 3, 2, 9, 0, GridBagConstraints.WEST,
//				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
//		getContentPane().add(getTCargos(), getTCargos);
	}

	public static void main(String[] args) {
		Cargos Cargos = new Cargos();
		Cargos.setSize(1200, 800);
		Cargos.setVisible(true);
		Cargos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

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

//			dialog.add(botonRegistroDialog);
			dialog.setSize(250, 250);
			dialog.setVisible(true);
		}
		if (e.getSource().equals(getBotonRegistroDialog())) {
			// aqui sentencia sql insert into
		}
	}

	private void printDebugData(JTable table) {
		int numRows = table.getRowCount();
		int numCols = table.getColumnCount();
		javax.swing.table.TableModel model = table.getModel();

		System.out.println("Value of data: ");
		for (int i = 0; i < numRows; i++) {
			System.out.print("    row " + i + ":");
			for (int j = 0; j < numCols; j++) {
				System.out.print("  " + model.getValueAt(i, j));
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}

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
//    protected JPanel createControlPanel() { 
//        JPanel controlPanel = new JPanel(); 
//        GridBagLayout gridbag = new GridBagLayout(); 
//        GridBagConstraints c = new GridBagConstraints(); 
//        controlPanel.setLayout(gridbag); 
// 
//        c.gridx = 0; 
//        c.gridy = 1; 
//        c.gridheight = 1; 
//        c.insets = new Insets(20, 10, 0, 10); 
//        c.anchor = GridBagConstraints.SOUTHWEST; 
//        JLabel searchLabel = new JLabel(getString("TableDemo.searchLabel", 
//                "Search Titles and Recipients")); 
//        controlPanel.add(searchLabel, c); 
// 
//        c.gridx = 0; 
//        c.gridy = 2; 
//        c.weightx = 1.0; 
//        c.insets.top = 0; 
//        c.insets.bottom = 12; 
//        c.anchor = GridBagConstraints.SOUTHWEST; 
//        //c.fill = GridBagConstraints.HORIZONTAL; 
//        filterField = new JTextField(24); 
//        filterField.getDocument().addDocumentListener(new SearchFilterListener()); 
//        controlPanel.add(filterField, c); 
// 
//        c.gridx = 1; 
//        c.gridy = 2; 
//        c.gridwidth = GridBagConstraints.REMAINDER; 
//        //c.insets.right = 24; 
//        //c.insets.left = 12; 
//        c.weightx = 0.0; 
//        c.anchor = GridBagConstraints.EAST; 
//        c.fill = GridBagConstraints.NONE; 
//        winnersCheckbox = new JCheckBox(getString("TableDemo.winnersLabel", 
//                "Show Only Winners")); 
//        winnersCheckbox.addChangeListener(new ShowWinnersListener()); 
//        controlPanel.add(winnersCheckbox, c); 
// 
//        return controlPanel; 
//    } 
// 
//    protected Container createStatusBar() { 
//        statusLabelString = getString("TableDemo.rowCountLabel", 
//                "Showing "); 
//        searchLabelString = getString("TableDemo.searchCountLabel", 
//                "Search found "); 
// 
//        Box statusBar = Box.createHorizontalBox(); 
// 
//        // Left status area 
//        statusBar.add(Box.createRigidArea(new Dimension(10, 22))); 
//        statusBarLeft = Box.createHorizontalBox(); 
//        statusBar.add(statusBarLeft); 
//        actionStatus = new JLabel(getString("TableDemo.noDataStatusLabel", 
//                "No data loaded")); 
//        actionStatus.setHorizontalAlignment(JLabel.LEADING); 
//        statusBarLeft.add(actionStatus); 
// 
//        // Middle (should stretch) 
//        statusBar.add(Box.createHorizontalGlue()); 
//        statusBar.add(Box.createHorizontalGlue()); 
//        statusBar.add(Box.createVerticalGlue()); 
// 
//        // Right status area 
//        tableStatus = new JLabel(statusLabelString + "0"); 
//        statusBar.add(tableStatus); 
//        statusBar.add(Box.createHorizontalStrut(12)); 
// 
//        //<snip>Track number of rows currently displayed 
//        oscarModel.addTableModelListener(new TableModelListener() { 
//            public void tableChanged(TableModelEvent e) { 
//                // Get rowCount from *table*, not model, as the view row count 
//                // may be different from the model row count due to filtering 
//                tableStatus.setText((hasFilterString() ? searchLabelString : statusLabelString) + 
//                        oscarTable.getRowCount()); 
//            } 
//        }); 
//        //</snip> 
// 
//        return statusBar; 
//    } 
// 
//    private Color[] getTableRowColors() { 
//        if (rowColors == null) { 
//            rowColors = new Color[2]; 
//            rowColors[0] = UIManager.getColor("Table.background"); 
//            rowColors[1] = new Color((int) (rowColors[0].getRed() * .9), 
//                    (int) (rowColors[0].getGreen() * .9), 
//                    (int) (rowColors[0].getBlue() * .9)); 
//        } 
//        return rowColors; 
//    } 
// 
//    // returns appropriate string from resource bundle 
//    protected String getString(String key, String fallback) { 
//        String value = fallback; 
//        if (bundle == null) { 
//            String bundleName = getClass().getPackage().getName() + ".resources." + getClass().getSimpleName(); 
//            bundle = ResourceBundle.getBundle(bundleName); 
//        } 
//        try { 
//            value = bundle != null ? bundle.getString(key) : key; 
// 
//        } catch (MissingResourceException ex) { 
//            logger.log(Level.WARNING, "couldn't find resource value for: " + key, ex); 
//        } 
//        return value; 
//    } 
// 
// 
//    //<snip>Initialize table columns 
//    protected TableColumnModel createColumnModel() { 
//        DefaultTableColumnModel columnModel = new DefaultTableColumnModel(); 
// 
//        TableCellRenderer cellRenderer = new OscarCellRenderers.RowRenderer(getTableRowColors()); 
// 
//        TableColumn column = new TableColumn(); 
//        column.setModelIndex(OscarTableModel.YEAR_COLUMN); 
//        column.setHeaderValue(getString("TableDemo.yearColumnTitle", "Year")); 
//        column.setPreferredWidth(26); 
//        column.setCellRenderer(new OscarCellRenderers.YearRenderer(getTableRowColors())); 
//        columnModel.addColumn(column); 
// 
//        column = new TableColumn(); 
//        column.setModelIndex(OscarTableModel.CATEGORY_COLUMN); 
//        column.setHeaderValue(getString("TableDemo.categoryColumnTitle", "Award Category")); 
//        column.setPreferredWidth(100); 
//        column.setCellRenderer(cellRenderer); 
//        columnModel.addColumn(column); 
// 
//        column = new TableColumn(); 
//        column.setModelIndex(OscarTableModel.MOVIE_COLUMN); 
//        column.setHeaderValue(getString("TableDemo.movieTitleColumnTitle", "Movie Title")); 
//        column.setPreferredWidth(180); 
//        HyperlinkCellRenderer hyperlinkRenderer = 
//                new OscarCellRenderers.MovieRenderer(new IMDBLinkAction(), 
//                        true, getTableRowColors()); 
//        hyperlinkRenderer.setRowColors(getTableRowColors()); 
//        column.setCellRenderer(hyperlinkRenderer); 
//        columnModel.addColumn(column); 
// 
//        column = new TableColumn(); 
//        column.setModelIndex(OscarTableModel.PERSONS_COLUMN); 
//        column.setHeaderValue(getString("TableDemo.nomineesColumnTitle", "Nominees")); 
//        column.setPreferredWidth(120); 
//        column.setCellRenderer(new OscarCellRenderers.NomineeRenderer(getTableRowColors())); 
//        columnModel.addColumn(column); 
// 
//        return columnModel; 
//    } 
//    //</snip> 
// 
//    protected void initSortingFiltering() { 
//        //<snip>Setup filtering for winners 
//        sorter = new TableRowSorter(oscarModel); 
//        oscarTable.setRowSorter(sorter); 
//        winnerFilter = new RowFilter<OscarTableModel, Integer>() { 
//            public boolean include(Entry<? extends OscarTableModel, ? extends Integer> entry) { 
//                OscarTableModel oscarModel = entry.getModel(); 
//                OscarCandidate candidate = oscarModel.getCandidate(entry.getIdentifier().intValue()); 
//                if (candidate.isWinner()) { 
//                    // Returning true indicates this row should be shown. 
//                    return true; 
//                } 
//                // loser 
//                return false; 
//            } 
//        }; 
//        //</snip> 
// 
//        //<snip>Setup search filter 
//        searchFilter = new RowFilter<OscarTableModel, Integer>() { 
//            public boolean include(Entry<? extends OscarTableModel, ? extends Integer> entry) { 
//                OscarTableModel oscarModel = entry.getModel(); 
//                OscarCandidate candidate = oscarModel.getCandidate(entry.getIdentifier().intValue()); 
//                boolean matches = false; 
//                Pattern p = Pattern.compile(filterString + ".*", Pattern.CASE_INSENSITIVE); 
// 
//                String movie = candidate.getMovieTitle(); 
//                if (movie != null) { 
//                    if (movie.startsWith("The ")) { 
//                        movie = movie.replace("The ", ""); 
//                    } else if (movie.startsWith("A ")) { 
//                        movie = movie.replace("A ", ""); 
//                    } 
//                    // Returning true indicates this row should be shown. 
//                    matches = p.matcher(movie).matches(); 
//                } 
//                List<String> persons = candidate.getPersons(); 
//                for (String person : persons) { 
//                    if (p.matcher(person).matches()) { 
//                        matches = true; 
//                    } 
//                } 
//                return matches; 
//            } 
//        }; 
//        //</snip> 
//    } 
// 
//    public void setShowOnlyWinners(boolean showOnlyWinners) { 
//        boolean oldShowOnlyWinners = this.showOnlyWinners; 
//        this.showOnlyWinners = showOnlyWinners; 
//        configureFilters(); 
//        tableStatus.setText(statusLabelString + oscarTable.getRowCount()); 
//        firePropertyChange("showOnlyWinners", oldShowOnlyWinners, showOnlyWinners); 
//    } 
// 
//    public boolean getShowOnlyWinners() { 
//        return showOnlyWinners; 
//    } 
// 
//    public void setFilterString(String filterString) { 
//        String oldFilterString = this.filterString; 
//        this.filterString = filterString; 
//        configureFilters(); 
//        firePropertyChange("filterString", oldFilterString, filterString); 
//    } 
// 
//    protected boolean hasFilterString() { 
//        return filterString != null && !filterString.equals(""); 
//    } 
// 
//    protected void configureFilters() { 
//        if (showOnlyWinners && hasFilterString()) { 
//            List<RowFilter<OscarTableModel, Integer>> filters = 
//                    new ArrayList<RowFilter<OscarTableModel, Integer>>(2); 
//            filters.add(winnerFilter); 
//            filters.add(searchFilter); 
//            RowFilter<OscarTableModel, Integer> comboFilter = RowFilter.andFilter(filters); 
//            sorter.setRowFilter(comboFilter); 
//        } else if (showOnlyWinners) { 
//            sorter.setRowFilter(winnerFilter); 
//        } else if (hasFilterString()) { 
//            sorter.setRowFilter(searchFilter); 
//        } else { 
//            sorter.setRowFilter(null); 
//        } 
//        tableStatus.setText((hasFilterString() ? searchLabelString : statusLabelString) 
//                + oscarTable.getRowCount()); 
// 
//    } 
// 
//   
// 
//    //<snip>Setup search filter 
//    protected class SearchFilterListener implements DocumentListener { 
//        protected void changeFilter(DocumentEvent event) { 
//            Document document = event.getDocument(); 
//            try { 
//                setFilterString(document.getText(0, document.getLength())); 
// 
//            } catch (Exception ex) { 
//                ex.printStackTrace(); 
//                System.err.println(ex); 
//            } 
//        } 
// 
//        public void changedUpdate(DocumentEvent e) { 
//            changeFilter(e); 
//        } 
// 
//        public void insertUpdate(DocumentEvent e) { 
//            changeFilter(e); 
//        } 
// 
//        public void removeUpdate(DocumentEvent e) { 
//            changeFilter(e); 
//        } 
//    } 
//    //</snip> 
// 
//    //<snip>Use SwingWorker to asynchronously load the data     
// 

//    //</snip> 
//     
//    protected void showMessage(String title, String message) { 
//        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE); 
//    } 
// 
//    //<snip>Use SwingWorker to asynchronously load the data 
//    private class OscarDataLoader extends javax.swing.SwingWorker<List<OscarCandidate>, OscarCandidate> { 
//        private final URL oscarData; 
//        private final OscarTableModel oscarModel; 
//        private final List<OscarCandidate> candidates = new ArrayList<OscarCandidate>(); 
//        private JLabel credits; 
//          
//        private OscarDataLoader(URL oscarURL, OscarTableModel oscarTableModel) { 
//            this.oscarData = oscarURL; 
//            this.oscarModel = oscarTableModel; 
//        } 
// 
//        @Override 
//        public List<OscarCandidate> doInBackground() { 
//            OscarDataParser parser = new OscarDataParser() { 
//                @Override 
//                protected void addCandidate(OscarCandidate candidate) { 
//                    candidates.add(candidate); 
//                    if (candidates.size() % 3 == 0) { 
//                        try { // slow it down so we can see progress :-) 
//                            Thread.sleep(1); 
//                        } catch (Exception ex) { 
//                        } 
//                    } 
//                    publish(candidate); 
//                    setProgress(100 * candidates.size() / 8545); 
//                } 
//            }; 
//            parser.parseDocument(oscarData); 
//            return candidates; 
//        } 
// 
//        // for OS X older Java 6 
//        /* 
//        protected void process(List<OscarCandidate>... moreCandidates) { 
//            for(List<OscarCandidate> newCandidates: moreCandidates) { 
//                oscarModel.add(newCandidates); 
//            } 
//        }*/ 
// 
//        //@Override 
// 
//        protected void process(List<OscarCandidate> moreCandidates) { 
//            if (credits == null) { 
//                showCredits(); 
//            } 
//            oscarModel.add(moreCandidates); 
//        } 
// 
//        // For older Java 6 on OS X 
//        protected void process(OscarCandidate... moreCandidates) { 
//            for (OscarCandidate candidate : moreCandidates) { 
//                oscarModel.add(candidate); 
//            } 
//        } 
//         
//        private void showCredits() { 
//            credits = new JLabel(getString("TableDemo.credits", 
//                    "<html><p align=\"center\">Academy Award data<br>courtesy of Howard Katz</p></html>")); 
//            credits.setFont(UIManager.getFont("Table.font").deriveFont(24f)); 
//            credits.setHorizontalAlignment(JLabel.CENTER); 
//            credits.setBorder(new CompoundBorder(new TitledBorder(""), 
//                    new EmptyBorder(20,20,20,20))); 
//            dataPanel.showMessageLayer(credits, .75f); 
//        } 
//        @Override 
//        protected void done() { 
//            setProgress(100); 
//            dataPanel.hideMessageLayer(); 
//        } 
// 
//    } 
//    //</snip> 
// 
//    private class IMDBLinkAction extends AbstractAction { 
// 
//        public void actionPerformed(ActionEvent event) { 
//            int row = ((Integer) event.getSource()).intValue(); 
//            OscarCandidate candidate = oscarModel.getCandidate(oscarTable.convertRowIndexToModel(row)); 
// 
//            try { 
//                URI imdbURI = candidate.getIMDBMovieURI(); 
//                if (imdbURI == null) { 
//                    String imdbString = IMDBLink.getMovieURIString(candidate.getMovieTitle(), 
//                            candidate.getYear()); 
//                    if (imdbString != null) { 
//                        imdbURI = new URI(imdbString); 
//                        candidate.setIMDBMovieURI(imdbURI); 
//                    } 
//                } 
//                if (imdbURI != null) { 
//                    DemoUtilities.browse(imdbURI); 
//                } else { 
//                    showMessage("IMDB Link", 
//                            getString("TableDemo.imdbLinkNotFound", 
//                                    "Unable to locate IMDB URL for") + "\n" + 
//                                    candidate.getMovieTitle()); 
//                } 
// 
//            } catch (Exception ex) { 
//                ex.printStackTrace(); 
//            } 
//        } 
//    } 
// 
