package application;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de valores a inserir: ");
		int nValores = sc.nextInt();
		
		double soma = 0;
		for (int i = 0; i < nValores; i++) {
			System.out.printf("%d# Valor: ", i + 1);
			soma += sc.nextDouble();
		}
		
		double media = soma / nValores;
		
		System.out.printf("Média dos valores inseridos: %.1f", media);
			
		sc.close();
	}

}
