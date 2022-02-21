package ventanas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.TextArea;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
@Data
public class Chat extends JFrame {
	@SuppressWarnings("unused")
	private JPanel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
	public static final String IP_SERVIDOR="192.168.1.44";
	public static final int PUERTO_ESCUCHA_REGISTRO_SERVIDOR=5000;
	public static final int PUERTO_ENVIO_REGISTRO_SERVIDOR=5001;
	public static final int PUERTO_ENVIO_REGISTRO_CLIENTE=5002;
	public static final int PUERTO_ESCUCHA_REGISTRO_CLIENTE=5003;
	public static final int PUERTO_DESCONEXION=5004;
	private Panel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private JTextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	
	
	
	
	private Optional<Map<String, String>> usuarios;

	public Chat() {
		setUsuarios(Optional.of(new HashMap<>()));
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

		// L�nea de arriba--------------------------------------

		// JL�bel del Nick
		GridBagConstraints gbclNick = new GridBagConstraints(0, 0, 2, 1, 2, 1, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 4), 0, 0);
		getContentPane().add(lNick, gbclNick);

		// JtextField del Nick
		GridBagConstraints gbctNick = new GridBagConstraints(2, 0, 1, 1, 3, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(tNick, gbctNick);

		// JBot�n de registrar
		GridBagConstraints gbcbRegistrar = new GridBagConstraints(3, 0, 1, 1, 1, 2, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0);
		getContentPane().add(bRegistrar, gbcbRegistrar);

		// L�nea Central------------------------------------------

		// JText�rea del centro
		GridBagConstraints gbctaMensajes = new GridBagConstraints(1, 1, 3, 2, 9, 0, GridBagConstraints.WEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(taMensajes, gbctaMensajes);

		// L�nea de Abajo------------------------------------------------

		// JL�bel Mensaje
		GridBagConstraints gbclMensaje = new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 4), 0, 0);
		getContentPane().add(lMensaje, gbclMensaje);

		// JtextField de Mensaje
		GridBagConstraints gbctMensaje = new GridBagConstraints(2, 3, 1, 1, 3, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(tMensaje, gbctMensaje);

		// JBot�n de enviar
		GridBagConstraints gbcbEnviar = new GridBagConstraints(3, 3, 1, 1, 4, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0);
		getContentPane().add(bEnviar, gbcbEnviar);

		// Lateral izquierdo-------------------------------------

		// JL�bel Usuarios
		GridBagConstraints gbclUsuarios = new GridBagConstraints(0, 1, 1, 1, 1, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(lUsuarios, gbclUsuarios);

		// JText�rea de Usuarios
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