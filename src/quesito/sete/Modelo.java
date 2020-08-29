package quesito.sete;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

	private Integer codigo;
	private String marca;
	private String nome;
	private Double motor;
	private Integer serie;
	
	private List<Item> itens = new ArrayList<>();
	
	public Modelo() {
	}

	public Modelo(Integer codigo, String marca, String nome, Double motor, Integer serie, List<Item> item) {
		this.codigo = codigo;
		this.marca = marca;
		this.nome = nome;
		this.motor = motor;
		this.serie = serie;
		this.itens = item;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getMotor() {
		return motor;
	}

	public void setMotor(Double motor) {
		this.motor = motor;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void addItens(Item item) {
		itens.add(item);
	}
	
	public void removeItens(Item item) {
		itens.remove(item);
	}
}
