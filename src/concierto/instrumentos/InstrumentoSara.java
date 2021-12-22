package concierto.instrumentos;

public class InstrumentoSara implements InstrumentoInterface {
private String Sonido;




	public InstrumentoSara(String sonido) {
	super();
	 this.Sonido = sonido;
}


	@Override
	public String sonar() {
		
		return getSonido();
	}


	public String getSonido() {
		return Sonido;
	}


	public void setSonido(String sonido) {
		Sonido = sonido;
	}

}
