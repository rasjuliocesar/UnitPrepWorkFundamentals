package desafio01;

import java.text.NumberFormat;

public class RainhaEOMonge {

	public static void main(String[] args) {
		
		pagamento();
	}
	
	/**
	 * Cálculo Pagamento em grãos de Trigo x Tabuleiro de Xadrez com 64 casas
	 * A primeira casa recebe 1 grão, e os demais a quantidade em dobro
	 * da casa anterior.
	 */
	public static void pagamento() {
		NumberFormat numero = NumberFormat.getInstance();
		
		double quantidade = 1;
		double soma = 1;
		
		for(int casa = 1; casa <= 64; casa++) {
			System.out.println("Casa: " + casa + " - Qtd: " + numero.format(quantidade) + " - Soma: " + numero.format(soma));
			quantidade *= 2;
			soma += quantidade;
		}
	}

}
