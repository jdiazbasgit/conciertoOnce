package ventanas;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
//import java.awt.FlowLayout;
//import java.awt.Color;
//import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ventanas.hilos.envio.HiloEnvioRegistroCliente;

@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = false)
public class Chat extends JFrame implements ActionListener {

	public static final String IP_SERVIDOR = "192.168.1.44";
	public static final int PUERTO_ESCUCHA_REGISTRO_SERVIDOR = 5000;
	public static final int PUERTO_ENVIO_REGISTRO_SERVIDOR = 5001;
	public static final int PUERTO_ENVIO_REGISTRO_CLIENTE = 5002;
	public static final int PUERTO_ESCUCHA_REGISTRO_CLIENTE = 5003;
	public static final int PUERTO_DESCONEXION = 5004;
	private Panel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	private Optional<Map<String, String>> usuarios;

	public Chat() {
		
		setUsuarios(Optional.of(new HashMap<>()));
		setLocation(200, 20);
		setTitle("   CHAT DEL EQUIPO 3 - ANNA Y ANTONIO");
		setPGlobal(new Panel());
		setPSuperior(new Panel());
		setPCentral(new Panel());
		setPInferior(new Panel());
		setPCentralIzquierda(new Panel());
		setPCentralIzquierdaSuperior(new Panel());
		setPCentralIzquierdaInferior(new Panel());
		setLNick(new Label("NICK:"));
		setLUsuarios(new Label("USUARIOS"));
		setLMensaje(new Label("MENSAJE:"));
		setBEnviar(new Button("ENVIAR"));
		setBRegistrar(new Button("REGISTRAR"));
		setTNick(new TextField(20));
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(20, 2));
		getBRegistrar().addActionListener(this);

		Panel panel = new Panel();
		this.add(panel);
		panel.setBackground(new Color(166, 210, 222));

		panel.setLayout(new GridBagLayout());

		// L�nea de arriba--------------------------------------

		// L�bel del Nick
		GridBagConstraints gbclNick = new GridBagConstraints(0, 0, 2, 1, 2, 1, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(lNick, gbclNick);

		// textField del Nick
		GridBagConstraints gbctNick = new GridBagConstraints(2, 0, 1, 1, 3, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(tNick, gbctNick);

		// Bot�n de registrar
		GridBagConstraints gbcbRegistrar = new GridBagConstraints(3, 0, 1, 1, 1, 2, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0);
		panel.add(bRegistrar, gbcbRegistrar);

		// L�nea Central------------------------------------------

		// TextArea del centro
		GridBagConstraints gbctaMensajes = new GridBagConstraints(1, 1, 3, 2, 9, 0, GridBagConstraints.WEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(taMensajes, gbctaMensajes);

		// L�nea de Abajo------------------------------------------------

		// L�bel Mensaje
		GridBagConstraints gbclMensaje = new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(lMensaje, gbclMensaje);

		// textField de Mensaje
		GridBagConstraints gbctMensaje = new GridBagConstraints(2, 3, 1, 1, 3, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(tMensaje, gbctMensaje);

		// Bot�n de enviar
		GridBagConstraints gbcbEnviar = new GridBagConstraints(3, 3, 1, 1, 4, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0);
		panel.add(bEnviar, gbcbEnviar);

		// Lateral izquierdo-------------------------------------

		// L�bel Usuarios
		GridBagConstraints gbclUsuarios = new GridBagConstraints(0, 1, 1, 1, 1, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(lUsuarios, gbclUsuarios);

		// Text�rea de Usuarios
		GridBagConstraints gbctAUsuarios = new GridBagConstraints(0, 2, 1, 1, 0, 7, GridBagConstraints.EAST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		panel.add(taUsuarios, gbctAUsuarios);

		/*
		
		*/
		// add el panel de arriva
		/*
		 * getPSuperior().setLayout(new FlowLayout()); getPSuperior().add(getLNick());
		 * getPSuperior().add(getTNick()); getPSuperior().add(getBRegistrar());
		 * getPSuperior().setBackground(Color.GRAY);
		 * 
		 * // add el panel de abajo
		 * 
		 * 
		 * getPInferior().setLayout(new FlowLayout());
		 * getPInferior().add(getLMensaje()); getPInferior().add(getTMensaje());
		 * getPInferior().add(getBEnviar()); getPInferior().setBackground(Color.GREEN);
		 * 
		 * // lateral izquierda superior
		 * 
		 * getPCentralIzquierdaSuperior().setLayout(new FlowLayout());
		 * getPCentralIzquierdaSuperior().add(getLUsuarios());
		 * 
		 * // lateral izquierda inferior
		 * 
		 * getPCentralIzquierdaInferior().setLayout(new BorderLayout());
		 * getPCentralIzquierdaInferior().add(getTaUsuarios(), BorderLayout.CENTER);
		 * 
		 * // pegar lateral izquierda arriba y abajo al panel izquierdo
		 * 
		 * 
		 * getPCentralIzquierda().setLayout(new BorderLayout());
		 * getPCentralIzquierda().add(getPCentralIzquierdaSuperior(),
		 * BorderLayout.NORTH);
		 * getPCentralIzquierda().add(getPCentralIzquierdaInferior(),
		 * BorderLayout.CENTER);
		 * 
		 * // colocar el panel central izquierda al oeste
		 * 
		 * getPCentral().setLayout(new BorderLayout());
		 * getPCentral().add(getPCentralIzquierda(), BorderLayout.WEST);
		 * getPCentral().add(getTaMensajes(), BorderLayout.CENTER);
		 *
		 * 
		 * 
		 * // coloco los paneles con borderLayout
		 * 
		 * getPGlobal().setLayout(new BorderLayout()); getPGlobal().add(getPSuperior(),
		 * BorderLayout.NORTH); getPGlobal().add(getPInferior(), BorderLayout.SOUTH);
		 * getPGlobal().add(getPCentral(), BorderLayout.CENTER);
		 * 
		 * 
		 * // creo el panel global
		 * 
		 * this.setLayout(new BorderLayout()); this.add(getPGlobal(),
		 * BorderLayout.CENTER);
		 */

//		 getBRegistrar().addActionListener(this) {
//		
//			public void actionPerformed(ActionEvent e) {
//				
//				//System.out.println("Has pulsado el boton");
//				//System.out.println(getTNick().getText() + " ha sido registrado");
//				
//			}
//
//			
//		 });

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nick;
		nick = getTNick().getText();
		if (e.getSource().equals(getBRegistrar())) {
			System.out.println("boton");
			
			
			if (getTNick().getText().equals("")) {
				getTaMensajes().append("Escribe nick \n");
				System.out.println("Introduce algo...");
			}
			HiloEnvioRegistroCliente registro = new HiloEnvioRegistroCliente();
			registro.start();
		}
		
	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		// chat.setSize(1560, 840);
		chat.setSize(1150, 800);
		chat.setVisible(true);
		chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}