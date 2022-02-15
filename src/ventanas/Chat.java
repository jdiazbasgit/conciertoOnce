package ventanas;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class Chat extends Frame {
	// private Panel
	// pGlobal,pSuperior,pCentral,pInferior,pCentralIzquierda,pCentralIzquierdaSuperior,pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;

	public Chat() {
		Panel panel = new Panel();
		this.add(panel);
Panel p1= new Panel();
Panel p2= new Panel();
Panel p3= new Panel();
p1.setBackground(Color.red);
p2.setBackground(Color.BLUE);
p3.setBackground(Color.GREEN);

		setLNick(new Label("NICK:"));
		setLUsuarios(new Label("USUARIOS"));
		setLMensaje(new Label("MENSAJE:"));
		setBEnviar(new Button("ENVIAR"));
		setBRegistrar(new Button("REGISTRAR"));
		setTNick(new TextField(50));
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(2, 20));

		panel.setLayout(new GridBagLayout());

		GridBagConstraints gb1 = new GridBagConstraints(0, 0, 2, 1, 0.2, 0.2, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(p1,gb1);
		
		GridBagConstraints gb2 = new GridBagConstraints(2, 0, 1, 1, 0.4, 0.4, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(p2,gb2);
		
		GridBagConstraints gb3 = new GridBagConstraints(3, 0, 1, 1, 0.4, 0.4, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(p3,gb3);
		
		
		
		GridBagConstraints gb4 = new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 10, 0, 10), 20, 0);
		panel.add(getLUsuarios(),gb4);
		
		GridBagConstraints gb5 = new GridBagConstraints(0, 2, 2, 1, 0, 0.6, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(getTaUsuarios(),gb5);
		
		GridBagConstraints gb6 = new GridBagConstraints(1, 1, 2, 2, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(getTaMensajes(),gb6);
		
		
		
		GridBagConstraints gb7 = new GridBagConstraints(0, 4, 2, 1, 0, 0.2, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(getLMensaje(),gb7);
		
		GridBagConstraints gb8 = new GridBagConstraints(2, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(getTMensaje(),gb8);
		
		GridBagConstraints gb9 = new GridBagConstraints(3, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(getBEnviar(),gb9);
		
		

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(500, 500);
		chat.setVisible(true);
	}

}
