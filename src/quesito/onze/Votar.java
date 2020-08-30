package quesito.onze;

import java.util.Calendar;

public class Votar {

	private Integer candidatoId;
	private Integer eleitorId;
	private Calendar data;
	private String cargoCandidato;
	
	private Eleitor eleitor;
	private Candidato candidato;
	private ServidorDeVotos servidorDeVotos;
	
	public Votar() {
	}

	public Votar(Integer candidatoId, Integer eleitorId, Calendar data, String cargoCandidato, Eleitor eleitor,
			Candidato candidato, ServidorDeVotos servidorDeVotos) {
		this.candidatoId = candidatoId;
		this.eleitorId = eleitorId;
		this.data = data;
		this.cargoCandidato = cargoCandidato;
		this.eleitor = eleitor;
		this.candidato = candidato;
		this.servidorDeVotos = servidorDeVotos;
	}

	public Integer getCandidatoId() {
		return candidatoId;
	}

	public void setCandidatoId(Integer candidatoId) {
		this.candidatoId = candidatoId;
	}

	public Integer getEleitorId() {
		return eleitorId;
	}

	public void setEleitorId(Integer eleitorId) {
		this.eleitorId = eleitorId;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getCargoCandidato() {
		return cargoCandidato;
	}

	public void setCargoCandidato(String cargoCandidato) {
		this.cargoCandidato = cargoCandidato;
	}

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	public ServidorDeVotos getServidorDeVotos() {
		return this.servidorDeVotos;
	}
	
	public void setServidorDeVotos(ServidorDeVotos servidorDeVotos) {
		this.servidorDeVotos = servidorDeVotos;
	}
	
	public void votar() {
	}
	
	public void cancelar() {
	}
}
