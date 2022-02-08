package ventanas.eventos;



	import java.awt.event.MouseAdapter;

	public class ElQueSabeLoQueHayQueHacerConArkanoid extends MouseAdapter {

		private EventosArknoid eventosarkanoid;
		
		

		public ElQueSabeLoQueHayQueHacerConArkanoid() {
			
   super();
			
		}

		public ElQueSabeLoQueHayQueHacerConArkanoid(EventosArknoid eventosarkanoid) {
			this.setEventosArkanoid(eventosarkanoid );
		}


		public EventosArknoid getEventosarkanoid() {
			return eventosarkanoid;
		}

	public void setEventosArkanoid(EventosArknoid eventosarkanoid ) {
			this.eventosarkanoid = eventosarkanoid;
		}

		

		
		
		

		

		

	}

