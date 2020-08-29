package quesito.nove;

public class Adotante {

	private Integer id;
	private String nome;
	private String telefoneFixo;
	private String telefoneCelular;
	private String email;
	private Boolean impedimento;
	private String motivoImpedimento;
	
	private Endereco endereco;
	
	public Adotante() {
	}

	public Adotante(Integer id, String nome, String telefoneFixo, String telefoneCelular, String email,
			Boolean impedimento, String motivoImpedimento, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.telefoneFixo = telefoneFixo;
		this.telefoneCelular = telefoneCelular;
		this.email = email;
		this.impedimento = impedimento;
		this.motivoImpedimento = motivoImpedimento;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getImpedimento() {
		return impedimento;
	}

	public void setImpedimento(Boolean impedimento) {
		this.impedimento = impedimento;
	}

	public String getMotivoImpedimento() {
		return motivoImpedimento;
	}

	public void setMotivoImpedimento(String motivoImpedimento) {
		this.motivoImpedimento = motivoImpedimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
}
