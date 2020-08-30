package quesito.onze;

import java.util.List;

public class TER extends ZonaEleitoral{

	private Integer numeroZona;
	
	public TER() {
	}

	public TER(String endereco, String cep, List<Eleitor> eleitores, Integer numeroZona) {
		super(endereco, cep, eleitores);
		this.numeroZona = numeroZona;
	}

	public Integer getNumeroZona() {
		return numeroZona;
	}

	public void setNumeroZona(Integer numeroZona) {
		this.numeroZona = numeroZona;
	}
}
