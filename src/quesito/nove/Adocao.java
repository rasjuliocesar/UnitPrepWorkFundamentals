package quesito.nove;

import java.util.Date;

public class Adocao {
	private Integer id;
	private Date dataAdocao;
	private Date dataDevolucao;

	private Animal animal;
	private Usuario usuario;
	private Adotante adotante;

	public Adocao() {
	}

	public Adocao(Integer id, Date dataAdocao, Date dataDevolucao, Animal animal, Usuario usuario, Adotante adotante) {
		this.id = id;
		this.dataAdocao = dataAdocao;
		this.dataDevolucao = dataDevolucao;
		this.animal = animal;
		this.usuario = usuario;
		this.adotante = adotante;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataAdocao() {
		return dataAdocao;
	}

	public void setDataAdocao(Date dataAdocao) {
		this.dataAdocao = dataAdocao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Adotante getAdotante() {
		return adotante;
	}

	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}
}
