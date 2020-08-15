package desafio08;

import java.util.Scanner;

public class RaizSegundoGrau {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Equação do 2 Grau");
		System.out.print("Informe o valor para 'a': ");
		int a = teclado.nextInt();
		System.out.print("Informe o valor para 'b': ");
		int b = teclado.nextInt();
		System.out.print("Informe o valor para 'c': ");
		int c = teclado.nextInt();
		
		raiz(a, b, c);
		
		teclado.close();
	}

	/**
	 * Cálculo da Equação:
	 * Se Delta < 0 -> resultado indeterminado
	 * Se Delta == 0 -> único resultado
	 * Se Delta > 0 -> duas raízes reais
	 * @param a -> coeficiente da equação
	 * @param b -> coeficiente da equação
	 * @param c -> coeficiente da equação
	 */
	private static void raiz(int a, int b, int c) {
		double delta = Math.pow(b, 2) - (4*a*c);
		
		if(delta < 0) {
			System.out.println("Inderteminadas");
		} else if(delta == 0) {
			double x;
			
			x = ((-b) + Math.sqrt(delta)) / (2 * a);
			
			System.out.println("x1 = " + x);
		} else {
			double x1, x2;
			
			x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("x1 = " + x1 + "; x2 = " + x2);
		}
	}

}
