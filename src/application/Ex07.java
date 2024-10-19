package application;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int condition = 1;
		int nMulheres = 0;
		int nHomens = 0;
		double alturaMulheres = 0;
		double alturaHomens = 0;
		
		System.out.print("Digite 0 para encerrar o programa ou 1 para começar: ");
		int inicio = sc.nextInt();
		
		while (inicio != 0 || inicio != 1) {
			System.out.print("Valor inválido! Por favor insira um valor correspondente: ");
			inicio = sc.nextInt();
		}
		
		System.out.print("Pessoas a serem analisadas: ");
		int numeroPessoas = sc.nextInt();
		
		while (numeroPessoas != 0) {
			System.out.printf("Sexo da %d# pessoa: (M ou F)", condition);
			char sexo = sc.next().toUpperCase().charAt(0);
			condition++;

			System.out.print("Altura da pessoa informada: \n");
			double altura = sc.nextDouble();

			if (sexo == 'F') {
				alturaMulheres += altura;
				nMulheres++;
			} else if (sexo == 'M') {
				alturaHomens += altura;
				nHomens++;
			} else {
				System.out.println("erro");
			}
			numeroPessoas--;
		}
		
		double mediaHomens = alturaHomens / nHomens;
		double mediaMulheres = alturaMulheres / nMulheres;
		
		System.out.printf("\nAltura média das mulheres: %.2f\n", mediaMulheres);
		System.out.printf("Altura média dos homens: %.2f", mediaHomens);
		
		System.out.println();

		sc.close();
	}

}
