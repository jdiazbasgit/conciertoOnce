package basedatos;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import lombok.Data;
@Data
public class DatosLaboralesDAO extends JFrame implements ActionListener,ChangeListener{
	//CAMBIAR VARIABLES
	private JTable tDatosLaborales;
	private JButton bAlta;
	private JLabel label = new JLabel("Descripcion");
	private JButton botonRegistroDialog = new JButton("Registrar");
	private Choice descripcion = new Choice();
	

	public DatosLaboralesDAO() {
		JPanel panel = new JPanel();
//		setContentPane(new JPanel());
		setBAlta(new JButton("Alta"));
		setTDatosLaborales(new JTable());
		
		getBAlta().addActionListener(this);
		panel.add(bAlta);
		//getContentPane().setLayout(new GridBagLayout());
	
		GridBagConstraints getTTDatosLaborales = new GridBagConstraints(1, 1, 3, 2, 9, 0, GridBagConstraints.WEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTDatosLaborales(), getTTDatosLaborales);
	}
	public static void main(String[] args) {
		DatosLaboralesDAO datosLaborales = new DatosLaboralesDAO();
		datosLaborales.setSize(1200, 800);
		datosLaborales.setVisible(true);
		datosLaborales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(getBAlta())) {
			System.out.println("boton");
			JDialog dialog = new JDialog(new JFrame(), "Registro Cargo", true);
			JPanel panel = new JPanel();
			
			
			dialog.add(panel);
			panel.setLayout(new GridBagLayout());
			GridBagConstraints  gbLabel= new GridBagConstraints(0,0,1,1,1,0,GridBagConstraints.CENTER,0,new Insets(0,0,0,0),0,0);
			panel.add(getLabel(),gbLabel);
			GridBagConstraints  gbTexto= new GridBagConstraints(0,1,5,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0);
			panel.add(getDescripcion(),gbTexto);
			GridBagConstraints  gbBoton= new GridBagConstraints(0,2,5,2,0,1,GridBagConstraints.CENTER,GridBagConstraints.CENTER,new Insets(0,0,0,0),0,0);
			panel.add(getBotonRegistroDialog(),gbBoton);
			
			//botonRegistroDialog.setHorizontalAlignment(JButton.CENTER);
			getBotonRegistroDialog().setPreferredSize(new Dimension(5, 10));
			

//			dialog.add(botonRegistroDialog);
			dialog.setSize(250, 250);
			dialog.setVisible(true);
		}
		if (e.getSource().equals(getBotonRegistroDialog())) {
			//aqui sentencia sql insert into
		}
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		//select dl.cargos_id from datos laborales as dl,cargos as c where dl.cargos_id=c.id
		
	}

}
