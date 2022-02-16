package ventanas;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import lombok.Data;
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
		setLUsuarios(new Label("USUARIOS"));
		setLMensaje(new Label("MENSAJE:"));
		setBEnviar(new Button("ENVIAR"));
		setBRegistrar(new Button("REGISTRAR"));
		setTNick(new TextField(20));
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(2,20));
		
		/*
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
		GridBagConstraints gbclnic= new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.EAST,GridBagConstraints.NONE , new Insets(0,0,0,0),0,0);
		getPGlobal().add(lNick,gbclnic);
		
		GridBagConstraints gbtNick= new GridBagConstraints(2, 0, 1, 1, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0),0,0);
		getPGlobal().add(tNick,gbtNick);
		
	
		GridBagConstraints gbbRegistrar= new GridBagConstraints( 3, 0,1, 1, 1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE, new Insets(0,0,0,0),0,0);
		getPGlobal().add(bRegistrar,gbbRegistrar);
		
		
		GridBagConstraints gbbLUsuarios= new GridBagConstraints( 0, 1,1, 1, 1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE, new Insets(0,0,0,0),0,0);
		getPGlobal().add(lUsuarios,gbbLUsuarios);
		
		
		
		GridBagConstraints gbbtAMensajes= new GridBagConstraints( 1, 1,3, 2, 1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0);
			getPGlobal().add(taMensajes,gbbtAMensajes);
			
			
			GridBagConstraints gbtAUsuarios= new GridBagConstraints( 0, 2,1, 1, 1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0);
			getPGlobal().add(taUsuarios,gbtAUsuarios);
				
		
		GridBagConstraints gbbLMensaje= new GridBagConstraints( 0, 3,1, 1, 1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE, new Insets(0,0,0,0),0,0);
		getPGlobal().add(lMensaje,gbbLMensaje);
		

		GridBagConstraints gbbTMensaje= new GridBagConstraints( 1, 3,1, 1, 1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE, new Insets(0,0,0,0),0,0);
		getPGlobal().add(tMensaje,gbbTMensaje);
		
		GridBagConstraints gbbBEnviar= new GridBagConstraints( 3, 3,2, 2, 1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE, new Insets(0,0,0,0),0,0);
		getPGlobal().add(bEnviar,gbbBEnviar);
		
		
		
		
		
		   
	}
	
	public static void main(String[] args) {
		Chat chat= new Chat();
		chat.setSize(500,500);
		chat.setVisible(true);
	}


}
