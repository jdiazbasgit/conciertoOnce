package facturas.trabajo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import facturas.beans.Factura;
import facturas.beans.Vendedor;

public class EjemploFactura {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Set<Vendedor> vendedores=cargaVendedores();
		Set<Factura> facturas=cargaFacturas();

	}

	@SuppressWarnings("unused")
	private static Set<Factura> cargaFacturas() {
		Set<Factura> salida= new TreeSet<>((f1,f2)->f1.getFecha().compareTo(f2.getFecha()));
		return null;
	}
	
	
	
	
	
	
	

	private static Set<Vendedor> cargaVendedores() {
		Set<Vendedor> salida=new HashSet<>();
		for(int i=0;i<20;i++) {
			salida.add(new Vendedor("nombre"+i, "dni"+i, "9191919"+1));
		}System.out.println(salida.toString());
		return salida;
	}

}
