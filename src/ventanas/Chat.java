import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = false)
public class Chat extends Frame {
	private Panel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;

	public Chat() {
		setPGlobal(new Panel());
//		setPSuperior(new Panel());
//		setPCentral(new Panel());
//		setPInferior(new Panel());
//		setPCentralIzquierda(new Panel());
//		setPCentralIzquierdaSuperior(new Panel());
//		setPCentralIzquierdaInferior(new Panel());
		setLNick(new Label("NICK:"));
		setLUsuarios(new Label("USUARIOS"));
		setLMensaje(new Label("MENSAJE:"));
		setBEnviar(new Button("ENVIAR"));
		setBRegistrar(new Button("REGISTRAR"));
		setTNick(new TextField(20));
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(2, 20));

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

		this.add(getPGlobal());
		getPGlobal().setLayout(new GridBagLayout());
		GridBagConstraints gbLNick = new GridBagConstraints(0, 0, 2, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getLNick(), gbLNick);

		GridBagConstraints gbTNick = new GridBagConstraints(2, 0, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getTNick(), gbTNick);
		GridBagConstraints gbBRegister = new GridBagConstraints(2, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
		getPGlobal().add(getBRegistrar(), gbBRegister);

		
		
		GridBagConstraints gbLUsuarios= new GridBagConstraints(0,0,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		getPSuperior().add(getLNick(),gbLUsuarios);
		
		GridBagConstraints gbaMensajes= new GridBagConstraints(0,0,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		getPSuperior().add(getLNick(),gbaMensajes);
		
		GridBagConstraints gbaUsuarios= new GridBagConstraints(0,0,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		getPSuperior().add(getLNick(),gbaUsuarios);

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(500, 500);
		chat.setVisible(true);
	}

}

