package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")

@EqualsAndHashCode(callSuper = false)
@Data
public class Chat extends GestorVentanaChatAdapter {
	private JPanel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private JTextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	private Color color = new Color(240, 240, 240);
	Font fuente = new Font("Helvetica", Font.ITALIC, 13);

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

		GridBagConstraints gbLNick = new GridBagConstraints(0, 0, 33, 20, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLNick(), gbLNick);
		GridBagConstraints gbTNick = new GridBagConstraints(33, 0, 33, 20, 1, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTNick(), gbTNick);
		GridBagConstraints gbBRegister = new GridBagConstraints(66, 0, 34, 20, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getBRegistrar(), gbBRegister);

//Center

		GridBagConstraints gbLUsuarios = new GridBagConstraints(0, 20, 33, 10, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLUsuarios(), gbLUsuarios);
		GridBagConstraints gbaTaUsuarios = new GridBagConstraints(0, 30, 33, 50, 0, 1, GridBagConstraints.NORTHWEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTaUsuarios(), gbaTaUsuarios);
		GridBagConstraints gbaTaMensajes = new GridBagConstraints(33, 20, 67, 60, 0, 0, GridBagConstraints.NORTHWEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTaMensajes(), gbaTaMensajes);

//Inferior

		GridBagConstraints gbLMensaje = new GridBagConstraints(0, 80, 33, 20, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLMensaje(), gbLMensaje);
		GridBagConstraints gbTMensaje = new GridBagConstraints(33, 80, 33, 20, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTMensaje(), gbTMensaje);
		GridBagConstraints gbBEnviar = new GridBagConstraints(66, 80, 34, 20, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getBEnviar(), gbBEnviar);

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(600, 600);
		chat.setVisible(true);
		chat.addWindowListener(chat);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

}
