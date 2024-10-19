package application;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i < 101; i++) {
			if (i < 50) {
				System.out.println(i);
			} else {
				System.out.println(i++);
			}
		}
		
		sc.close();
	}

}
