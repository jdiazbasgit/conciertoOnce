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
		
		Set<Vendedor> vendedores=cargaVendedores();
		Set<Factura> facturas=cargaFacturas(vendedores);
		int resultado=0;

		for(Factura factura:facturas) { 
	        resultado=resultado+factura.getBaseImponible();
		
			System.out.println("Num factura: "+factura.getNumeroFactura()+" - fecha:"+factura.getFecha()+" - Base imponible: "+factura.getBaseImponible());
		}
		System.out.println("Programacion no funcional...");
		System.err.println("resultado "+resultado);
		System.out.println("Programacion no funcional...");
		System.out.println("Maxima Base Imponible de las facturas ");
		System.out.println(facturas.stream().mapToInt(f->f.getBaseImponible()).max().getAsInt());
		System.out.println("Minima Base Imponible de las facturas ");
		System.out.println(facturas.stream().mapToInt(f->f.getBaseImponible()).min().getAsInt());
		System.out.println("Suma Base Imponible de las facturas menor a 5000 ");
		System.out.println(facturas.stream().mapToInt(f->f.getBaseImponible()).filter(numero->numero<5000 ).sum());
		System.out.println("Suma Base Imponible de las facturas mayor o igual a 5000 ");
		System.out.println("Suma numero de TELEFONOS pares....");
		System.out.println(facturas.stream().filter(factura-> Integer.parseInt(factura.getVendedor().getTelefono())%2 ==0).mapToInt(f->f.getBaseImponible()).sum());

	}

	private static Set<Factura> cargaFacturas(Set<Vendedor> vendedores) {
		TreeSet<Factura> salida = new TreeSet<>((f1,f2)->f1.getFecha().compareTo(f2.getFecha()));
		int numeroFactura = 1;
		Random random = new Random();
		
		for(Vendedor vendedor:vendedores) {
			for(int i=0;i<10;i++) {
				//System.out.println((int) (random.nextFloat()*10000));
				int importe = (int) (random.nextFloat()*10000);
				Fecha fecha = new Fecha();
				fecha.add(Calendar.DAY_OF_MONTH, numeroFactura);
				Factura factura = new Factura(importe, numeroFactura,fecha,vendedor);				
				salida.add(factura);
				numeroFactura++;
			}
		}
		return salida;
	}



	private static Set<Vendedor> cargaVendedores() {
		Set<Vendedor> salida=new HashSet<>();
		for(int i=0;i<20;i++) {
			salida.add(new Vendedor("nombre"+i, "dni"+i, "9191919"+i));
		}
		return salida;
	}

}
