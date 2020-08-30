package quesito.onze;

public class Pessoa {

	private String nome;
	private Boolean pessoaJuridica;
	private String cpf;
	
	public Pessoa() {
	}

	public Pessoa(String nome, Boolean pessoaJuridica, String cpf) {
		this.nome = nome;
		this.pessoaJuridica = pessoaJuridica;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(Boolean pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
