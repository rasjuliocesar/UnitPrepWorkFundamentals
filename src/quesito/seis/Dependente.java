package quesito.seis;

public class Dependente {

	private Integer sequencial;
	private String nomeCompleto;
	private Integer sexo;
	private String dataDeNascimento;
	private Boolean participaPlano;
	
	private Funcionario funcionario;
	
	public Dependente() {
	}

	public Dependente(Integer sequencial, String nomeCompleto, Integer sexo, String dataDeNascimento,
			Boolean participaPlano, Funcionario funcionario) {
		this.sequencial = sequencial;
		this.nomeCompleto = nomeCompleto;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.participaPlano = participaPlano;
		this.funcionario = funcionario;
	}

	public Integer getSequencial() {
		return sequencial;
	}

	public void setSequencial(Integer sequencial) {
		this.sequencial = sequencial;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Boolean getParticipaPlano() {
		return participaPlano;
	}

	public void setParticipaPlano(Boolean participaPlano) {
		this.participaPlano = participaPlano;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
