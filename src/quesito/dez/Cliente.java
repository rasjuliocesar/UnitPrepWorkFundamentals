package quesito.dez;

public class Cliente {

	private Integer codigo;
	private String nome;
	private String endereco;
	private String cpf;
	
	public Cliente() {
	}
	
	public Cliente(Integer codigo, String nome, String endereco, String cpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
