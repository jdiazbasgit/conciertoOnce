package ventanas;
//mi rama
//prueba por pass
import lombok.Data;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Button;
@Data
public class Chat {
	private Panel pGlobal,pSuperior,pCentral,pInferior,pCentralIzquierda,pCentralIzquierdaSuperior,pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar,bEnviar;
	private TextField tNick,tMensaje;
	private TextArea taUsuarios,taMensajes;
	
	
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
		
		
		
	}

}
