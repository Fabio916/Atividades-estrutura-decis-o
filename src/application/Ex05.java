package application;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero de valores: ");
		int n = sc.nextInt();

		int contador = 0;
		double maiorValor = 0;
		double soma = 0;

		while (contador != n) {
			if (n <= 0) {
				break;
			}
			contador++;
			System.out.printf("Digite o %d# número: ", contador);
			double num = sc.nextDouble();
			soma += num;
			if (num > maiorValor) {
				maiorValor = num;
			}

		}
		if (contador > 0) {
			double media = soma / contador;
			System.out.printf("\nMédia dos números informados: %.1f\n", media);
			System.out.printf("Maior número inserido: %.1f", maiorValor);
		} else {
			System.out.println("Nenhum valor positivo foi inserido.");
		}

		sc.close();

	}
}
