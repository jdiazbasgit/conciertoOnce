package ventanas.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ventanas.Chat;
import ventanas.hilos.envio.HiloEnvioMensajeCliente;

@Getter
@Setter
@AllArgsConstructor
public class ElQueSabeLoQueHayQueHacerConBotonMensaje implements ActionListener {

	private Chat chat;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("ENVIAR") &&
				!getChat().getTMensaje().getText().trim().equals("")) {

			HiloEnvioMensajeCliente hiloEnvioMensaje = new HiloEnvioMensajeCliente(getChat(), Chat.IP_SERVIDOR,
					Chat.PUERTO_ESCUCHA_MENSAJES_SERVIDOR);
			hiloEnvioMensaje.start();

		}

	}

}
