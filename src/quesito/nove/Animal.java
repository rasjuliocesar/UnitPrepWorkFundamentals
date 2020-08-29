package quesito.nove;

import java.util.Date;

public class Animal {

	private Integer id;
	private String nome;
	private char tipo;
	private String rga;
	private Date dataNascimento;
	private char genero;
	private String deficiencia;
	private Boolean vacinado;
	private Boolean castrado;
	private Double tamanho;
	private Double peso;
	private String temperamento;
	private String observacao;
	private Date dataResgate;
	
	private Raca raca;
	
	public Animal() {
	}

	public Animal(Integer id, String nome, char tipo, String rga, Date dataNascimento, char genero, String deficiencia,
			Boolean vacinado, Boolean castrado, Double tamanho, Double peso, String temperamento, String observacao,
			Date dataResgate, Raca raca) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.rga = rga;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.deficiencia = deficiencia;
		this.vacinado = vacinado;
		this.castrado = castrado;
		this.tamanho = tamanho;
		this.peso = peso;
		this.temperamento = temperamento;
		this.observacao = observacao;
		this.dataResgate = dataResgate;
		this.raca = raca;
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

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getRga() {
		return rga;
	}

	public void setRga(String rga) {
		this.rga = rga;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(String deficiencia) {
		this.deficiencia = deficiencia;
	}

	public Boolean getVacinado() {
		return vacinado;
	}

	public void setVacinado(Boolean vacinado) {
		this.vacinado = vacinado;
	}

	public Boolean getCastrado() {
		return castrado;
	}

	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataResgate() {
		return dataResgate;
	}

	public void setDataResgate(Date dataResgate) {
		this.dataResgate = dataResgate;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}	
}
