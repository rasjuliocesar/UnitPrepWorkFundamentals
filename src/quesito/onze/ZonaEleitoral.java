package quesito.onze;

import java.util.ArrayList;
import java.util.List;

public class ZonaEleitoral {

	private String endereco;
	private String cep;
	
	private List<Eleitor> eleitores = new ArrayList<>();
	
	public ZonaEleitoral() {
	}

	public ZonaEleitoral(String endereco, String cep, List<Eleitor> eleitores) {
		this.endereco = endereco;
		this.cep = cep;
		this.eleitores = eleitores;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public List<Eleitor> getEleitores(){
		return this.eleitores;
	}
	
	public void addEleitores(Eleitor eleitor){
		eleitores.add(eleitor);
	}
	
	public void removeEleitores(Eleitor eleitor){
		eleitores.remove(eleitor);
	}
}
