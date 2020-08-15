package desafio03;

import java.util.Scanner;

public class ManipulandoTextoI {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe uma Frase: ");
		String frase = teclado.nextLine().toLowerCase();
		
		System.out.println("A Letra A foi encontrada: " + totalDeLetras(frase) + " vezes.");
		teclado.close();
	}
	/**
	 * 
	 * @param frase Recebe uma frase informada pelo user
	 * @return Quantidade de Letra A's existentes na frase
	 */
	private static int totalDeLetras(String frase) {
		int totalA = 0;
		for(int cont = 0; cont < frase.length(); cont++) {
			if(frase.charAt(cont) == 'a') {
				totalA++;
			}
		}
		
		return totalA;
	}

}
