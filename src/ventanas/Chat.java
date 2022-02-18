package ventanas;

//import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
//import java.awt.Label;
//import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")

@EqualsAndHashCode(callSuper = false)
@Data
public class Chat extends JFrame {
	private JPanel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private JTextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	private Color color = new Color(0, 150, 175);
	Font fuente=new Font("Arial", Font.ITALIC, 15);

	public Chat() {
//		setPGlobal(new JPanel());
//		setPSuperior(new Panel());
//		setPCentral(new Panel());
//		setPInferior(new Panel());
//		setPCentralIzquierda(new Panel());
//		setPCentralIzquierdaSuperior(new Panel());
//		setPCentralIzquierdaInferior(new Panel());
		setLNick(new JLabel("NICK:"));
		setLUsuarios(new JLabel("USUARIOS:"));
		setLMensaje(new JLabel("MENSAJE:"));
		setBEnviar(new JButton("ENVIAR"));
		setBRegistrar(new JButton("REGISTRAR"));
		setTNick(new JTextField());
		setTMensaje(new JTextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(20, 1));
		getTaUsuarios().setEditable(false);
		getTaMensajes().setEditable(false);

//		  getPSuperior().setLayout(new FlowLayout()); getPSuperior().add(getLNick());
//		 getPSuperior().add(getTNick()); getPSuperior().add(getBRegistrar());
//		 getPSuperior().setBackground(Color.GRAY);
//		 
//		  getPInferior().setLayout(new FlowLayout());
//		  getPInferior().add(getLMensaje()); getPInferior().add(getTMensaje());
//		  getPInferior().add(getBEnviar()); getPInferior().setBackground(Color.PINK);
//		  
//		  getPCentralIzquierdaSuperior().setLayout(new FlowLayout());
//		  getPCentralIzquierdaSuperior().add(getLUsuarios());
//		  
//		  getPCentralIzquierdaInferior().setLayout(new BorderLayout());
//		  getPCentralIzquierdaInferior().add(getTaUsuarios(),BorderLayout.CENTER);
//		  
//		  getPCentralIzquierda().setLayout(new BorderLayout());
//		  getPCentralIzquierda().add(getPCentralIzquierdaSuperior(),BorderLayout.NORTH);
//		  getPCentralIzquierda().add(getPCentralIzquierdaInferior(),BorderLayout.CENTER);
//		  
//		  getPCentral().setLayout(new BorderLayout());
//		  getPCentral().add(getPCentralIzquierda(),BorderLayout.WEST);
//		  getPCentral().add(getTaMensajes(),BorderLayout.CENTER);
//		  
//		  
//		  
//		  getContentPane().setLayout(new BorderLayout());
//		  getContentPane().add(getPSuperior(),BorderLayout.NORTH);
//		  getContentPane().add(getPInferior(),BorderLayout.SOUTH);
//		  getContentPane().add(getPCentral(),BorderLayout.CENTER);
//		  
//		  this.setLayout(new BorderLayout());
//		  this.add(getContentPane(),BorderLayout.CENTER);
		
		//this.add(getPGlobal());
		getContentPane().setLayout(new GridBagLayout());
		getContentPane().setBackground(color);
		getContentPane().setFont(fuente);
//Superior

		GridBagConstraints gbLNick = new GridBagConstraints(0, 0, 1, 1, 0, 10, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLNick(), gbLNick);
//		getLNick().setBackground(Color.PINK);
		GridBagConstraints gbTNick = new GridBagConstraints(1, 0, 1, 1, 40, 10, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTNick(), gbTNick);
		GridBagConstraints gbBRegister = new GridBagConstraints(2, 0, 1, 1, 30, 10, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0);
		getContentPane().add(getBRegistrar(), gbBRegister);

//Center

		GridBagConstraints gbLUsuarios = new GridBagConstraints(0, 1, 1, 1, 30, 1, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLUsuarios(), gbLUsuarios);
		GridBagConstraints gbaTaUsuarios = new GridBagConstraints(0, 2, 1, 1, 0, 10, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTaUsuarios(), gbaTaUsuarios);
		GridBagConstraints gbaTaMensajes = new GridBagConstraints(1, 1, 2, 2, 90, 10, GridBagConstraints.EAST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTaMensajes(), gbaTaMensajes);

//Inferior

		GridBagConstraints gbLMensaje = new GridBagConstraints(0, 3, 1, 1, 0, 10, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getLMensaje(), gbLMensaje);
		GridBagConstraints gbTMensaje = new GridBagConstraints(1, 3, 1, 1, 80, 10, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getContentPane().add(getTMensaje(), gbTMensaje);
		GridBagConstraints gbBEnviar = new GridBagConstraints(2, 3, 1, 1, 15, 15, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0);
		getContentPane().add(getBEnviar(), gbBEnviar);

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(800, 800);
		chat.setVisible(true);
		chat.addWindowListener(new GestorVentanaChatAdapter());
	}

}
