package facturas.beans;

import java.util.GregorianCalendar;

import facturas.fechas.Fecha;

public class Factura {

	private int baseImponible;
	private int numeroFactura;
	private Fecha fecha;
	private Vendedor vendedor;

	public Factura(int baseImponible, int numeroFactura, Fecha fecha, Vendedor vendedor) {
		super();
		this.baseImponible = baseImponible;
		this.numeroFactura = numeroFactura;
		this.fecha = fecha;
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "Factura [baseImponible=" + baseImponible + ", numeroFactura=" + numeroFactura + ", fecha=" + fecha
				+ ", vendedor=" + vendedor + "]";
	}

	public int getBaseImponible() {
		return baseImponible;
	}

	public void setBaseImponible(int baseImponible) {
		this.baseImponible = baseImponible;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}