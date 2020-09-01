package pilha;

public class Pilha<T extends Comparable<T>> {
	
	private Node<T> primeiro;
	private Node<T> ultimo;
	private Integer tamanho;
	
	public Pilha() {
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
	}
	
	public Node<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Node<T> primeiro) {
		this.primeiro = primeiro;
	}

	public Node<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(Node<T> ultimo) {
		this.ultimo = ultimo;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanhoe(Integer tamanho) {
		this.tamanho = tamanho;
	}

	/**
	 * A Pilha Está Vazia?
	 * @return True ou False
	 */
	public boolean isEmpty() {
		return (this.primeiro == null);
	}
	
	/**
	 * Adicionar elemento na Pilha
	 * @param elemento
	 */
	public void push(T elemento) {
		if(isEmpty()) {
			this.primeiro = new Node<T>();
			this.ultimo = primeiro;
			Node<T> novo = new Node<T>();
			novo.setValor(elemento);
			novo.setProximo(this.primeiro);
			this.primeiro = novo;
			this.tamanho++;
		} else {
			Node<T> novo = new Node<T>();
			novo.setValor(elemento);
			novo.setProximo(this.primeiro);
			this.primeiro = novo;
			this.tamanho++;
		}
		
	}
	
	/**
	 * Retirar elemento do Topo da Pilha
	 */
	public void pop() {
		if(isEmpty()) {
			return ;
		}
		this.primeiro = primeiro.getProximo();
		this.tamanho--;
	}
	
	/**
	 * Listar dados da Pilha
	 */
	public void listar() {
		if(isEmpty()) {
			return ;
		}
		
		Node<T> aux = this.primeiro;
		
		while(aux != null) {
			System.out.println(aux.getValor());
			aux = aux.getProximo();
		}
	}
	
	/**
	 * Informar o Tamanho atual da Pilha
	 */
	public void tamanhoPilha() {
		System.out.println("Tamanho da Pilha: " + this.getTamanho());
	}
	
	/**
	 * Informar quem está no Topo da Pilha.
	 */
	public void topo() {
		if(isEmpty()) {
			System.out.println("-");
			return;
		}
		
		System.out.println(this.getPrimeiro().toString());
	}
}
