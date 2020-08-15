package desafio02;

import java.util.Scanner;

public class SequenciaI {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um numero inteiro: ");
		double n = teclado.nextInt();
		
		System.out.println(calcularValorDeA(n));
		
		teclado.close();
	}

	/**
	 * Calcular valor de A pela fórmula: 
	 * A = N + (N - 1) / 2 + (N - 2) / 3 ....Até N vezes
	 * @param n
	 */
	private static double calcularValorDeA(double n) {
		double a = 0;
		
		for(int cont = 0; cont < n; cont++) {
			a += (n - cont) / (cont + 1);
		}
		
		return a;
	}

}
