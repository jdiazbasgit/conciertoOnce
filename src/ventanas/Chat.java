package ventanas;

import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Color;
import java.awt.GridBagConstraints;

@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = false)
public class Chat extends JFrame {
	private JPanel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private JTextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;

	public Chat() {
		setLocation(200, 20);
		setTitle("   CHAT DEL EQUIPO 3 - ANNA Y ANTONIO");
		setPGlobal(new JPanel());
		setPSuperior(new JPanel());
		setPCentral(new JPanel());
		setPInferior(new JPanel());
		setPCentralIzquierda(new JPanel());
		setPCentralIzquierdaSuperior(new JPanel());
		setPCentralIzquierdaInferior(new JPanel());
		setLNick(new JLabel("NICK:"));
		setLUsuarios(new JLabel("USUARIOS"));
		setLMensaje(new JLabel("MENSAJE:"));
		setBEnviar(new JButton("ENVIAR"));
		setBRegistrar(new JButton("REGISTRAR"));
		setTNick(new JTextField(20));
		setTMensaje(new JTextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(20, 2));
		
		//no se puede escribir en los textAreas
		getTaUsuarios().setEditable(false);
		getTaMensajes().setEditable(false);
	
		
		getContentPane().setBackground(new Color(166, 210, 222));
		
		getContentPane().setLayout(new GridBagLayout());

		// Línea de arriba--------------------------------------

		// JLábel del Nick
		GridBagConstraints gbclNick = new GridBagConstraints(0, 0, 2, 1, 2, 1, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 4), 0, 0);
		getContentPane().add(lNick, gbclNick);

		// JtextField del Nick
		GridBagConstraints gbctNick = new GridBagConstraints(2, 0, 1, 1, 3, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(tNick, gbctNick);

		// JBotón de registrar
		GridBagConstraints gbcbRegistrar = new GridBagConstraints(3, 0, 1, 1, 1, 2, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0);
		getContentPane().add(bRegistrar, gbcbRegistrar);

		// Línea Central------------------------------------------

		// JTextÁrea del centro
		GridBagConstraints gbctaMensajes = new GridBagConstraints(1, 1, 3, 2, 9, 0, GridBagConstraints.WEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(taMensajes, gbctaMensajes);

		// Línea de Abajo------------------------------------------------

		// JLábel Mensaje
		GridBagConstraints gbclMensaje = new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 4), 0, 0);
		getContentPane().add(lMensaje, gbclMensaje);

		// JtextField de Mensaje
		GridBagConstraints gbctMensaje = new GridBagConstraints(2, 3, 1, 1, 3, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(tMensaje, gbctMensaje);

		// JBotón de enviar
		GridBagConstraints gbcbEnviar = new GridBagConstraints(3, 3, 1, 1, 4, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0);
		getContentPane().add(bEnviar, gbcbEnviar);

		// Lateral izquierdo-------------------------------------

		// JLábel Usuarios
		GridBagConstraints gbclUsuarios = new GridBagConstraints(0, 1, 1, 1, 1, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(lUsuarios, gbclUsuarios);

		// JTextÁrea de Usuarios
		GridBagConstraints gbctAUsuarios = new GridBagConstraints(0, 2, 1, 1, 0, 7, GridBagConstraints.EAST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(taUsuarios, gbctAUsuarios);
		
		
		
		


	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(1200, 800);
		chat.setVisible(true);
		chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}