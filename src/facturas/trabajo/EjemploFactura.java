package facturas.trabajo;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import facturas.beans.Factura;
import facturas.beans.Vendedor;
import facturas.fechas.Fecha;

public class EjemploFactura {

	public static void main(String[] args) {

		Set<Vendedor> vendedores = cargaVendedores();
		Set<Factura> facturas = cargaFacturas(vendedores);

		int resultado = 0;
		for (Factura factura : facturas) {

			resultado = resultado + factura.getBaseImponible();
			
		}
		//Integer.parseInt()
		// System.out.println(resultado);
		// System.out.println(facturas.stream().mapToInt(fac->fac.getBaseImponible()).sum());
		// System.out.println(facturas.stream().mapToDouble(fac->fac.getBaseImponible()).min().getAsDouble());
		// System.out.println(facturas.stream().mapToDouble(fac->fac.getBaseImponible()).max().getAsDouble());
		//System.out.println(facturas.stream().mapToInt(fac ->fac.getBaseImponible()).filter(n -> n < 5000).sum());
          System.out.println(facturas.stream().mapToInt(fac ->fac.getBaseImponible()).filter(n -> n %2==0 ).sum());
	}

	/*
	 * for (Factura factura : facturas) {
	 * 
	 * System.out.println("número factura " + "- " + factura.getNumeroFactura() +
	 * " - " + "fecha " + factura.getFecha() + " - " + "base imponible " + "- " +
	 * factura.getBaseImponible());
	 */
	/*
	 * sin hacer la clase Fecha String fechaTexto =
	 * factura.getFecha().get(Calendar.DAY_OF_MONTH) + " de " +
	 * factura.getFecha().getDisplayName(Calendar.MONTH, Calendar.LONG,
	 * Locale.getDefault()) + " de " + factura.getFecha().get(Calendar.YEAR);
	 * 
	 * 
	 * System.out.println("número factura "+ factura.getNumeroFactura() + " " +
	 * "Fecha " + fechaTexto + " " + "Base Imponible " +
	 * factura.getBaseImponible());
	 * 
	 * } }
	 */
	private static Set<Factura> cargaFacturas(Set<Vendedor> vendedores) {
		TreeSet<Factura> salida = new TreeSet<>((f1, f2) -> f1.getFecha().compareTo(f2.getFecha()));
		int numeroFactura = 1;
		Random random = new Random();

		for (Vendedor vendedor : vendedores) {

			for (int i = 0; i < 10; i++) {

				int importe = (int) (random.nextFloat() * 10000);
				Fecha fecha = new Fecha();
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
			salida.add(new Vendedor("nombre" + i, "dni" + i, "9191919" + i));

			int dniEntero = Integer.parseInt("9191919" + i);

		//	if (dniEntero % 2 == 0)
			//	System.out.println(dniEntero);

		}
		return salida;
	}

}
