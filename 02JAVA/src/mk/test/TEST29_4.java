package mk.test;

import java.util.Scanner;

public class TEST29_4 {
	public static boolean seven(int a) {
		if (a == 0) {
			System.out.println("0입니다.");
			return false;
		} else if (a % 7 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean seven = seven(input);
		System.out.println(seven);
		sc.close();
	}
}
