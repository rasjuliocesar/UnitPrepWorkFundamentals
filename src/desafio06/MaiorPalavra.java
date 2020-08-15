package desafio06;

import java.util.Scanner;

public class MaiorPalavra {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe uma Frase: ");
		String frase = teclado.nextLine();
		
		System.out.println("A Maior palavra da Frase é: " + maiorPalavra(frase));
		teclado.close();
	}
	
	/**
	 * 
	 * @param Recebe uma frase pelo user
	 * @return A maior palavra da frase
	 */
	private static String maiorPalavra(String frase) {
		String[] vetor = frase.split(" ");
		int maior = 0;
		String palavra = null;
		
		for(int cont = 0; cont < vetor.length; cont++) {
			if(vetor[cont].length() > maior) {
				maior = vetor[cont].length();
				palavra = vetor[cont];
			}
		}
		return palavra;
	}

}
