package mk.test;

import java.util.Scanner;

public class TEST29_5 {
	public static void a(String x) {
		System.out.println(x);
	}

	public static int a(int a, String x) {
		for (int i = 0; i < a; i++) {
			a(x);
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력 >>");
		String input1 = sc.next();
		System.out.println("횟수 입력 >>");
		int input2 = sc.nextInt();
		a(input2, input1);
		sc.close();
	}
}
