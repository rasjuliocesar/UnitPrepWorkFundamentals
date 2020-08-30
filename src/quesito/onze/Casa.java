package quesito.onze;

import java.util.List;

public class Casa extends ZonaEleitoral{

	private Integer numeroCasa;
	
	public Casa() {
	}

	public Casa(String endereco, String cep, List<Eleitor> eleitores, Integer numeroCasa) {
		super(endereco, cep, eleitores);
		this.numeroCasa = numeroCasa;
	}

	public Integer getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(Integer numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
}
