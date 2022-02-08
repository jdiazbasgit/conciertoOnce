package ventanas.eventos;


	

	import java.awt.event.WindowAdapter;
	import java.awt.event.WindowEvent;

	public class ElQueSabeLoQueHayQueHacerConElEvento  extends WindowAdapter {
		public ElQueSabeLoQueHayQueHacerConElEvento() {
			// TODO Auto-generated constructor stub
		}

		

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);

		}

	}

