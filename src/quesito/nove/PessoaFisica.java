package quesito.nove;

public class PessoaFisica {

	private Integer id;
	private String cpf;
	private String rg;
	private char genero;
	
	private Adotante adotante;
	
	public PessoaFisica() {
	}

	public PessoaFisica(Integer id, String cpf, String rg, char genero, Adotante adotante) {
		this.id = id;
		this.cpf = cpf;
		this.rg = rg;
		this.genero = genero;
		this.adotante = adotante;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Adotante getAdotante() {
		return adotante;
	}

	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}
}
