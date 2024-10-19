package application;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char sexo;
		int idade;
		int contador = 0;
		int idadeMediaPessoas = 0;
		double salarioHomens = 0;
		double salarioMulheres = 0;
		int contMulheres = 0;
		int contHomens = 0;
		int idades = 0;
		double mediaIdade = 0;
		double mediaSalarioHomens = 0;
		double totalSalarioHomens = 0;
		
		while (contador != 1) {
			System.out.print("Informe a idade: ");
			idade = sc.nextInt();
			
			if (idade < 0) {
				contador++;
			} 
			else {
				System.out.print("Digite o sexo da pessoa (M/F): ");
				sexo = sc.next().toUpperCase().charAt(0);
				
				while (sexo != 'M' && sexo != 'F') {
					System.out.println("Digito inválido, por favor escolha (M/F): ");
					sexo = sc.next().toUpperCase().charAt(0);
				}
				
				if (sexo == 'M') {
					System.out.print("Digite o salário: ");
					salarioHomens += sc.nextDouble();
					contHomens++;
					totalSalarioHomens += salarioHomens;
				} else {
					System.out.print("Digite o salário: ");
					salarioMulheres = sc.nextDouble();
					if (salarioMulheres < 600) {
						contMulheres++;
					}
				}
				idadeMediaPessoas++;
				idades += idade;
			}
		}
		mediaIdade = idades / idadeMediaPessoas;
		mediaSalarioHomens = totalSalarioHomens / contHomens;
		System.out.printf("Média da idades das pessoas: %.0f\n", mediaIdade);
		System.out.printf("Média de salário dos homens: R$ %.2f\n", mediaSalarioHomens);
		System.out.printf("Quantidade de mulheres que recebem menos de 600 reais: %d\n", contMulheres);
		System.out.println("Fim do programa!");

		sc.close();
	}

}
