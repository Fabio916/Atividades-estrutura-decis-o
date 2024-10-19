package application;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
