package paneles;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PanelDialog extends JPanel {
	private static final long serialVersionUID = -2169936448823426878L;
	
	private JButton boton;
	private Map<String,Component> propiedades = new HashMap<>();
	
	public PanelDialog(String[] nombreCampos, Component[] componentes, String txtBoton) {		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(Box.createRigidArea(new Dimension(0,10)));
		
		for(int i=0; i<nombreCampos.length; i++) {
			Box fila = Box.createHorizontalBox();
			fila.add(Box.createGlue());
			fila.add(new JLabel(nombreCampos[i]));
			fila.add(Box.createHorizontalStrut(20));
			fila.add(componentes[i]);
			fila.add(Box.createGlue());
			this.add(fila);
			this.propiedades.put(nombreCampos[i],componentes[i]);
		}		
		
		this.add(Box.createRigidArea(new Dimension(0,20)));
		boton=new JButton(txtBoton);
		boton.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(boton);
		this.add(Box.createRigidArea(new Dimension(0,10)));
		Border empty = BorderFactory.createEmptyBorder(10,30,10,30);
		this.setBorder(empty);
	}
	
	public PanelDialog(Collection<String> nombreCampos, Collection<JComponent> componentes, String txtBoton) {	
		this(nombreCampos.toArray(new String[nombreCampos.size()]), componentes.toArray(new JComponent[componentes.size()]),txtBoton);
	}

	public void addBotonListener(ActionListener listenerBoton) {
		this.getBoton().addActionListener(listenerBoton);
	}

}
