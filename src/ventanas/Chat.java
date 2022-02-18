package ventanas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lombok.Data;


@Data
public class Chat extends JFrame{
	

	private JPanel pGlobal;//pSuperior,pCentral,pInferior,pCentralIzquierda,pCentralIzquierdaSuperior,pCentralIzquierdaInferior;
	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar,bEnviar;
	private JTextField tNick,tMensaje;
	private TextArea taUsuarios,taMensajes;

	
	
	public Chat() {
			
				
		setPGlobal(new JPanel());
		//setPSuperior(new JPanel());
		//setPCentral(new JPanel());
		//setPInferior(new JPanel());
		//setPCentralIzquierda(new JPanel());
		//setPCentralIzquierdaSuperior(new JPanel());
		//setPCentralIzquierdaInferior(new JPanel());
		setLNick(new JLabel("NICK:"));
		setLUsuarios(new JLabel("USUARIOS"));
		setLMensaje(new JLabel("MENSAJE:"));
		setBEnviar(new JButton("ENVIAR"));
		setBRegistrar(new JButton("REGISTRAR"));
		setTNick(new JTextField(20));
		setTMensaje(new JTextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(2,20));
		getTaUsuarios().setEditable(false);
		getTaMensajes().setEditable(false);
		
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
		pGlobal.setBackground(new Color(93,193,185));
		GridBagConstraints gbclnic= new GridBagConstraints(0, 0, 2, 1, 0, 0, GridBagConstraints.EAST,GridBagConstraints.NONE , new Insets(0,0,0,0),0,0);
		getPGlobal().add(lNick,gbclnic);
		
		GridBagConstraints gbtNick= new GridBagConstraints(2, 0, 1, 1, 0, 0, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL, new Insets(10,30,10,0),0,0);
		getPGlobal().add(tNick,gbtNick);
		
	
		GridBagConstraints gbbRegistrar= new GridBagConstraints( 3, 0,1, 1, 0.6,0,GridBagConstraints.WEST,GridBagConstraints.NONE, new Insets(0,30,0,0),0,0);
		getPGlobal().add(bRegistrar,gbbRegistrar);
		
		
		GridBagConstraints gbbLUsuarios= new GridBagConstraints( 0, 1,1, 1, 0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE, new Insets(0,0,0,0),0,0);
		getPGlobal().add(lUsuarios,gbbLUsuarios);
		
		
		
		GridBagConstraints gbbtAMensajes= new GridBagConstraints( 1, 1,3, 2, 0,0.6,GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0);
	    getPGlobal().add(taMensajes,gbbtAMensajes);
			
			
		GridBagConstraints gbtAUsuarios= new GridBagConstraints( 0, 2,1, 1, 0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0);
		getPGlobal().add(taUsuarios,gbtAUsuarios);
				
		
		GridBagConstraints gbbLMensaje= new GridBagConstraints( 1, 3,1, 1, 0.4,0,GridBagConstraints.EAST,GridBagConstraints.NONE, new Insets(0,30,0,0),0,0);
		getPGlobal().add(lMensaje,gbbLMensaje);
		

		GridBagConstraints gbbTMensaje= new GridBagConstraints( 2, 3,1, 1, 0,0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL, new Insets(10,30,10,0),0,0);
		getPGlobal().add(tMensaje,gbbTMensaje);
		
		GridBagConstraints gbbBEnviar= new GridBagConstraints( 3, 3,2, 2, 0,0,GridBagConstraints.WEST,GridBagConstraints.NONE, new Insets(0,30,0,0),0,0);
		getPGlobal().add(bEnviar,gbbBEnviar);
		
		
		
	}
	
	public static void main(String[] args) {
		Chat chat= new Chat();
		chat.setSize(500,500);
		chat.setVisible(true);
	}

}   