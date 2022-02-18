package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;

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
public class Chat extends JFrame implements GestorVentanaChatAdapter {
	private JPanel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private JTextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	private Color color = new Color(240, 240, 240);
	Font fuente = new Font(Font.SANS_SERIF, Font.ITALIC, 13);

	public Chat() {
		setContentPane(new JPanel());
		setLNick(new JLabel("NICK:"));
		setLUsuarios(new JLabel("USUARIOS:"));
		setLMensaje(new JLabel("MENSAJE:"));
		setBEnviar(new JButton("ENVIAR"));
		setBRegistrar(new JButton("REGISTRAR"));
		setTNick(new JTextField(20));
		setTMensaje(new JTextField(300));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(20, 1));

		getContentPane().setLayout(new GridBagLayout());
		getContentPane().setBackground(color);
		getContentPane().setFont(fuente);

//Superior

		GridBagConstraints gbLNick = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLNick(), gbLNick);
		GridBagConstraints gbTNick = new GridBagConstraints(01, 0, 01, 1, 1, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTNick(), gbTNick);
		GridBagConstraints gbBRegister = new GridBagConstraints(02, 0, 01, 01, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getBRegistrar(), gbBRegister);

//Center

		GridBagConstraints gbLUsuarios = new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLUsuarios(), gbLUsuarios);
		GridBagConstraints gbaTaUsuarios = new GridBagConstraints(0, 02, 1, 1, 0, 1, GridBagConstraints.NORTHWEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTaUsuarios(), gbaTaUsuarios);
		GridBagConstraints gbaTaMensajes = new GridBagConstraints(01, 01, 2, 2, 0, 0, GridBagConstraints.NORTHWEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTaMensajes(), gbaTaMensajes);

//Inferior

		GridBagConstraints gbLMensaje = new GridBagConstraints(0, 03, 01, 01, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLMensaje(), gbLMensaje);
		GridBagConstraints gbTMensaje = new GridBagConstraints(01, 03, 01, 01, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTMensaje(), gbTMensaje);
		GridBagConstraints gbBEnviar = new GridBagConstraints(2, 3, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getBEnviar(), gbBEnviar);

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(600, 600);
		chat.setVisible(true);
		chat.addWindowListener(chat);
	}

}
