package calculadorapack;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Digite a operação: \n"
					+ "1 - adição de dois valores inteiros\n"
					+ "2 - Subtração\n"
					+ "3 - Multiplicação\n"
					+ "4 - Divisão\n"
					+ "5 - Exponenciação\n"
					+ "6 - Fatorial\n"
					+ "7 - adição de três valores\n"
					+ "8 - adição de dois valores texto\n");

			int tipo = teclado.nextInt();
			System.out.println("Digite o valor 1");
			int valor1 = teclado.nextInt();
			int valor2 = 0;
			if (tipo != 6) {
				System.out.println("Digite o valor 2:");
				valor2 = teclado.nextInt();
			}

			// Processamento e saida
			operacoes operacao = new operacoes();
			switch (tipo) {
				// passagem de parametros retornando por função
				case 1:
					System.out.println("Adicão 2 valores inteiros=" + operacao.soma(valor1, valor2));
					break;
				// passagem por método e retornando por função
				case 2:
					operacao.setMinuendo(valor1);
					operacao.setSubtraendo(valor2);
					System.out.println("Subtração=" + operacao.subtracao());
					break;
				case 3:
					operacao.setNumeroGenerico1(valor1);
					operacao.setNumeroGenerico2(valor2);
					System.out.println("Multiplicacão=" + operacao.multiplicacao());
					break;
				case 4:
					operacao.setNumeroGenerico1(valor1);
					operacao.setNumeroGenerico2(valor2);
					System.out.println("Divisão=" + operacao.divisao());
					break;
				case 5:
					operacao.setNumeroGenerico1(valor1);
					operacao.setNumeroGenerico2(valor2);
					System.out.println("Exponenciacao="+operacao.exponenciacao());
					break;
				// passagem por método e retornando por função
				case 6:
					operacao.setFatorial(valor1);
					System.out.println("Fatorial=" + operacao.getFatorial());
					break;
				// sobrecarga sona
				case 7:
					System.out.println("adicão 3 valores=" + operacao.soma(valor1, valor2, 78));
					break;
				case 8:
					System.out.println(
							"adição 2 valores textos=" + operacao.soma(Integer.toString(valor1), Integer.toString(valor2)));
					break;
				default:
					System.out.println("operação inválida!");

			}
		}

	}
	
}
