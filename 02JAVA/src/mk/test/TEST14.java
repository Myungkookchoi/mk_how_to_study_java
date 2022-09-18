package mk.test;

import java.util.Arrays;

import java.util.Scanner;

public class TEST14 {

	private static boolean contains1(int[] a, int i) {
		return Arrays.stream(a).anyMatch(e -> e == i);
	}

	private static boolean contains2(int[] b, int i) {
		return Arrays.stream(b).anyMatch(e -> e == i);
	}

	private static boolean contains3(int[] c, int i) {
		return Arrays.stream(c).anyMatch(e -> e == i);
	}

	public static void Q1() {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		int a = 5;
		int b = 7;
		if (input == 0) {
			a = a + 2;
			System.out.println(a + ", " + b);
		} else if (input == 1) {
			b = b + 4;
			System.out.println(a + ", " + b);
		} else if (input == 2) {
			a = a + b;
			System.out.println(a + ", " + b);
		} else {
			b = b + 5;
			System.out.println(a + ", " + b);
		}
		sc.close();
	}

	public static void Q2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력 >>");
		int a = sc.nextInt();
		int b = a / 10;
		switch (b) {
		case 10:
			System.out.println("수");
			break;
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		case 5:
			System.out.println("가");
			break;
		default:
			System.out.println("성적미달");
			break;
		}
		sc.close();

	}

	public static void Q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력(1~5) >>");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		case 4:
			System.out.println("넷");
			break;
		case 5:
			System.out.println("다섯");
			break;
		default:
			System.out.println("오류");
			break;
		}
		sc.close();

	}

	public static void Q4() {
		Scanner sc = new Scanner(System.in);
		int a[] = { 1, 3, 5, 7, 8, 10, 12 };
		int b[] = { 4, 6, 9, 11 };
		int c[] = { 2 };
		int i = sc.nextInt();
		boolean eq = contains1(a, i);
		boolean eo = contains2(b, i);
		boolean wi = contains3(c, i);
		if (eq == true) {
			System.out.println(i + "월은 31일까지 있습니다.");
		} else if (eo == true) {
			System.out.println(i + "월은 30일까지 있습니다.");
		} else if (wi == true) {
			System.out.println(i + "월은 28일까지 있습니다.");
		}
		sc.close();
	}

	public static void Q5() {
		Scanner sc = new Scanner(System.in);
		int age = Integer.parseInt(sc.nextLine());
		if (age < 8)
			System.out.println("유치원");
		else if (age >= 8 && age < 14)
			System.out.println("초등학생");
		else if (age >= 14 && age < 17)
			System.out.println("중학생");
		else if (age >= 17 && age < 20)
			System.out.println("고등학생");
		else if (age >= 20 && age < 25)
			System.out.println("대학생");
		else
			System.out.println("취준생 or 직장인");
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			Q1();
			break;
		case 2:
			Q2();
			break;
		case 3:
			Q3();
			break;
		case 4:
			Q4();
			break;
		case 5:
			Q5();
			break;
		default:
			System.out.println("Error");
			break;
		}
		sc.close();
	}
}
