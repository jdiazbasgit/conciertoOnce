package ventanas;

import lombok.Data;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
@Data
public class Chat extends Frame {
	private Panel pGlobal,pSuperior,pCentral,pInferior,pCentralIzquierda,pCentralIzquierdaSuperior,pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar,bEnviar;
	private TextField tNick,tMensaje;
	private TextArea taUsuarios,taMensajes;
	//cambio cosas
	
	
	public Chat() {
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
		setTNick(new TextField(80));
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea());
		
		getPSuperior().setLayout(new FlowLayout());
		getPSuperior().add(getLNick());
		getPSuperior().add(getTNick());
		getPSuperior()add.()getBRegistrar();
		getPSuperior().setBackground(Color.GRAY);
		
		getPInferior().setLayout(new FlowLayout());
		getPInferior().add(getLMensaje());
		getPInferior().add(getTMensaje());
		getPInferior().add(getBEnviar());
		getPSuperior().setBackground(Color.PINK);
		
		getPGlobal().setLayout(new BorderLayout());
		getPGlobal().add(getPSuperior(),BorderLayout.NORTH);
		getPGlobal().add(getPInferior(),BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(getPGlobal(),BorderLayout.CENTER);
		
	}
	
	public static void main (String Args[]) {
		Chat chat = new Chat();
		chat.setSize(500,500);
		chat.setVisible(true);
	}

}
