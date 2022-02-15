package ventanas;

import lombok.Data;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

@SuppressWarnings("serial")
@Data
public class Chat extends Frame{
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
		setLUsuarios(new Label("USUARIOS"));   //ark4no
		setLMensaje(new Label("MENSAJE:"));
		setBEnviar(new Button("ENVIAR"));
		setBRegistrar(new Button("REGISTRAR"));
		setTNick(new TextField(20));
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());  //ark4no
		setTaUsuarios(new TextArea(2,20)); //ark4no
		
	
		
		GridBagConstraints gbLNick= new GridBagConstraints(0,0,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		getPSuperior().add(getLNick(),gbLNick);
		getPSuperior().setLayout(new GridBagLayout());
		GridBagConstraints gbTNick= new GridBagConstraints(2,0,1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		getPSuperior().add(getTNick(),gbTNick);
		GridBagConstraints gbBRegister= new GridBagConstraints(2,0,1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		getPSuperior().add(getBRegistrar(),gbBRegister);
		GridBagConstraints gbLMensaje= new GridBagConstraints(2,0,1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		GridBagConstraints gbTaMensaje= new GridBagConstraints(1,1,3,2,0,0,GridBagConstraints.BOTH,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		
		GridBagConstraints gbLUsuarios= new GridBagConstraints(0,0,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		getPSuperior().add(getLNick(),gbLUsuarios);
		
		GridBagConstraints gbaMensajes= new GridBagConstraints(0,0,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		getPSuperior().add(getLNick(),gbaMensajes);
		
		GridBagConstraints gbaUsuarios= new GridBagConstraints(0,0,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		getPSuperior().add(getLNick(),gbaUsuarios);
		
		
		
	}
	
	public static void main(String[] args) {
		Chat chat= new Chat();
		chat.setSize(500,500);
		chat.setVisible(true);
	}

}
