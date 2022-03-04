package proyecto.empleados;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper=false)
@Data
@SuppressWarnings("serial")
public class VentanaEmpleados extends JPanel implements ActionListener {

	public VentanaEmpleados() {

		TablaEmpleados tablaEmpleados = new TablaEmpleados();
		
		add(tablaEmpleados,BorderLayout.CENTER);

		JButton boton = new JButton("Alta Nuevos Empleados");

		JPanel panelBoton = new JPanel();
		add(boton, BorderLayout.CENTER);
		add(panelBoton,BorderLayout.SOUTH);
		boton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 JFrame jFrame = new JFrame();
	        String getMessage = JOptionPane.showInputDialog(jFrame, "Alta Nuevo Empleado");

	        JOptionPane.showMessageDialog(jFrame, "Introduzca un Nombre "+getMessage);
		
		
		System.out.println("funciona el botón");
		
	}

}
