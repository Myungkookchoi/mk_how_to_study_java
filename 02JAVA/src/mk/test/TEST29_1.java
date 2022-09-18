package mk.test;

import java.util.Scanner;

public class TEST29_1 {
	public static double min(double a, double b) {
		return a - b;
	}

	public static double mul(double a, double b) {
		return a * b;
	}

	public static double div(double a, double b) {
		return a / b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("숫자 입력");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 1 >>");
		double input1 = sc.nextDouble();
		System.out.println("기호 입력 >> ");
		String input2 = sc.next();
		if (input2.equals("+")) {
			System.out.println("숫자 입력 2 >>");
			double input3 = sc.nextDouble();
			double sum = sum(input1, input3);
			System.out.println(sum);
		} else if (input2.equals("-")) {
			System.out.println("숫자 입력 2 >>");
			double input3 = sc.nextDouble();
			double min = min(input1, input3);
			System.out.println(min);
		} else if (input2.equals("*")) {
			System.out.println("숫자 입력 2 >>");
			double input3 = sc.nextDouble();
			double mul = mul(input1, input3);
			System.out.println(mul);
		} else if (input2.equals("/")) {
			System.out.println("숫자 입력 2 >>");
			double input3 = sc.nextDouble();
			double div = div(input1, input3);
			System.out.println(div);
		}
		sc.close();
	}
}
