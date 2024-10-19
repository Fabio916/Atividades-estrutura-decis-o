package application;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores serão inseridos? Informe: ");
		int qtValores = sc.nextInt();
		
		int qtValoresPositivos = 0;
		int qtValoresNegativos = 0;
		double menorValor = 0;
		
		for (int i = 0; i < qtValores; i++) {
			System.out.printf("%d# valor real: ", i + 1);
			double valReal = sc.nextDouble();
			if (valReal < menorValor) {
				menorValor = valReal;
			}
			if (valReal < 0) {
				qtValoresNegativos++;
			} else{
				qtValoresPositivos++;
			}
			
		}
		
		System.out.printf("Quantidade de valores reais positivos: %d\n", qtValoresPositivos);
		System.out.printf("Quantidade de valores reais negativos: %d\n", qtValoresNegativos);
		System.out.printf("Menor valor inserido: %.2f", menorValor);
		

		sc.close();
	}

}
