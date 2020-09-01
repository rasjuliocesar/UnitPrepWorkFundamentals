package pilha;

public class Node<T extends Comparable<T>> {

	private Node<T> anterior;
	private Node<T> proximo;
	private T valor;
	
	public Node() {
	}
	
	public Node<T> getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Node<T> anterior) {
		this.anterior = anterior;
	}
	
	public Node<T> getProximo() {
		return proximo;
	}
	
	public void setProximo(Node<T> proximo) {
		this.proximo = proximo;
	}
	
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
}
