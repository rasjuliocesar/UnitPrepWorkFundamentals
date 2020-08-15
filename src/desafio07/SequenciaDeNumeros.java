package desafio07;

import java.text.NumberFormat;

public class SequenciaDeNumeros {

	public static void main(String[] args) {

		NumberFormat form = NumberFormat.getInstance();
		
		System.out.println(form.format(calcularIntervalo(1, 50)));
	}
	
	/**
	 *  Fatorial de um número
	 * @param numero -> número para cálculo da fatorial
	 */
	private static double fatorial(int numero) {
		double fatorial = 1;
				
		while(numero > 0) {
			fatorial *= numero;
			numero--;
		}
		
		return fatorial;
	}
	
	/**
	 *  Fatorial do resultado da subtração da soma dos pares pela soma dos ímpares
	 *  de um determinado intervalo
	 * @param inicio -> número para iniciar o intervalo
	 * @param fim -> número para finalizar o intervalo
	 */
	private static double calcularIntervalo(int inicio, int fim) {
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int cont = inicio; cont <= fim;cont++) {
			if(cont % 2 == 0) {
				somaPares += cont;
			} else {
				somaImpares += cont;
			}
		}
		
		int resultado = somaPares - somaImpares;
		
		return fatorial(resultado);
	}
}
