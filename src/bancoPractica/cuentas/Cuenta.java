package bancoPractica.cuentas;

import java.util.*;

public class Cuenta {
	private int numeroCuenta;
	private double saldo;

	public double redondeo(double d) {
		return Math.round(d*100.0)/100.0;
	}
	
	public void depositar(double cantidad) {
		saldo = saldo + cantidad;
		
	}
	
	public void retirar(double cantidad) {
		
		if(cantidad<=saldo) {
			saldo = saldo - cantidad;
		}else {
			System.out.println("No cuenta con saldo suficiente");
		}
		
	}
	
	public void mostrar() {
		System.out.println("Cuenta: numero-> "+this.numeroCuenta+" saldo->"+this.saldo);
	}
	
	
	public double saldo() {
		return redondeo(saldo);
	}
	
	
	public Cuenta(int numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + redondeo(saldo) + "]";
	}
	
	
	
	

}
