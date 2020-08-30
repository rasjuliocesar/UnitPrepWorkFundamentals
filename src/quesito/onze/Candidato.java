package quesito.onze;

public class Candidato extends Pessoa {

	private Integer candidatoId;
	private String cargo;
	private String partido;
	private Boolean resultado;
	private String uf;
	
	private Votar votar;
	
	public Candidato() {
	}

	public Candidato(Integer candidatoId, String cargo, String partido, Boolean resultado, String uf, Votar votar) {
		this.candidatoId = candidatoId;
		this.cargo = cargo;
		this.partido = partido;
		this.resultado = resultado;
		this.uf = uf;
		this.votar = votar;
	}

	public Integer getCandidatoId() {
		return candidatoId;
	}

	public void setCandidatoId(Integer candidatoId) {
		this.candidatoId = candidatoId;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public Boolean getResultado() {
		return resultado;
	}

	public void setResultado(Boolean resultado) {
		this.resultado = resultado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public Votar getVotar() {
		return this.votar;
	}
	
	public void setVotar(Votar votar) {
		this.votar = votar;
	}
	
	public Integer candidatura() {
		return null;
	}
}
