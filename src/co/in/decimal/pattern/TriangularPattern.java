package co.in.decimal.pattern;

import java.util.Scanner;

public class TriangularPattern {

	private static void trinagle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void triangle1(int n) {
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}
	}

	private static void triangle2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1, k = i; j <= i; j++, k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		triangle1(n);
		scanner.close();
	}

}
