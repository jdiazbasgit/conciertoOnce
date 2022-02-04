package facturas.fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

@SuppressWarnings("serial")
public class Fecha extends GregorianCalendar {

	@Override
	public String toString() {
		String salida = this.get(Calendar.DAY_OF_MONTH)+ " de "+ this.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())+
				" de "+ this.get(Calendar.YEAR);
		return salida;
	}
	
	 

}
