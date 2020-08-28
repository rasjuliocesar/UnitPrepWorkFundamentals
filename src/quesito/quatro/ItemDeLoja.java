package quesito.quatro;

public class ItemDeLoja {

	private Integer codigoDoItem;
	private String nomeDoItem;
	private String descricaoDoItem;
	private Double valorDoItem;
	
	public ItemDeLoja() {
	}

	public ItemDeLoja(Integer codigoDoItem, String nomeDoItem, String descricaoDoItem, Double valorDoItem) {
		this.codigoDoItem = codigoDoItem;
		this.nomeDoItem = nomeDoItem;
		this.descricaoDoItem = descricaoDoItem;
		this.valorDoItem = valorDoItem;
	}

	public Integer getCodigoDoItem() {
		return codigoDoItem;
	}

	public void setCodigoDoItem(Integer codigoDoItem) {
		this.codigoDoItem = codigoDoItem;
	}

	public String getNomeDoItem() {
		return nomeDoItem;
	}

	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}

	public String getDescricaoDoItem() {
		return descricaoDoItem;
	}

	public void setDescricaoDoItem(String descricaoDoItem) {
		this.descricaoDoItem = descricaoDoItem;
	}

	public Double getValorDoItem() {
		return valorDoItem;
	}

	public void setValorDoItem(Double valorDoItem) {
		this.valorDoItem = valorDoItem;
	}
	
	public Integer getIdentificador() {
		return this.getCodigoDoItem();
	}
}
