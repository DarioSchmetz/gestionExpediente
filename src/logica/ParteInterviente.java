package logica;

public class ParteInterviente extends Persona {

	private String tipoParte;
	private String clave;

	public ParteInterviente() {
		super();

	}

	public String getTipoParte() {
		return tipoParte;
	}

	public void setTipoParte(String tipoParte) {
		this.tipoParte = tipoParte;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}