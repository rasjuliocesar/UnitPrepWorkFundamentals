package desafio05;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um n�mero para representar a s�ria de Fibonacci: ");
		int numero = teclado.nextInt();
		
		fibonacci(numero);
		
		teclado.close();
	}

	/**
	 * Calcular S�rie de Fibonacci
	 * @param numero -> informado pelo user para determinar a quantidade de termos da s�rie
	 */
	private static void fibonacci(int numero) {
		int numeroInicial= 0;
		int proximoNumero = 1;
		int somaNumeros;
		
		System.out.print(proximoNumero + " ");
		
		for(int cont = 0; cont < numero - 1; cont++) {
			somaNumeros = numeroInicial + proximoNumero;
			numeroInicial = proximoNumero;
			proximoNumero = somaNumeros;
			
			System.out.print(somaNumeros + " ");	
		}
		
	}

}
