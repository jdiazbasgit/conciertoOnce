package ventanas;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowEvent;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")

@EqualsAndHashCode(callSuper = false)
@Data
public class Chat extends GestorVentanaChatAdapter {
	private Panel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	private Color color = new Color(0, 150, 175);
	Font fuente = new Font("Arial", Font.ITALIC, 15);

	public Chat() {
		setPGlobal(new Panel());
//		setPSuperior(new Panel());
//		setPCentral(new Panel());
//		setPInferior(new Panel());
//		setPCentralIzquierda(new Panel());
//		setPCentralIzquierdaSuperior(new Panel());
//		setPCentralIzquierdaInferior(new Panel());
		setLNick(new Label("NICK:"));
		setLUsuarios(new Label("USUARIOS:"));
		setLMensaje(new Label("MENSAJE:"));
		setBEnviar(new Button("ENVIAR"));
		setBRegistrar(new Button("REGISTRAR"));
		setTNick(new TextField());
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(20, 1));

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
//		  getPGlobal().setLayout(new BorderLayout());
//		  getPGlobal().add(getPSuperior(),BorderLayout.NORTH);
//		  getPGlobal().add(getPInferior(),BorderLayout.SOUTH);
//		  getPGlobal().add(getPCentral(),BorderLayout.CENTER);
//		  
//		  this.setLayout(new BorderLayout());
//		  this.add(getPGlobal(),BorderLayout.CENTER);

		this.add(getPGlobal());
		getPGlobal().setLayout(new GridBagLayout());
		getPGlobal().setBackground(color);
		getPGlobal().setFont(fuente);

//Superior

		GridBagConstraints gbLNick = new GridBagConstraints(0, 0, 33, 20, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getLNick(), gbLNick);
		GridBagConstraints gbTNick = new GridBagConstraints(33, 0, 33, 20, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getTNick(), gbTNick);
		GridBagConstraints gbBRegister = new GridBagConstraints(66, 0, 34, 20, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getBRegistrar(), gbBRegister);

//Center

		GridBagConstraints gbLUsuarios = new GridBagConstraints(0, 20, 20, 10, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getLUsuarios(), gbLUsuarios);
		GridBagConstraints gbaTaUsuarios = new GridBagConstraints(0, 30, 20, 50, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getTaUsuarios(), gbaTaUsuarios);
		GridBagConstraints gbaTaMensajes = new GridBagConstraints(20, 20, 80, 60, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getTaMensajes(), gbaTaMensajes);

//Inferior

		GridBagConstraints gbLMensaje = new GridBagConstraints(0, 80, 33, 20, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getLMensaje(), gbLMensaje);
		GridBagConstraints gbTMensaje = new GridBagConstraints(33, 80, 33, 20, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getTMensaje(), gbTMensaje);
		GridBagConstraints gbBEnviar = new GridBagConstraints(66, 80, 34, 20, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getBEnviar(), gbBEnviar);

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
