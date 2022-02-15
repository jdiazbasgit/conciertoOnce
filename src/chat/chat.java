package chat;

import lombok.Data;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Button;

@Data

public class chat {

	private Panel pGblobal,pSuperior,pCentral,pInferior,pCentralIzquierda,pCentralIzquierdaSuperior,pCentralIzquierdaInferior;
	private Label lNick,lUsuarios,lMensaje;
	private Button bRegistrar,bEnviar;
	private TextField tNick,tMensaje;
	private TextArea taUsuarios,taMensajes;
	
	public chat() {
		
		setPGblobal(new Panel());
		setPSuperior(new Panel());
		setPCentral(new Panel());
		setPInferior(new Panel());
		setPCentralIzquierda(new Panel());
		setPCentralIzquierdaSuperior(new Panel());
		setPCentralIzquierdaInferior(new Panel ());
		setLNick(new Label());
		setLUsuarios(new Label());
		setLMensaje(new Label());
		setBRegistrar(new Button());
		setBEnviar(new Button());
		setTNick(new TextField());
		setTMensaje(new TextField());
		setTaUsuarios(new TextArea());
		setTaMensajes(new TextArea());
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
