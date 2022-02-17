package ventanas;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
@Data
public class Chat extends Frame {

	// test para equipo de trabajo

	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	private Color color;
	private Image image;

	public Chat() {
		Panel panel = new Panel();
		this.add(panel);

		setLNick(new Label("NICK:"));
		setLUsuarios(new Label("USUARIOS"));
		setLMensaje(new Label("MENSAJE:"));
		setBEnviar(new Button("ENVIAR"));
		setBRegistrar(new Button("REGISTRAR"));
		setTNick(new TextField(30));
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(2, 20));

		panel.setLayout(new GridBagLayout());
		Color colorFondo = new Color(145, 244, 133);
		setBackground(colorFondo);

		GridBagConstraints gbLNick = new GridBagConstraints(0, 0, 5, 1, 0.2, 0.05, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(getLNick(), gbLNick);

		GridBagConstraints gbTNick = new GridBagConstraints(5, 0, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(getTNick(), gbTNick);

		GridBagConstraints gbBRegistrar = new GridBagConstraints(6, 0, 4, 1, 0.6, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 10, 0, 0), 20, 20);
		panel.add(getBRegistrar(), gbBRegistrar);

		GridBagConstraints gbLUsuarios = new GridBagConstraints(0, 1, 3, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(getLUsuarios(), gbLUsuarios);

		GridBagConstraints gbTaUsuarios = new GridBagConstraints(0, 2, 3, 1, 0, 1.2, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 10, 0, 25), 0, 0);
		panel.add(getTaUsuarios(), gbTaUsuarios);

		GridBagConstraints gbTaMensajes = new GridBagConstraints(4, 1, 7, 8, 0, 0.5, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 35), 0, 0);
		panel.add(getTaMensajes(), gbTaMensajes);

		GridBagConstraints gbLMensaje = new GridBagConstraints(0, 9, 4, 1, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(25, 0, 10, 0), 0, 0);
		panel.add(getLMensaje(), gbLMensaje);

		GridBagConstraints gbTMensaje = new GridBagConstraints(4, 9, 5, 1, 0.4, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(25, 0, 10, 0), 0, 0);
		panel.add(getTMensaje(), gbTMensaje);

		GridBagConstraints gbBEnviar = new GridBagConstraints(9, 9, 2, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(25, 25, 10, 0), 30, 15);
		panel.add(getBEnviar(), gbBEnviar);

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(500, 500);
		chat.setVisible(true);
	}

}
