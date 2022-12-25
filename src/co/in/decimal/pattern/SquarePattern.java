package co.in.decimal.pattern;

import java.util.Scanner;

public class SquarePattern {
	private static void square(int n) {
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

	private static void square1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
	}

	private static void square2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		square2(n);
		scanner.close();
	}

}
