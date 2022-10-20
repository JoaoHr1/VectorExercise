package application;

import java.util.Scanner;

import entities.Rent;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rent[] vector = new Rent[10];

		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			vector[roomNumber] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vector[i] != null) {
				System.out.println(i + ": " + vector[i]);
			}
		}

		sc.close();

	}

}
