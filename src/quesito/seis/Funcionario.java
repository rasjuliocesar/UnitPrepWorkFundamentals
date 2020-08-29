package quesito.seis;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private Integer matricula;
	private String nomeCompleto;
	private String cpf;
	private Integer sexo;
	private String dataDeNascimento;
	private Double salario;
	private Integer telefone;
	
	private List<Dependente> dependentes = new ArrayList<>();
	
	public Funcionario() {
	}

	public Funcionario(Integer matricula, String nomeCompleto, String cpf, Integer sexo, String dataDeNascimento,
			Double salario, Integer telefone, List<Dependente> dependentes) {
		this.matricula = matricula;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.salario = salario;
		this.telefone = telefone;
		this.dependentes = dependentes;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	
	public List<Dependente> getDependentes(){
		return this.dependentes;
	}
	
	public void addDependentes(Dependente dependente) {
		dependentes.add(dependente);
	}
	
	public void removeDependentes(Dependente dependente) {
		dependentes.remove(dependente);
	}
}
