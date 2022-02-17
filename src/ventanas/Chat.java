package ventanas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
@Data
public class Chat extends JFrame {

	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private JTextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	private Color Color;
	private ImageIcon Image;

	public Chat() {
		JPanel jpanel = new JPanel();
		this.add(jpanel);

		setLNick(new JLabel("NICK:"));
		setLUsuarios(new JLabel("USUARIOS"));
		setLMensaje(new JLabel("MENSAJE:"));
		setBEnviar(new JButton("ENVIAR"));
		setBRegistrar(new JButton("REGISTRAR"));
		setTNick(new JTextField(30));
		setTMensaje(new JTextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(2, 20));
		getTaUsuarios().setEditable(false);
		getTaMensajes().setEditable(false);

		jpanel.setLayout(new GridBagLayout());
		Color colorFondo = new Color(215, 244, 233);
		setBackground(colorFondo);

		GridBagConstraints gbLNick = new GridBagConstraints(0, 0, 5, 1, 0.2, 0.05, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 10), 0, 0);
		jpanel.add(getLNick(), gbLNick);

		GridBagConstraints gbTNick = new GridBagConstraints(5, 0, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		jpanel.add(getTNick(), gbTNick);

		GridBagConstraints gbBRegistrar = new GridBagConstraints(6, 0, 4, 1, 0.6, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 10, 0, 0), 20, 20);
		jpanel.add(getBRegistrar(), gbBRegistrar);

		GridBagConstraints gbLUsuarios = new GridBagConstraints(0, 1, 3, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 10, 0), 0, 0);
		jpanel.add(getLUsuarios(), gbLUsuarios);

		GridBagConstraints gbTaUsuarios = new GridBagConstraints(0, 2, 3, 1, 0, 1.2, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		jpanel.add(getTaUsuarios(), gbTaUsuarios);

		GridBagConstraints gbTaMensajes = new GridBagConstraints(4, 1, 7, 8, 0, 0.5, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		jpanel.add(getTaMensajes(), gbTaMensajes);

		GridBagConstraints gbLMensaje = new GridBagConstraints(0, 9, 4, 1, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(25, 0, 10, 10), 0, 0);
		jpanel.add(getLMensaje(), gbLMensaje);

		GridBagConstraints gbTMensaje = new GridBagConstraints(4, 9, 5, 1, 0.4, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(25, 0, 10, 0), 0, 0);
		jpanel.add(getTMensaje(), gbTMensaje);

		GridBagConstraints gbBEnviar = new GridBagConstraints(9, 9, 2, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(25, 25, 10, 0), 30, 15);
		jpanel.add(getBEnviar(), gbBEnviar);

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(500, 500);
		chat.setVisible(true);
	}

}
