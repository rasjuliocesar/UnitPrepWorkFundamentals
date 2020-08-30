package quesito.onze;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ServidorDeVotos {

	private Integer candidatoId;
	private Integer eleitorId;
	private Calendar data;
	private Integer contaVotos;
	
	private List<Votar> votos = new ArrayList<>();
	
	public ServidorDeVotos() {
	}

	public ServidorDeVotos(Integer candidatoId, Integer eleitorId, Calendar data, Integer contaVotos, List<Votar> votos) {
		this.candidatoId = candidatoId;
		this.eleitorId = eleitorId;
		this.data = data;
		this.contaVotos = contaVotos;
		this.votos = votos;
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

	public Integer getContaVotos() {
		return contaVotos;
	}

	public void setContaVotos(Integer contaVotos) {
		this.contaVotos = contaVotos;
	}

	public List<Votar> getVotos() {
		return votos;
	}

	public void setVotos(List<Votar> votos) {
		this.votos = votos;
	}
	
	public Integer contaVotos() {
		return null;
	}
}
