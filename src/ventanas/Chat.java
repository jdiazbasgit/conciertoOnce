package ventanas;

import java.awt.Color;
import java.awt.GridBagConstraints;
//import java.awt.FlowLayout;
//import java.awt.Color;
//import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
@Data

public class Chat extends JFrame {

	public static final String IP_SERVIDOR = "192.168.1.44";
	public static final int PUERTO_ESCUCHA_REGISTRO_SERVIDOR = 5000;
	public static final int PUERTO_ENVIO_REGISTRO_SERVIDOR = 5001;
	public static final int PUERTO_ENVIO_REGISTRO_CLIENTE = 5002;
	public static final int PUERTO_ESCUCHA_REGISTRO_CLIENTE = 5003;
	public static final int PUERTO_DESCONEXION = 5004;
	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private JTextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	
	
	
	
	private Optional<Map<String, String>> usuarios;

	public Chat() {
		setUsuarios(Optional.of(new HashMap<>()));
		setLocation(200, 20);
		setTitle("   CHAT DEL EQUIPO 3 - ANNA Y ANTONIO");
		
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

		

		// JtextField del Nick
		// Lábel del Nick
		GridBagConstraints gbclNick = new GridBagConstraints(0, 0, 2, 1, 2, 1, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(lNick, gbclNick);

		// textField del Nick
		GridBagConstraints gbctNick = new GridBagConstraints(2, 0, 1, 1, 3, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(tNick, gbctNick);

		// JBotón de registrar
		// Botón de registrar
		GridBagConstraints gbcbRegistrar = new GridBagConstraints(3, 0, 1, 1, 1, 2, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0);
		getContentPane().add(bRegistrar, gbcbRegistrar);

		// Línea Central------------------------------------------

		// JTextÁrea del centro
		// TextArea del centro
		GridBagConstraints gbctaMensajes = new GridBagConstraints(1, 1, 3, 2, 9, 0, GridBagConstraints.WEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(taMensajes, gbctaMensajes);

		// Línea de Abajo------------------------------------------------

		// JLábel Mensaje
		GridBagConstraints gbclMensaje = new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 4), 0, 0);
		getContentPane().add(lMensaje, gbclMensaje);

		// JtextField de Mensaje
		
		
		// textField de Mensaje
		GridBagConstraints gbctMensaje = new GridBagConstraints(2, 3, 1, 1, 3, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(tMensaje, gbctMensaje);

		// JBotón de enviar
		// Botón de enviar
		GridBagConstraints gbcbEnviar = new GridBagConstraints(3, 3, 1, 1, 4, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0);
		getContentPane().add(bEnviar, gbcbEnviar);

		// Lateral izquierdo-------------------------------------

		// JLábel Usuarios
		// Lábel Usuarios
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

	}

}