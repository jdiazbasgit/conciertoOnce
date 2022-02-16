package ventanas;

import lombok.Data;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.plaf.InsetsUIResource;

import java.awt.TextArea;
import java.awt.Button;
import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.Color;
//import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;

@SuppressWarnings("serial")
@Data
public class Chat extends JFrame {
	private Panel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;

	public Chat() {
		setLocation(100, 100);
		setTitle("Chat del equipo 3");
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
		setTNick(new TextField(40));
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(30, 20));
		
		
		
		
		Panel panel = new Panel();
		
		panel.setLayout(new GridBagLayout());
		
		GridBagConstraints gbclNick = new GridBagConstraints(0,0,2,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		panel.add(lNick,gbclNick);
		
		GridBagConstraints gbctNick = new GridBagConstraints(2,0,1,1,2,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		panel.add(tNick,gbctNick);
		
		GridBagConstraints gbcbRegistrar = new GridBagConstraints(3,0,1,1,1,1,GridBagConstraints.WEST,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		panel.add(bRegistrar,gbcbRegistrar);
		this.add(panel);
		
		GridBagConstraints gbctMensaje = new GridBagConstraints(2,3,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		panel.add(tMensaje,gbctMensaje);
		
		
		
		
		GridBagConstraints gbclMensaje = new GridBagConstraints(0,3,1,1,1,1,GridBagConstraints.EAST,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		panel.add(lMensaje,gbclMensaje);
		
		GridBagConstraints gbctaMensajes = new GridBagConstraints(2,2,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0);
		panel.add(taMensajes,gbctaMensajes);
		
		
		
		GridBagConstraints gbcbEnviar = new GridBagConstraints(3,3,1,1,1,1,GridBagConstraints.WEST,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		panel.add(bEnviar,gbcbEnviar);
		
		
		
		GridBagConstraints gbclUsuarios = new GridBagConstraints(0,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		panel.add(lUsuarios,gbclUsuarios);
		
		GridBagConstraints gbctAUsuarios = new GridBagConstraints(0,2,1,1,2,2,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		panel.add(taUsuarios,gbctAUsuarios);
		
		
		
		
		
		
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
		 * getPCentralIzquierdaSuperior().setLayout(new
		 * FlowLayout()); getPCentralIzquierdaSuperior().add(getLUsuarios());
		 * 
		 * // lateral izquierda inferior
		 * 
		 *  getPCentralIzquierdaInferior().setLayout(new
		 * BorderLayout()); getPCentralIzquierdaInferior().add(getTaUsuarios(),
		 * BorderLayout.CENTER);
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
		 * getPCentral().setLayout(new BorderLayout()); getPCentral().add(getPCentralIzquierda(),
		 * BorderLayout.WEST); getPCentral().add(getTaMensajes(), BorderLayout.CENTER);
		 *
		 * 
		 * 
		 * // coloco los paneles con borderLayout
		 * 
		 *  getPGlobal().setLayout(new BorderLayout()); getPGlobal().add(getPSuperior(), BorderLayout.NORTH);
		 * getPGlobal().add(getPInferior(), BorderLayout.SOUTH);
		 * getPGlobal().add(getPCentral(), BorderLayout.CENTER);
		 * 
		 * 
		 * // creo el panel global 
		 * 
		 * this.setLayout(new BorderLayout());
		 * this.add(getPGlobal(), BorderLayout.CENTER);
		 */
		
		
		
	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(1200, 700);
		chat.setVisible(true);
		chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}