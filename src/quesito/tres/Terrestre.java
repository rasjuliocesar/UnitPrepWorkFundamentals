package quesito.tres;

public class Terrestre extends MeioDeTransporte{

	private Integer qtdeRodas;
	private Double potencia;
		
	public Terrestre(Integer id, short ano, String modelo, Double carga_maxima, Integer qtdeRodas, Double potencia) {
		super(id, ano, modelo, carga_maxima);
		this.qtdeRodas = qtdeRodas;
		this.potencia = potencia;
	}

	public Integer getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(Integer qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	@Override
	public double consumo() {
		double consumo = this.getPotencia() * super.getCarga_maxima() * 100;
		return consumo;
	}
}
