package concierto.instrumentos;

public class Instrumento implements InstrumentoInteface {
	private String sonido;
	
	@Override
	/*
	 * Metodo que devuelve el sonido del instrumento
	 * */
	public String sonar() {
		return this.getSonido();
	}


	/**
	 * @return el sonido del insturmento
	 */
	public String getSonido() {
		return sonido;
	}



	/**
	 * @param sonido que se le asigna al instrumento
	 */
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
