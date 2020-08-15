package desafio04;

import java.util.Scanner;

public class ManipulandoTextoII {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe uma Frase: ");
		String frase = teclado.nextLine();
		
		System.out.println("A quantidade de palavras na frase é: " + totalPalavras(frase));
		teclado.close();
	}

	private static int totalPalavras(String frase) {
		String[] quantidade = frase.split(" ");
		
		return quantidade.length;
	}

}
