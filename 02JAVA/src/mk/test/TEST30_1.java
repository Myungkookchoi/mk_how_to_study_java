package mk.test;

import java.util.Scanner;

public class TEST30_1 {
	public static void triangle1() {
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void triangle2() {
		for (int i = 1; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void triangle3() {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		switch (input) {
		case 1:
			triangle1();
			break;
		case 2:
			triangle2();
			break;
		case 3:
			triangle3();
			break;
		}
	}
}
