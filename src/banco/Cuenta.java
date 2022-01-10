package banco;

public class Cuenta {

	private int saldo;

	public int operar(int importe, int tipo) {
		if (tipo == 0) {
			setSaldo(getSaldo() + importe);
			return getSaldo();
		}

		
		if (getSaldo() < importe) {
			setSaldo(getSaldo() - importe);
			System.out.println("no tienes suficiente saldo");
			setSaldo(getSaldo() + importe);
		}
		return getSaldo();
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
