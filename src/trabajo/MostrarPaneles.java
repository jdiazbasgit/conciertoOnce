package trabajo;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import paneles.EmpresasPanel;

public class MostrarPaneles {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.add(new EmpresasPanel());
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

}
