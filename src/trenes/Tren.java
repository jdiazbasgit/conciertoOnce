package trenes;

public class Tren {

	private String origen;
	private String destino;
	private int pasajeros;

	public Tren(String origen, String destino, int pasajeros) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Tren [Origen= " + getOrigen() + ", Destino= " + getDestino() + ", Pasajeros= " + getPasajeros() + "]";
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

}
