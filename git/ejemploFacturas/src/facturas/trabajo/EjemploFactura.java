package facturas.trabajo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import facturas.beans.Factura;
import facturas.beans.Vendedor;

public class EjemploFactura {

	public static void main(String[] args) {

		Set<Vendedor> vendedores = cargaVendedores();
		Set<Factura> facturas = cargaFacturas(vendedores);
		for (Factura factura : facturas) {

			String fechaTexto = factura.getFecha().get(Calendar.DAY_OF_MONTH) + " de "
					+ factura.getFecha().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " de "
					+ factura.getFecha().get(Calendar.YEAR);
 
			System.out.println(factura.getNumeroFactura() + " - " + fechaTexto + " - " + factura.getBaseImponible());
		}
	}

	private static Set<Factura> cargaFacturas(Set<Vendedor> vendedores) {

		TreeSet<Factura> salida = new TreeSet<>((f1, f2) -> f1.getFecha().compareTo(f2.getFecha()));

		int numeroFactura = 1;
		Random random = new Random();

		for (Vendedor vendedor : vendedores) {
			for (int i = 0; i < 10; i++) {

			int importe = (int) (random.nextFloat() * 10000);
			GregorianCalendar fecha = new GregorianCalendar();
			fecha.add(Calendar.DAY_OF_MONTH, numeroFactura);
			Factura factura = new Factura(importe, numeroFactura, fecha, vendedor);
			salida.add(factura);
			numeroFactura++;
		}
			
		}
		return salida;

	}

	private static Set<Vendedor> cargaVendedores() {
		Set<Vendedor> salida = new HashSet<>();
		for (int i = 0; i < 20; i++) {
			salida.add(new Vendedor("nombre" + i, "dni" + i, "9191919" + 1));
		}

		return salida;
	}

}
