package facturas.trabajo;

import java.util.HashSet;
import java.util.Set;

import facturas.beans.Factura;

public class Funcional {

	public static void main(String[] args) {

		Factura f1 = new Factura("BaseImponible", "NombredelaFactura", 1000);

		Factura f2 = new Factura("BaseImponible", "NombredelaFactura", 1200);
		Factura f3 = new Factura("BaseImponible", "NombredelaFactura", 1100);
		Factura f4 = new Factura("BaseImponible", "NombredelaFactura", 200);
		Factura f5 = new Factura("BaseImponible", "NombredelaFactura", 1500);
		Factura f6 = new Factura("BaseImponible", "NombredelaFactura", 400);
		Factura f7 = new Factura("BaseImponible", "NombredelaFactura", 1500);
		Factura f8 = new Factura("BaseImponible", "NombredelaFactura", 700);
		Factura f9 = new Factura("BaseImponible", "NombredelaFactura", 900);
		Factura f10 = new Factura("BaseImponible", "NombredelaFactura", 500);

		Set<Factura> facturas = new HashSet<Factura>();
		facturas.add(f1);
		facturas.add(f2);
		facturas.add(f3);
		facturas.add(f4);
		facturas.add(f5);
		facturas.add(f6);
		facturas.add(f7);
		facturas.add(f8);
		facturas.add(f9);
		facturas.add(f10);

	}
}
