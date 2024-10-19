package application;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro e positivo para n: ");
		int n = sc.nextInt();

		if (n > 0) {
			double soma = 0.0;

			for (int i = 1; i <= n; i++) {
				soma += 1.0 / i;
			}

			System.out.println("A soma é: " + soma);
		} else {
			System.out.println("O valor de n deve ser um número inteiro positivo.");
		}

		sc.close();

	}

}
