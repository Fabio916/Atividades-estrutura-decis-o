package application;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		
		System.out.print("Número de alunos: ");
		int alunos = sc.nextInt();
		int alunosAprovados = 0;
		double soma = 0;
		for (int i = 0; i < alunos; i++) {
			double notas = random.nextDouble(10.0);
			soma += notas;
			if (notas >= 6) {
				alunosAprovados++;
			}else {
				
			}
		}
		
		double media = soma / alunos;
		
		System.out.printf("Média das notas: %.2f\n", media);
		System.out.print("Quantidade de alunos aprovados: " + alunosAprovados);
		
		
		sc.close();
	}

}
