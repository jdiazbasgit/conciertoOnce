package ventanas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
@Data
public class Chat extends JFrame {

	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	private Color color;

	public Chat() {
		
		

		setLNick(new JLabel("NICK:"));
		setLUsuarios(new JLabel("USUARIOS"));
		setLMensaje(new JLabel("MENSAJE:"));
		setBEnviar(new JButton("ENVIAR"));
		setBRegistrar(new JButton("REGISTRAR"));
		setTNick(new TextField(50));
		setTMensaje(new TextField(100));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(2, 20));
		getTaUsuarios().setEditable(false);
		getTaMensajes().setEditable(false);

		getContentPane().setLayout(new GridBagLayout());
		Color color = new Color(232, 241, 242);
		setBackground(color);

		GridBagConstraints gbLNick = new GridBagConstraints(0, 0, 6, 1, 1, 0.1,  GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLNick(), gbLNick);

		GridBagConstraints gbTNick = new GridBagConstraints(6, 0, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTNick(), gbTNick);

		GridBagConstraints gbBRegistrar = new GridBagConstraints(7, 0, 3, 1, 0.8, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0);
		getContentPane().add(getBRegistrar(), gbBRegistrar);

		GridBagConstraints gbLUsuarios = new GridBagConstraints(0, 1, 3, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLUsuarios(), gbLUsuarios);

		GridBagConstraints gbTaUsuarios = new GridBagConstraints(0, 2, 3, 6, 0, 1.8, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTaUsuarios(), gbTaUsuarios);

		GridBagConstraints gbTaMensajes = new GridBagConstraints(4, 1, 7, 7, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0 ), 0, 0);
		getContentPane().add(getTaMensajes(), gbTaMensajes);

		GridBagConstraints gbLMensaje = new GridBagConstraints(0, 9, 5, 1, 0.1, 0.1, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLMensaje(), gbLMensaje);

		GridBagConstraints gbTMensaje = new GridBagConstraints(5, 9, 3, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTMensaje(), gbTMensaje);

		GridBagConstraints gbBEnviar = new GridBagConstraints(8, 9, 3, 1, 0.8, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0);
		getContentPane().add(getBEnviar(), gbBEnviar);

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(500, 500);
		chat.setVisible(true);
	}

}
