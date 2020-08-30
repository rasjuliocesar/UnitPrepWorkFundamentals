package quesito.onze;

import java.util.List;

public class Partido {

	private String nome;
	private String sigla;
	
	private List<Candidato> candidatos;

	public Partido() {
	}

	public Partido(String nome, String sigla, List<Candidato> candidato) {
		this.nome = nome;
		this.sigla = sigla;
		this.candidatos = candidato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	
	public void addCandidatos(Candidato candidato) {
		candidatos.add(candidato);
	}
	
	public void removeCandidatos(Candidato candidato) {
		candidatos.remove(candidato);
	}
}
