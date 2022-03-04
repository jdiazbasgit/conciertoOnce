package trabajo;

import java.util.Arrays;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import paneles.PanelDialog;
import paneles.PanelTabla;

public class MostrarPaneles {
    private static final String[] NOMBRES_COLUMNAS_TB_EMPRESAS = { "ID", "Descripcion" };
    private static final String[] NOMBRES_COLUMNAS_TB_HIJOS = { "ID", "Chicos", "Chicas" };    
	private static final String[][] DATOS_TB_EMPRESAS = { { "1", "ONCE" }, { "2", "Capgemini" }, { "3", "NTT DATA" },
			{ "4", "HP" }, { "5", "Ibermática" }, { "6", "T-Systems Iberia" }, { "7", "Indra" },
			{ "8", "Hard2bit Cybersecurity" }, { "9", "Life Games" }, { "10", "Second Window" }, { "11", "Movired" },
			{ "12", "Grupo Digital" },
			{ "16", "ONCE" }, { "17", "Capgemini" }, { "18", "NTT DATA" },
			{ "4", "HP" }, { "5", "Ibermática" }, { "6", "T-Systems Iberia" }, { "7", "Indra" },
			{ "8", "Hard2bit Cybersecurity" }, { "9", "Life Games" }, { "10", "Second Window" }, { "11", "Movired" },
			{ "12", "Grupo Digital" },
			{ "13", "ONCE" }, { "14", "Capgemini" }, { "15", "NTT DATA" },
			{ "4", "HP" }, { "5", "Ibermática" }, { "6", "T-Systems Iberia" }, { "7", "Indra" },
			{ "8", "Hard2bit Cybersecurity" }, { "9", "Life Games" }, { "10", "Second Window" }, { "11", "Movired" },
			{ "12", "Grupo Digital" },
			{ "1", "ONCE" }, { "2", "Capgemini" }, { "3", "NTT DATA" },
			{ "4", "HP" }, { "5", "Ibermática" }, { "6", "T-Systems Iberia" }, { "7", "Indra" },
			{ "8", "Hard2bit Cybersecurity" }, { "9", "Life Games" }, { "10", "Second Window" }, { "11", "Movired" },
			{ "12", "Grupo Digital" }};
	private static final String[][] DATOS_TB_HIJOS = { { "1", "0","0" }, { "2",  "0","1" }, { "3",  "1","0" },
			{ "4",  "1","1" }, { "5",  "1","2" }, { "6",  "2","1" }, { "7",  "2","2" },
			{ "8", "3","2" }, { "9",  "2","3" }, { "10",  "3","3" },
			{ "11",  "0","3" }, { "12",  "0","2" }, { "13",  "3","0" }, { "14",  "2","0" },};
	private static final String TITULO_PANEL_EMPRESAS="EMPRESAS";
	private static final String TEXTO_BOTON_EMPRESAS="Crear Empresa";
	private static final String TITULO_PANEL_HIJOS="HIJOS";
	private static final String TEXTO_BOTON_HIJOS="Crear Datos Hijos";
	private static final String[] LABELS_HIJOS = { "Chicos","Chicas" };
	private static final String[] LABELS_EMPRESA = { "Nombre","Cif" };
	private static final JComponent[] COMPONENTES_HIJOS = { new JSpinner(new SpinnerNumberModel(0, 0, 25, 1)),
															new JSpinner(new SpinnerNumberModel(0, 0, 25, 1))};
	private static final JComponent[] COMPONENTES_EMPRESA = {new JTextField(30),new JTextField(30) };
	public static void main(String[] args) {
		 SwingUtilities.invokeLater( () -> {	           
            	JFrame ventana = new JFrame();
            	PanelTabla panelTabla = new PanelTabla(DATOS_TB_EMPRESAS,NOMBRES_COLUMNAS_TB_EMPRESAS,TITULO_PANEL_EMPRESAS,TEXTO_BOTON_EMPRESAS);
            	panelTabla.addBotonListener(e-> {
            		
            		PanelDialog panelDialog = new PanelDialog(LABELS_EMPRESA,COMPONENTES_EMPRESA,"Guardar");
            		JDialog empresaDialog = new JDialog(ventana, "Crear Empresa", true);
            		empresaDialog.setContentPane(panelDialog);
            		empresaDialog.setResizable(false);
            		empresaDialog.pack();
            		empresaDialog.setSize(ventana.getWidth(), ventana.getHeight()/3);
            		empresaDialog.setVisible(true);
            	});
        		ventana.add(panelTabla);
        		ventana.pack();
        		ventana.setLocationRelativeTo(null);
        		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        		ventana.setVisible(true);	            
	     });
		 SwingUtilities.invokeLater( () -> {	           
         	JFrame ventana = new JFrame();
         	PanelTabla panelTabla =new PanelTabla(DATOS_TB_HIJOS,NOMBRES_COLUMNAS_TB_HIJOS,TITULO_PANEL_HIJOS,TEXTO_BOTON_HIJOS);
         	panelTabla.addBotonListener(e-> {
        		
        		PanelDialog panelDialog = new PanelDialog(LABELS_HIJOS,COMPONENTES_HIJOS,"Guardar");
        		JDialog empresaDialog = new JDialog(ventana, "Crear Hijos", true);
        		empresaDialog.setResizable(false);
        		empresaDialog.setContentPane(panelDialog);
        		empresaDialog.pack();
        		empresaDialog.setSize(ventana.getWidth(), ventana.getHeight()/3);
        		empresaDialog.setVisible(true);
        	});
     		ventana.add(panelTabla);
     		ventana.pack();
     		//ventana.setLocationRelativeTo(null);
     		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     		ventana.setVisible(true);	            
	     });	
	}
}
