package ventanas;

import lombok.Data;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.BorderLayout;

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
		setLocation(500, 200);
		setTitle("Chat de Antonio");
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
		setTaUsuarios(new TextArea(2, 20));

		// add el panel de arriva
		/*
		 * getPSuperior().setLayout(new FlowLayout()); getPSuperior().add(getLNick());
		 * getPSuperior().add(getTNick()); getPSuperior().add(getBRegistrar());
		 * getPSuperior().setBackground(Color.GRAY);
		 * 
		 * // add el panel de abajo getPInferior().setLayout(new FlowLayout());
		 * getPInferior().add(getLMensaje()); getPInferior().add(getTMensaje());
		 * getPInferior().add(getBEnviar()); getPInferior().setBackground(Color.GREEN);
		 * 
		 * // lateral izquierda superior getPCentralIzquierdaSuperior().setLayout(new
		 * FlowLayout()); getPCentralIzquierdaSuperior().add(getLUsuarios());
		 * 
		 * // lateral izquierda inferior getPCentralIzquierdaInferior().setLayout(new
		 * BorderLayout()); getPCentralIzquierdaInferior().add(getTaUsuarios(),
		 * BorderLayout.CENTER);
		 * 
		 * // pegar lateral izquierda arriba y abajo al panel izquierdo
		 * getPCentralIzquierda().setLayout(new BorderLayout());
		 * getPCentralIzquierda().add(getPCentralIzquierdaSuperior(),
		 * BorderLayout.NORTH);
		 * getPCentralIzquierda().add(getPCentralIzquierdaInferior(),
		 * BorderLayout.CENTER);
		 * 
		 * // colocar el panel central izquierda al oeste getPCentral().setLayout(new
		 * BorderLayout()); getPCentral().add(getPCentralIzquierda(),
		 * BorderLayout.WEST); getPCentral().add(getTaMensajes(), BorderLayout.CENTER);
		 * 
		 * // coloco los paneles con borderLayout getPGlobal().setLayout(new
		 * BorderLayout()); getPGlobal().add(getPSuperior(), BorderLayout.NORTH);
		 * getPGlobal().add(getPInferior(), BorderLayout.SOUTH);
		 * getPGlobal().add(getPCentral(), BorderLayout.CENTER);
		 * 
		 * // creo el panel global this.setLayout(new BorderLayout());
		 * this.add(getPGlobal(), BorderLayout.CENTER);
		 */
		
		
		
	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(900, 500);
		chat.setVisible(true);
		chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}