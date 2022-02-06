package facturas.trabajo;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import facturas.beans.Factura;
import facturas.beans.Vendedor;
import facturas.fecha.Fecha;

public class EjemploFactura {
	int a = 0;

	public static void main(String[] args) throws FileNotFoundException {
		

		Set<Vendedor> vendedores = cargaVendedores();
		Set<Factura> facturas = cargaFacturas(vendedores);
		int resultado = 0;
		for (Factura factura : facturas) {
			resultado = resultado + factura.getBaseImponible();

		}

		System.err.println(resultado);
		//System.out.println(facturas.stream().sorted().mapToInt(fac -> fac.getBaseImponible()).filter(n -> n < 5000)
			//	.filter(n -> n < 200).sum());
		
		System.out.println(vendedores.stream().mapToInt(tel -> Integer.parseInt(tel.getTelefono())).filter(n -> n % 2 ==0).sum());
		//System.out.println(cargaVendedores().stream().filter(n -> n % 2 ==0));
		System.out.println(cargaVendedores());

		System.out.println(facturas.stream().mapToInt(fac -> fac.getBaseImponible()).filter(n -> n >= 5000));
//suma de todas las facturas de todos los vendedores que cuyo telefono acabe en nombre par
	}

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
			if (i%2 ==0) {
				salida.add(new Vendedor("\n" +"nombre" + i, "dni" + i, "9191919" + i ));
			}
			
			

		}
		return salida;
	}

}
