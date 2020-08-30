package quesito.onze;

import java.util.ArrayList;
import java.util.List;

public class Eleitor extends Pessoa {

	private String endereco;
	private Integer eleitorId;
	
	private ZonaEleitoral zonaEleitoral;
	private List<Votar> votos = new ArrayList<>();
	
	public Eleitor() {
	}

	public Eleitor(String nome, Boolean pessoaJuridica, String cpf, String endereco, Integer eleitorId, ZonaEleitoral zonaEleitoral, List<Votar> votos) {
		super(nome, pessoaJuridica, cpf);
		this.endereco = endereco;
		this.eleitorId = eleitorId;
		this.zonaEleitoral = zonaEleitoral;
		this.votos = votos;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getEleitorId() {
		return eleitorId;
	}

	public void setEleitorId(Integer eleitorId) {
		this.eleitorId = eleitorId;
	}
	
	public ZonaEleitoral getZonaEleitoral() {
		return this.zonaEleitoral;
	}
	
	public void setZonaEleitoral(ZonaEleitoral zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}
	
	public List<Votar> getVotos(){
		return this.votos;
	}
	
	public void addVotos(Votar votar) {
		votos.add(votar);
	}
	
	public void removeVotos(Votar votar) {
		votos.remove(votar);
	}
	
	public Integer validar() {
		return null;
	}
}
