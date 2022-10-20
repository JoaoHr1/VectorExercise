package application;

import java.util.Scanner;

public class Program02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos número você vai digitar? ");
		int n = sc.nextInt();
		int vect[] = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			sum = sum + vect[i];
		}
		
		
		System.out.print("Valores:");

		for (int i = 0; i < n; i++) {
			System.out.print(" " + vect[i]);		
		}
		
        int media = sum / n;
        System.out.println();
		System.out.println("Soma: " + sum);
		System.out.println("Média " + media);

		sc.close();

	}
}
