package quesito.nove;

public class Raca {

	private Integer id;
	private String origem;
	private Double tamanhoMax;
	private Double tamanhoMin;
	private Integer expectativaVIda;
	private Integer temperamento;
	
	public Raca() {
	}

	public Raca(Integer id, String origem, Double tamanhoMax, Double tamanhoMin, Integer expectativaVIda,
			Integer temperamento) {
		this.id = id;
		this.origem = origem;
		this.tamanhoMax = tamanhoMax;
		this.tamanhoMin = tamanhoMin;
		this.expectativaVIda = expectativaVIda;
		this.temperamento = temperamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Double getTamanhoMax() {
		return tamanhoMax;
	}

	public void setTamanhoMax(Double tamanhoMax) {
		this.tamanhoMax = tamanhoMax;
	}

	public Double getTamanhoMin() {
		return tamanhoMin;
	}

	public void setTamanhoMin(Double tamanhoMin) {
		this.tamanhoMin = tamanhoMin;
	}

	public Integer getExpectativaVIda() {
		return expectativaVIda;
	}

	public void setExpectativaVIda(Integer expectativaVIda) {
		this.expectativaVIda = expectativaVIda;
	}

	public Integer getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(Integer temperamento) {
		this.temperamento = temperamento;
	}
}
