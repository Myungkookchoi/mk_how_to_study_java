package mk.alone.study;

import java.util.Scanner;

public class MyClass03 {
	public static void Q1() {
		Scanner sc = new Scanner(System.in);
		int a = 11;
		int b = 14;
		int input = sc.nextInt();
		if (input == 0) {
			a = 5;
		} else {
			b = a + 3;
		}
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

	public static void Q2() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input < 0) {
			System.out.println(input * -1);
		} else {
			System.out.println(input);
		}
		sc.close();
	}

	public static void Q3() {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		if (126 % input == 0) {
			System.out.println("126의 약수입니다.");
		} else {
			System.out.println("126의 약수가 아닙니다.");
		}
		sc.close();
	}

	public static void Q4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어");
		double a = Integer.parseInt(sc.nextLine());
		System.out.println("영어");
		double b = Integer.parseInt(sc.nextLine());
		System.out.println("수학");
		double c = Integer.parseInt(sc.nextLine());
		double d = (a + b + c) / 3;
		if (d > 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		sc.close();
	}

	public static void Q5() {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		if (x <= 5) {
			System.out.println(x + 15);
		} else {
			System.out.println(x + 5);
		}
		sc.close();
	}

	public static void main(String[] args) {
		Q1();
		Q2();
		Q3();
		Q4();
		Q5();
	}
}