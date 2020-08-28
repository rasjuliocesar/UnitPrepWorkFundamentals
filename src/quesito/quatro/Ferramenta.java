package quesito.quatro;

public class Ferramenta extends ItemDeLoja {

	private String categoria;
	private Integer serial;
	
	public Ferramenta() {
	}

	public Ferramenta(String categoria, Integer serial) {
		super();
		this.categoria = categoria;
		this.serial = serial;
	}

	public Ferramenta(Integer codigoDoItem, String nomeDoItem, String descricaoDoItem, Double valorDoItem,
			String categoria, Integer serial) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.categoria = categoria;
		this.serial = serial;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	
	@Override
	public Integer getIdentificador() {
		return this.getSerial();
	}
	
	public void separar() {
		this.setCategoria("Outros");
	}
	
	public void separar(String valor) {
		this.setCategoria(valor);
	}
}
