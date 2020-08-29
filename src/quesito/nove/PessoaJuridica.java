package quesito.nove;

public class PessoaJuridica {

	private Integer id;
	private String cnpj;
	
	private PessoaFisica responsavel;
	private Adotante adotante;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(Integer id, String cnpj, PessoaFisica responsavel, Adotante adotante) {
		this.id = id;
		this.cnpj = cnpj;
		this.responsavel = responsavel;
		this.adotante = adotante;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaFisica getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}

	public Adotante getAdotante() {
		return adotante;
	}

	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}
}
