package ventanas;

import java.awt.Color;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import lombok.Data;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

@SuppressWarnings({ "serial", "unused" })
@Data
public class Chat extends JFrame {
	private JPanel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private JTextField tNick, tMensaje;
	private JTextArea taUsuarios, taMensajes;
	// cambio cosas

	/**
	 * 
	 */
	public Chat() {
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
		setTaMensajes(new JTextArea());
		setTaUsuarios(new JTextArea(2, 20));
		getTaUsuarios().setEditable(false);
        getTaMensajes().setEditable(false);
		/*
		 * getPSuperior().setLayout(new FlowLayout()); getPSuperior().add(getLNick());
		 * getPSuperior().add(getTNick()); getPSuperior().add(getBRegistrar());
		 * getPSuperior().setBackground(Color.GRAY); ======= /*
		 * getPSuperior().setLayout(new FlowLayout()); getPSuperior().add(getLNick());
		 * getPSuperior().add(getTNick()); getPSuperior().add(getBRegistrar());
		 * getPSuperior().setBackground(Color.GRAY);
		 * 
		 * getPInferior().setLayout(new FlowLayout());
		 * getPInferior().add(getLMensaje()); getPInferior().add(getTMensaje());
		 * getPInferior().add(getBEnviar()); getPInferior().setBackground(Color.PINK);
		 * 
		 * getPCentralIzquierdaSuperior().setLayout(new FlowLayout());
		 * getPCentralIzquierdaSuperior().add(getLUsuarios());
		 * 
		 * getPCentralIzquierdaInferior().setLayout(new BorderLayout());
		 * getPCentralIzquierdaInferior().add(getTaUsuarios(),BorderLayout.CENTER);
		 * 
		 * getPCentralIzquierda().setLayout(new BorderLayout());
		 * getPCentralIzquierda().add(getPCentralIzquierdaSuperior(),BorderLayout.NORTH)
		 * ;
		 * getPCentralIzquierda().add(getPCentralIzquierdaInferior(),BorderLayout.CENTER
		 * );
		 * 
		 * getPCentral().setLayout(new BorderLayout());
		 * getPCentral().add(getPCentralIzquierda(),BorderLayout.WEST);
		 * getPCentral().add(getTaMensajes(),BorderLayout.CENTER);
		 * 
		 * 
		 * 
		 * getPGlobal().setLayout(new BorderLayout());
		 * getPGlobal().add(getPSuperior(),BorderLayout.NORTH);
		 * getPGlobal().add(getPInferior(),BorderLayout.SOUTH);
		 * getPGlobal().add(getPCentral(),BorderLayout.CENTER);
		 * 
		 * this.setLayout(new BorderLayout());
		 * this.add(getPGlobal(),BorderLayout.CENTER);
		 */

		getPGlobal().setLayout(new GridBagLayout());
		this.add(pGlobal);
		getPGlobal().setBackground(Color.PINK);
		GridBagConstraints gb_LNick = new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(lNick, gb_LNick);
		GridBagConstraints gb_TNick = new GridBagConstraints(2, 0, 1, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(tNick, gb_TNick);

		GridBagConstraints gb_BRegistrar = new GridBagConstraints(3, 0, 1, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(bRegistrar, gb_BRegistrar);

		GridBagConstraints gb_LUsuarios = new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(lUsuarios, gb_LUsuarios);

		GridBagConstraints gb_TaUsuarios = new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(taUsuarios, gb_TaUsuarios);

		GridBagConstraints gb_LMensaje = new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(lMensaje, gb_LMensaje);

		GridBagConstraints gb_TMensaje = new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(tMensaje, gb_TMensaje);

		GridBagConstraints gb_BEnviar = new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(bEnviar, gb_BEnviar);

		GridBagConstraints gb_TaMensajes = new GridBagConstraints(1, 1, 3, 2, 7, 9, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(taMensajes, gb_TaMensajes);

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(500, 500);
		chat.setVisible(true);
	}

}
