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

@EqualsAndHashCode(callSuper = false)
@Data
@SuppressWarnings("serial")
public class VentanaEmpleado extends JPanel implements ActionListener {

	public VentanaEmpleado() {

		TablaEmpleado tablaEmpleados = new TablaEmpleado();

		add(tablaEmpleados, BorderLayout.CENTER);

		JButton boton = new JButton("Alta Nuevos Empleados");

		JPanel panelBoton = new JPanel();
		add(boton, BorderLayout.CENTER);
		add(panelBoton, BorderLayout.SOUTH);
		boton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JFrame jFrame = new JFrame();
		 JOptionPane.showInputDialog(jFrame, "Alta Nuevo Empleado");
		/*
		 * String getMessage =
		 * JOptionPane.showMessageDialog(jFrame, "Introduzca un Nombre " + getMessage);
		 */
		System.out.println("funciona el botón");

	}

}
